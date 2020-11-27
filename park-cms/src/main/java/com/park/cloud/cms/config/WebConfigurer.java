package com.park.cloud.cms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @author qianxiang
 * @createDate 2020/11/23
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 若改动之，则需同时改动被OpmPeccancyParkServiceImpl的mapping域
        registry.addResourceHandler("/opmPeccancyPark/peccPhoto/**").addResourceLocations("file:" + System.getProperty("user.dir") + "/../resource/opmPeccancyPark/peccPhoto/");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true)
                .allowedOrigins("*");
    }

}
