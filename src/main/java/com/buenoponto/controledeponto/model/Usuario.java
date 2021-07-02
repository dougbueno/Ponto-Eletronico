package com.buenoponto.controledeponto.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Usuario {

	private long id;
	private String nomeUsuario;
	private BigDecimal tolerancia;
	private LocalDateTime inicioJornada;
	private LocalDateTime finalJornada;
	@ManyToOne
	private CategoriaUsuario categoriaUsuario;
	@ManyToOne
	private Empresa empresa;
	@ManyToOne
	private NivelAcesso nivelAcesso;
	@ManyToOne
	private JornadaTrabalho jornadaTrabalho;

	
}
