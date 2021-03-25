package br.com.alura.loja.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	public String getNome() {
		return nome;
	}
	
	public Categoria() {
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria(String nome) {
		super();
		this.nome = nome;
	}

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private long id;
	
	private String nome;
}
