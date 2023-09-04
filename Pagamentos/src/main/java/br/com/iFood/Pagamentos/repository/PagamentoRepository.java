package br.com.iFood.Pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iFood.Pagamentos.model.Pagamento;

public interface PagamentoRepository extends JpaRepository <Pagamento,Long>{
    
}
