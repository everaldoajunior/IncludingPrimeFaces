package br.com.testeonline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cursos", schema = "public")
public class Cursos {

	@Column(name ="descricao")
	private String Descricao;
	
	@Column(name ="area_de_conhecimento")
	private String areaDeConhecimento;
	
	@Column(name ="status")
	private boolean status;

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getAreaDeConhecimento() {
		return areaDeConhecimento;
	}

	public void setAreaDeConhecimento(String areaDeConhecimento) {
		this.areaDeConhecimento = areaDeConhecimento;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
