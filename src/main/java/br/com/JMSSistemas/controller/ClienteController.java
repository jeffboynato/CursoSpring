package br.com.JMSSistemas.controller;

import br.com.JMSSistemas.domain.Cliente;
import br.com.JMSSistemas.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("cliente")
@Log4j2
@AllArgsConstructor
public class ClienteController {
    private DateUtil dateUtil;

    //localhost:8080/cliente/list
    @GetMapping(path = "list")
    public List<Cliente> list(){
    	log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return asList (new Cliente("Jefersson"), new Cliente(" & Tina"));
    }

}
