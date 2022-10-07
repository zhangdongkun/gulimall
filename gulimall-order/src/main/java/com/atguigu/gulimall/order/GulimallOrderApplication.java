package com.atguigu.gulimall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;

/***
 *
 *    <nacos.version>2.2.1.RELEASE</nacos.version> nacos client 是1.x 没有走grpc 下面逻辑是 http的 没走gprc--------------
 *
 * org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration#bind(org.springframework.boot.web.context.WebServerInitializedEvent) --->
 *
 * org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration#start()
 *
 * --->
 * com.alibaba.cloud.nacos.registry.NacosAutoServiceRegistration#register()
 * NacosNamingservice --> this.namingService.registerInstance(serviceId, group, instance);
 * --/nacos/v1/ns/instance
 *
 *
 * {
 *     "clusterName": "DEFAULT",
 *     "enabled": true,
 *     "ephemeral": true,
 *     "healthy": true,
 *     "instanceHeartBeatInterval": 5000,
 *     "instanceHeartBeatTimeOut": 15000,
 *     "ip": "192.168.184.1",
 *     "ipDeleteTimeout": 30000,
 *     "metadata": {
 *         "preserved.register.source": "SPRING_CLOUD"
 *     },
 *     "port": 8003,
 *     "weight": 1
 * }
 *
 * com.alibaba.nacos.client.naming.net.NamingProxy#reqAPI(java.lang.String, java.util.Map, java.lang.String, java.util.List, java.lang.String)
 *
 * com.alibaba.nacos.client.naming.net.NamingProxy#callServer(java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String)
 *
 *--------------以上为1.x 逻辑-----------------------------------
 */
@SpringBootApplication
@EnableDiscoveryClient
/**
 *
 * ---https://www.cnblogs.com/wuzhenzhao/p/13680807.html
 * org.springframework.cloud.openfeign.FeignClientsRegistrar#registerFeignClient(org.springframework.beans.factory.support.BeanDefinitionRegistry, org.springframework.core.type.AnnotationMetadata, java.util.Map)
 *
 * 	BeanDefinitionBuilder definition = BeanDefinitionBuilder
 * 				.genericBeanDefinition(FeignClientFactoryBean.class);
 *
 *
 * FeignClientFactoryBean.getObject：
 * 　　getObject调用的是getTarget方法，它从applicationContext取出FeignContext，FeignContext继承了NamedContextFactory，它是用来统一维护feign中各个feign客户端相互隔离的上下文。
 *
 * 　　FeignContext注册到容器是在FeignAutoConfiguration上完成的。
 *
 *
 */
@EnableFeignClients("com.atguigu.gulimall.order.feign")
public class GulimallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallOrderApplication.class, args);
    }

}
