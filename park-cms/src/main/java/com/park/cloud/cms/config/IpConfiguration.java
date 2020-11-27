package com.park.cloud.cms.config;

import lombok.SneakyThrows;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;


/**
 * @author qianxiang
 * @createDate 2020/11/23
 */
@Component
public class IpConfiguration implements ApplicationListener<WebServerInitializedEvent> {

    private String IPAddress;

    private int serverPort;

    @SneakyThrows
    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        serverPort = event.getWebServer().getPort();
        IPAddress = InetAddress.getLocalHost().getHostAddress();
    }

    public int getPort() {
        return serverPort;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public String getAddress() {
        return "http://" + getIPAddress() + ":" + getPort();
    }
}