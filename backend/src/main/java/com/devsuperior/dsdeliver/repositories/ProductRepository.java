package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Product;
//TRAZ IMPLEMENTACOES PARA BUSCAR, SALVAR, DELETAR E ATUALIZAR DADOS COFORME A ENTIDADE QUE PRECISA(PRODUCT, TIPO DA CHAVE)
public interface ProductRepository extends JpaRepository<Product,Long>{

	//Para retornar os produtos ordenados por nome
	List<Product> findAllByOrderByNameAsc();
	
}
