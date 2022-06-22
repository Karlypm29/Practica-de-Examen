package com.practica01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Usuario
 */
@Controller
@Slf4j
public class indexcontroller {

    @GetMapping("/")
    public String Inicio(Model model) {
        log.info("Ahora utilizamos MVC");

//        var clientes = clienteService.getClientes();
//        model.addAttribute("clientes", clientes);

        return "index";
    }
}
