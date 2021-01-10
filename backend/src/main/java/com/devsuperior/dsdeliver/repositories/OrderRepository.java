package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsdeliver.entities.Order;

//TRAZ IMPLEMENTACOES PARA BUSCAR, SALVAR, DELETAR E ATUALIZAR DADOS COFORME A ENTIDADE QUE PRECISA(ORDER, TIPO DA CHAVE)
public interface OrderRepository extends JpaRepository<Order,Long>{

	// método para retornar só os pediso pendentes, ordenado por moment
	@Query("SELeCT DISTINCT obj FROM Order obj JOIN FETCH obj.products "+
	"WHERE obj.status = 0 ORDER BY obj.moment ASC")
	List <Order> findOrdersWithProducts ();
	
}
