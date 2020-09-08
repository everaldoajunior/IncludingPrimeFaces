package br.com.testeonline.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;

public class Aluno extends Users{

	@JoinColumn(name ="cursos")
	private List<Cursos> cursos;
	
	@Column(name ="observacao")
	private String observacao;
	
	
}
