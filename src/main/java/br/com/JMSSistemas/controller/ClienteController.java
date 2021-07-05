package br.com.JMSSistemas.controller;

import br.com.JMSSistemas.domain.Cliente;
import br.com.JMSSistemas.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    private DateUtil dateUtil;
    //localhost:8080/cliente/list
    @GetMapping(path = "list")
    public List<Cliente> list() {
        return asList (new Cliente("Jefersson"), new Cliente("Tina"));
    }
}
