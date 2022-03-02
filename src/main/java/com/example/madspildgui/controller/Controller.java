package com.example.madspildgui.controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String portifolio(){
        return "frontPage";
    }
    @GetMapping("/tips")
    public String tips() {
        return "tipsOgTricks";
    }
    @GetMapping("/links")
    public String links(){
        return "nyttigeLinks";
    }
}
