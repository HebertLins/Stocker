package br.com.fiap.stocker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.stocker.model.Produto;
import br.com.fiap.stocker.model.TipoProduto;
import br.com.fiap.stocker.model.Usuario;


@RestController
public class UsuarioController {
    

    @GetMapping("/usuario")
    public Usuario ListAll() {
        return new Usuario(0,"a","a","a","a");
   }
}
