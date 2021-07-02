package com.buenoponto.controledeponto.model;

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
public class Calendario {

	private Long id;
	private TipoData tipoData;
	private String descricao;
	private LocalDateTime dataEspecial;

}
