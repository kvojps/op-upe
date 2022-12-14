package com.upe.observatorio.projeto.controller.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.upe.observatorio.projeto.domain.enums.AreaTematicaEnum;
import com.upe.observatorio.projeto.domain.enums.ModalidadeEnum;

import lombok.Data;

@Data
public class ProjetoRepresentation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;

	private AreaTematicaEnum areaTematica;
	
	private ModalidadeEnum modalidade;
	
	private String titulo;
	
	private String resumo;
	
	private String introducao;
	
	private String fundamentacao;
	
	private String objetivos;
	
	private String memoriaVisual;
	
	private Date dataInicio;
	
	private Date dataFim;
	
	private String publicoAlvo;
	
	private int pessoasAtendidas;
	
	private Double suporteFinanceiro;
	
	private List<CursoProjetoRepresentation> cursoProjetos;
}
