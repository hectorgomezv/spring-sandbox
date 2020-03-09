package com.ocarballo;

import com.ocarballo.domain.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        UserService service = context.getBean("userService", UserService.class);
        System.out.println(service.getUsers());
    }
}
