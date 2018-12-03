package com.chinaunicom.shanghai.hello.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @ClassName ZipKinApplication
 * @Description ZipKin 的启动主程序
 * @Author jianwei_peng
 * @Date 2018/11/29 上午11:34
 * @Version 1.0
 **/

@EnableZipkinServer
@EnableEurekaClient
@SpringBootApplication
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class, args);
    }

}
