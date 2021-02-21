package atividade6POO1;

public class Telemarketing extends Funcionario {

	private int metaLigacoes;

	public Telemarketing() {
		super();
	}

	public Telemarketing(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public Telemarketing(String nome, String cpf, double salario, int metaLigacoes) {
		super(nome, cpf, salario);
		this.metaLigacoes = metaLigacoes;
	}

	public int getMetaLigacoes() {
		return metaLigacoes;
	}

	public void setMetaLigacoes(int metaLigacoes) {
		if (metaLigacoes > 0)
			this.metaLigacoes = metaLigacoes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Telemarketing [metaLigacoes=");
		builder.append(metaLigacoes);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
