package br.com.microservice.fornecedor.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.microservice.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoRepository extends JpaRepository<InfoFornecedor, Long> {
	
	InfoFornecedor findByEstado(String estado);

}
