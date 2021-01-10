package com.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Order;

//TRAZ IMPLEMENTACOES PARA BUSCAR, SALVAR, DELETAR E ATUALIZAR DADOS COFORME A ENTIDADE QUE PRECISA(ORDER, TIPO DA CHAVE)
public interface OrderRepository extends JpaRepository<Order,Long>{

}
