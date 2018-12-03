package com.chinaunicom.shanghai.hello.spring.cloud.web.admin.feign.service;

import com.chinaunicom.shanghai.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


//fallback 指定熔断器的回掉方法
//value = hello-spring-cloud-service-admin 服务者
@FeignClient(value = "hello-spring-cloud-service-admin" , fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);

}
