package com.facens.atividade2.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String nome;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "produtoCategoria_id")
    @JsonBackReference
    private CategoriaProduto produtoCategoria;

    public Produto(String nome, Double preco, CategoriaProduto produtoCategoria) {
        this.nome = nome;
        this.preco = preco;
        this.produtoCategoria = produtoCategoria;
    }
    public Produto(Long id, String nome, Double preco, CategoriaProduto produtoCategoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.produtoCategoria = produtoCategoria;
    }
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public CategoriaProduto getProdutoCategoria() {
        return produtoCategoria;
    }
    public void setProdutoCategoria(CategoriaProduto produtoCategoria) {
        this.produtoCategoria = produtoCategoria;
    }
    
}
