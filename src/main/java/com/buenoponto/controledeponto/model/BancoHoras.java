package com.buenoponto.controledeponto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BancoHoras {

	@EqualsAndHashCode
	@Embeddable
	@Getter
	@Setter
	public class BancoHorasId implements Serializable {
		private long idBancoHoras;
		private long idMovimentacao;
		private long idUsuario;
	}

	@EmbeddedId
	private BancoHorasId bancoHorasId;
	private LocalDateTime dataTrabalhada;
	private BigDecimal quantidadeHoras;
	private BigDecimal saldoHoras;

}
