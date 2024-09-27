package com.facens.atividade2.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.facens.atividade2.models.CategoriaProduto;
import com.facens.atividade2.models.Produto;

public interface CategoriaProdutoRepository extends JpaRepository<CategoriaProduto, Integer> {

    List<CategoriaProduto> findByNomeStartingWith(String prefixo);
    
    @Query("select p from Produto p where p.produtoCategoria.id = :id")
    List<Produto> findProdutosByCategoriaId(@Param("id") Long id);
    }

