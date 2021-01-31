package br.com.projetoVerao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Equipe Senac
 */
@Controller
public class HomeController {

    @GetMapping("/home") 
    public String home() {
        return "/home";
    }

}
