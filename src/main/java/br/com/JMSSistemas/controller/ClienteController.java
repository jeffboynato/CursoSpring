package br.com.JMSSistemas.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.JMSSistemas.domain.Cliente;
import br.com.JMSSistemas.service.ClienteService;
import br.com.JMSSistemas.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("clientes")
@Log4j2
@AllArgsConstructor
public class ClienteController {
    private DateUtil dateUtil;
    private ClienteService clienteService;
    
    @GetMapping
    public ResponseEntity<List<Cliente>> list(){
    	log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(clienteService.listAll(), HttpStatus.OK);
    }
    
    @GetMapping(path = "/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable long id){
    	return ResponseEntity.ok(clienteService.findById(id));
    }

}
