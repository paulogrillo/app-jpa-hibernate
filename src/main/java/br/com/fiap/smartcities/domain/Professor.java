package br.com.fiap.smartcities.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_professor")
public class Professor {
	
	@Id
	@Column(name = "id_professor")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seqProfessor")
	@SequenceGenerator(name = "seqProfessor", sequenceName = "seq_professor", allocationSize = 1)
	private Integer id;
	
	@Column(name = "nome_professor", length = 50)
	private String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
