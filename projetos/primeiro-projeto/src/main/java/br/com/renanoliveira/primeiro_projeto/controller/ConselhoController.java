package br.com.renanoliveira.primeiro_projeto.controller;

import br.com.renanoliveira.primeiro_projeto.model.Conselho;
import br.com.renanoliveira.primeiro_projeto.service.ConselhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller para transitar requisições HTTP dos conselhos para client
@RestController
@RequestMapping("/api/conselhos")
public class ConselhoController {

    @Autowired
    private ConselhoService conselhoService;

    @GetMapping("/aleatorio")
    public Conselho getConselhoAleatorio(){
        return conselhoService.getConselhoAleatorio();
    }

}
