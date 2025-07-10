package com.example.demo.Service;

import com.example.demo.Model.Produto;
import com.example.demo.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto salvarProduto(Produto produto) {
        // Regra de exemplo: preço mínimo de R$ 1,00
        if (produto.getPreco() > 1.0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        return produtoRepository.save(produto);
    }
}