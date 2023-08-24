package br.com.fiap.stocker.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.stocker.model.Produto;
import br.com.fiap.stocker.model.TipoProduto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProdutoController {
    
    //@GetMapping("/produto")
    //public Produto ListAll() {
     //   Produto produto = new Produto();
     // return produto;
   //}
    
    @GetMapping("/produto")
    public Produto ListAll() {
        TipoProduto tipo = new TipoProduto();
        tipo.setId(0);
        tipo.setNome("a");
        return new Produto(0,"",0,0,"",tipo);
   }
}
