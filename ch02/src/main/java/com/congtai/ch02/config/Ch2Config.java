package com.congtai.ch02.config;

import com.congtai.ch02.domain.Foo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.congtai.ch02")
public class Ch2Config {

    @Bean
    @Profile("dev")
    public Foo devFoo(@Value("${name}") String name) {
        Foo foo = new Foo();
        foo.setName("dev " + name);
        return foo;
    }
    @Bean
    @Profile("prod")
    public Foo prodFoo(@Value("${name}") String name) {
        Foo foo = new Foo();
        foo.setName("prod " + name);
        return foo;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
