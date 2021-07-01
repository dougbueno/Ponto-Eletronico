package com.buenoponto.controledeponto.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
	private CategoriaUsuario categoriaUsuario;
	private String nomeUsuario;
	private Empresa empresa;
	private NivelAcesso nivelAcesso;
	private JornadaTrabalho jornadaTrabalho;
	private BigDecimal tolerancia;
	private LocalDateTime inicioJornada;
	private LocalDateTime finalJornada;
	
}
