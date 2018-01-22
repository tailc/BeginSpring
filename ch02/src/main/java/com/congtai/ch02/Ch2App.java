package com.congtai.ch02;

import com.congtai.ch02.config.Ch2Config;
import com.congtai.ch02.domain.Foo;
import com.congtai.ch02.enviroment.Ch2Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.Collections;

public class Ch2App {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Ch2Config.class);
//        AccountService accountService = ctx.getBean(AccountService.class);
//
//        accountService.transferMoney(1, 2, 50);
        //        MutablePropertySources propertySources = environment.getPropertySources();
//        propertySources.addLast(new MapPropertySource("mapSource",
//                Collections.singletonMap("name", "myfoo")));

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Ch2Config.class);

        ConfigurableEnvironment environment = ctx.getEnvironment();
        environment.setActiveProfiles("dev");



        MutablePropertySources propertySources = environment.getPropertySources();
        propertySources.addLast(new MapPropertySource("mapSource",
                Collections.singletonMap("name", (Object)"my foo")));

        ctx.refresh();
        Foo bean = ctx.getBean(Foo.class);
        System.out.println(bean.getName());

    }
}
