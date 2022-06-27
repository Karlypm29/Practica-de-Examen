package com.practica01.controller;

import com.practica01.domain.Cliente;
import com.practica01.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Usuario
 */
@Controller
@Slf4j
public class indexcontroller {
    @Autowired
    private ClienteService clienteService;
    @GetMapping("/")
    public String Inicio(Model model) {
        log.info("Ahora utilizamos MVC");
        
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes", clientes);

//        var clientes = clienteService.getClientes();
//        model.addAttribute("clientes", clientes);

        return "index";
    }
    
    @GetMapping("/nuevoEstado")
    public String nuevoEstado(Cliente cliente){
        return "modificarEstado";
    }
    
    @PostMapping("/guardarEstado")
    public String guardarEstado(Cliente cliente){
        clienteService.save(cliente);
        return "redirect:/";
    }
    
    @GetMapping("/modificarEstado/{idEstado}")
    public String modificarEstado(Cliente cliente, Model model){
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "modificarEstado";
    }
    
    @GetMapping("/eliminarEstado/{idEstado}")
    public String eliminarEstado(Cliente cliente){
        clienteService.delete(cliente);
        return "redirect:/";
    }
}
