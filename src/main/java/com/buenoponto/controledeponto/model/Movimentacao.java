package com.buenoponto.controledeponto.model;

import java.io.Serializable;

import javax.persistence.Embedded;

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
public class Movimentacao {

	
	public class movimentacaoId implements Serializable{

		private static final long serialVersionUID = 1903401546626937237L;
		
		
	}
	
}
