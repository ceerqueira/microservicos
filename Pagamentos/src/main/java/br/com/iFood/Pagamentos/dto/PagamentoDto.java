package br.com.iFood.Pagamentos.dto;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import br.com.iFood.Pagamentos.model.Status;

@Getter
@Setter
//Data Transfer Object (DTO) ou Objeto de Transferência de Dados, em português, é um padrão de projeto muito usado para o transporte de dados entre diferentes componentes de um sistema, diferentes instâncias ou processos de um sistema distribuído.
public class PagamentoDto {
    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long formaDePagamentoId;
    private Long pedidoId;


}