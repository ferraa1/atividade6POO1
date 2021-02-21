package atividade6POO1;

public class Impressora {

	private String modelo;

	public Impressora() {
	}

	public Impressora(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo.length() > 0)
			this.modelo = modelo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Impressora [modelo=");
		builder.append(modelo);
		builder.append("]");
		return builder.toString();
	}

	public String imprimir(Documento doc) {
		return doc.getTexto();
	}
}
