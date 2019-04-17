package com.demo.springclouddemo.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: SJH
 * @ClassName: HelloRemote
 * @Description:
 */
//在HelloRemote类添加指定fallback类，在服务熔断的时候返回fallback类中的内容。
@FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)/*name:远程服务名，及spring.application.name配置的名称*/
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
