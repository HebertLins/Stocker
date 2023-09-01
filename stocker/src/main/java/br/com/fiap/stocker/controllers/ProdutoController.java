package br.com.fiap.stocker.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.stocker.model.Produto;
import br.com.fiap.stocker.model.TipoProduto;

import java.util.List;
import java.util.Locale.Category;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProdutoController {

  Logger log = LoggerFactory.getLogger(getClass());
    
  List<Produto> produtos = new ArrayList<>();

  @GetMapping("/produto")
  public List<Produto> ListAll() {
      return produtos;
  }
    
   @PostMapping("/produto")
   public ResponseEntity<Produto> insert(@RequestBody Produto produto){
      log.info("cadastrando produto - " + produto);
      produtos.add(produto);
      return ResponseEntity.status(HttpStatus.CREATED).body(produto);
  }

   @GetMapping("/produto/{id}")
   public ResponseEntity<Produto> ListById(@PathVariable int id){
      log.info("Mostrar produto com id " + id);
      var produtoEncontrado = produtos
      .stream()
      .filter( (produto) -> produto.getId() == id)
      .findFirst()
      .get();

      if (produtoEncontrado.isEmpty()){
          return ResponseEntity.notFound().build();
      }else{

      }

      return produtoEncontrado.get();
  }

  @DeleteMapping("/produto/{id}")
  public void DeleteById(@PathVariable int id){
    log.info("deletando o produto com id" + id);
  }

}