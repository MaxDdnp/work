package com.skillsup.homeWork3;

import com.skillsup.service.implem.JavaContactService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Валерия on 13.03.2015.
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext.xml");
        JavaContactService service = context.getBean(JavaContactService.class);
    }
}
