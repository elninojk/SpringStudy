package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jeril on 2015/04/21.
 */
public class SpringKickStarter
{
    public static void main(String[] args)
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        Shape shape = (Shape) ctx.getBean("shape");
        shape.draw();

        Shape shape1 = (Shape) ctx.getBean("shape1");
        shape1.draw();
    }
}
