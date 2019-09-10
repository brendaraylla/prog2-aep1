package unicesumar.prog2.aep1.conceito;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nota {
	@Id
	private String id;
	private double nota;
	
	public Nota() {
		id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	
	public double getNota() {
		return nota;
	}
}
