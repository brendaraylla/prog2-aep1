package unicesumar.prog2.aep1.conceito;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
	@Id
	private String id;
	private String nome;
	
	public Aluno() {
		id = UUID.randomUUID().toString();
	}

	public Aluno(String nome) {
		this();
		this.nome = nome;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
}
