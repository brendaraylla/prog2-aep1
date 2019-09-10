package unicesumar.prog2.aep1.conceito;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Conceito {
	@Id
	private String id;
	@OneToOne(cascade=CascadeType.ALL)
	private Nota nota;
	@OneToOne(cascade=CascadeType.ALL)
	private Avaliacao avaliacao;
	@OneToOne(cascade=CascadeType.ALL)
	private Aluno aluno;

	public Conceito() {
		id = UUID.randomUUID().toString();
	}

	public Conceito(Nota nota, Avaliacao avaliacao, Aluno aluno) {
		this();
		this.nota = nota;
		this.avaliacao = avaliacao;
		this.aluno = aluno;
	}
	
	
}
