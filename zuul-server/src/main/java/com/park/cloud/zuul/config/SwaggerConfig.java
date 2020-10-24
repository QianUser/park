package com.park.cloud.zuul.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@EnableSwagger2
@Configuration
@Primary
@Slf4j
@ConditionalOnProperty(name = "swagger.enabled", havingValue = "true")
public class SwaggerConfig implements SwaggerResourcesProvider {

    @Autowired
    RouteLocator routeLocator;

    @Override
    public List<SwaggerResource> get() {
        //利用routeLocator动态引入微服务
        List<SwaggerResource> resources = new ArrayList<>();
        List<String> locationList = new ArrayList<>();
        routeLocator.getRoutes().forEach(route -> {
            //避免网关定义的转发和上线服务冲突
            if (locationList.contains(route.getLocation())) {
                return;
            } else {
                locationList.add(route.getLocation());
            }
            log.info("**************************************");
            log.info("*****name={},fullPath={},Location={},pre={},ret={}"
                    , route.getId(), route.getFullPath(), route.getLocation(), route.getPrefix(), route.getRetryable());
            //动态获取
            resources.add(swaggerResource(route.getId(), route.getFullPath().replace("**", "v2/api-docs"), "1.0"));
        });
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}