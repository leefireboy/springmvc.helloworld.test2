/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.test;

import java.util.Properties;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;

import springmvc.helloworld.test.HelloController;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月19日下午11:59:21
 */
public class TestCase {

    @Ignore
    @Test
    public void testHandlerMapping() {
        String conf = "spring-mvc.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        HandlerMapping hm = ac.getBean("handlerMapping", HandlerMapping.class);
        Properties prop = ac.getBean("urlMappings", Properties.class);
        System.out.println(hm);
        System.out.println(prop);

        AbstractApplicationContext aac = (AbstractApplicationContext) ac;
        aac.close();
    }

    @Ignore
    @Test
    public void testHelloController() {
        String conf = "spring-mvc.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        HelloController hc = ac.getBean("helloController", HelloController.class);
        System.out.println(hc);

        AbstractApplicationContext aac = (AbstractApplicationContext) ac;
        aac.close();
    }

    @Ignore
    @Test
    public void testViewResolver() {
        String conf = "spring-mvc.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        ViewResolver vr = ac.getBean("viewResolver", ViewResolver.class);
        System.out.println(vr);

        AbstractApplicationContext aac = (AbstractApplicationContext) ac;
        aac.close();
    }

}

