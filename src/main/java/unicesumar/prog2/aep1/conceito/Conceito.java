package unicesumar.prog2.aep1.conceito;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Conceito {
	@Id
	private String id;
	@OneToOne(cascade=CascadeType.ALL)
	private Nota nota;
  @OneToOne(cascade=CascadeType.ALL)
  @NotNull(message = "Avaliação não pode ser nulo")
	private Avaliacao avaliacao;
	@OneToOne(cascade=CascadeType.ALL)
  @NotNull(message = "Aluno não pode ser nulo")
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}	
}
