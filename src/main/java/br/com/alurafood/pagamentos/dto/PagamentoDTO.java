package br.com.alurafood.pagamentos.dto;

import br.com.alurafood.pagamentos.model.Status;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public record PagamentoDTO(
         Long id,
         BigDecimal valor,
         String nome,
         String numero,
         String expiracao,
         String codigo,
         Status status,
         Long formaDePagamentoId,
         Long pedidoId
) {
}
