package unicesumar.prog2.aep1.conceito;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Avaliacao {
	@Id
	private String id;
	private String nome;
	
	public Avaliacao() {
		id = UUID.randomUUID().toString();
	}

	public Avaliacao(String nome) {
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
