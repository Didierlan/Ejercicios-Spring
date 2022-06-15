package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    //constructor
    public NotificationService(){
        System.out.println("Este es el constructor de la clase NotificationService");
    }

    //Metodo
    public String imprimirSaludo(){
        return "Hola como esta";
    }
}
