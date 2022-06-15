package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    //atributos
    NotificationService notificacion;

    //contructor
    public UserService(NotificationService notificacion){
        System.out.println("Este es el constructor de UserService");
        this.notificacion = notificacion;
    }
}
