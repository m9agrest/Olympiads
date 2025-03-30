package com.example.olympiads.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("registration")
    public String registration(){
        //если есть сессия, редиректим на основную страницу
        return null;
    }
    @PostMapping("registration")
    public String registrationPost(){
        //если есть сессия, редиректим на основную страницу
        return null;
    }

    @GetMapping("login")
    public String login(){
        //если есть сессия, редиректим на основную страницу
        return null;
    }
    @PostMapping("login")
    public String loginPost(){
        //если есть сессия, редиректим на основную страницу
        //проверяем логин и пароль и редеректим на ошибку или на основную страницу, зависит от результата проверки
        return null;
    }

    @GetMapping("logout")
    public String logout(){
        //сброс сессии
        return null;
    }
    
    @GetMapping("edit")
    public String edit(){
        //проверка на пользователя или администратора
        return null;
    }
    @PostMapping("edit")
    public String editPost(){
        //проверка на пользователя или администратора
        return null;
    }

    @GetMapping("user")
    public String user(){
        return null;
    }
}
