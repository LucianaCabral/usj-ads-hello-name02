package br.edu.usj.ads.lgll.helloname;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloName {
    @PostMapping(value="helloName")
    public ModelAndView postHellodName(@RequestParam String nome) {
        ModelAndView modelAndView = new ModelAndView("hello-name"); 

        modelAndView.addObject("mensagem", nome);
        return modelAndView;
    }
    
    
}
