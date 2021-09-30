package com.bid.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bid.demo.models.Pedido;

public interface PedidoDAO extends JpaRepository<Pedido, Long> {

	@Query(value = "select (COALESCE(max(id),0) + 1) from pedido" , nativeQuery = true)
	Long obtenerIdMaximo();
}
