package atividade6POO1;

public class Vendas extends Funcionario {

	private double metaVendas;

	public Vendas() {
		super();
	}

	public Vendas(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public Vendas(String nome, String cpf, double salario, double metaVendas) {
		super(nome, cpf, salario);
		this.metaVendas = metaVendas;
	}

	public double getMetaVendas() {
		return metaVendas;
	}

	public void setMetaVendas(double metaVendas) {
		if (metaVendas > 0)
			this.metaVendas = metaVendas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vendas [metaVendas=");
		builder.append(metaVendas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
