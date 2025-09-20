package com.conjunto_de_veiculos.veiculos.model;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Veiculo {
	
	@Id
	private UUID id = UUID.randomUUID();

	//Não pode ter placas iguais
	@Column(nullable = false)
	private String placa;
	
	@Column(nullable = false)
	private String marca;
	
	@Column(nullable = false)
	private String modelo;
	
	@Column(nullable = false)
	private int ano;
	
}
