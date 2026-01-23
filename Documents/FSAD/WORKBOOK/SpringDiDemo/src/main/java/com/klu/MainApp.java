package com.klu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = context.getBean("car", Car.class);
        car.drive();

        Bike bike = context.getBean("bike", Bike.class);
        bike.ride();

        context.close();
    }
}