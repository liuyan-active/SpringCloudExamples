package io.ymq.example.feign.consumer.hystrix;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<HomeClient> {

    @Override
    public HomeClient create(Throwable throwable) {

        return () -> "Feign + hystrix ,提供者服务挂了";
    }

}
