package com.estudosspringboot.produtosapi.controller;

import com.estudosspringboot.produtosapi.model.Produto;
import com.estudosspringboot.produtosapi.repository.ProdutosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutosRepository produtosRepository;

    public ProdutoController(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido" + produto);

        // Gerando ID universal através do UUID
        var id = UUID.randomUUID().toString();

        // Settando o ID do meu produto com o ID gerado pelo UUID
        produto.setId(id);
        produtosRepository.save(produto);

        return produto;
    }

    @GetMapping("{id}")
    public Produto obterPorId(@PathVariable("id") String id){

        // Optional = se eu não tiver um ID existente é atribuido null a minha variáve, caso contrário atribua o ID existente
        Optional<Produto> produto = produtosRepository.findById(id);
        return produtosRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") String id){
        produtosRepository.deleteById(id);

    }

    @PutMapping("{id}")
    public void alterar(@PathVariable("id") String id, @RequestBody Produto produto){
        produto.setId(id);
        produtosRepository.save(produto);
    }

    @GetMapping
    public List<Produto> obterProdutos(@RequestParam("nome") String nome){
        return produtosRepository.findByNome(nome);
    }


}
