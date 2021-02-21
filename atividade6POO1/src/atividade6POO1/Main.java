package atividade6POO1;

public class Main {

	public static void main(String[] args) {

		Documento documento = new Documento("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		System.out.println(documento.toString() + "\n");
		
		Impressora impressora = new Impressora("IMPPOO1-20210221");
		System.out.println(impressora.toString() + "\n");
		System.out.println(impressora.imprimir(documento) + "\n");
		
		Escritorio escritorio = new Escritorio();
		System.out.println(escritorio.toString() + "\n");
		
		if (escritorio.addImpressora(impressora)) {
			System.out.println("Impressora adicionada com sucesso!\n");
		} else {
			System.out.println("Erro ao adicionar impressora!\n");
		}
		if (escritorio.addFuncionario("Lucas", "111.111.111-00", 8000)) {
			System.out.println("Funcionário adicionado com sucesso!\n");
		} else {
			System.out.println("Erro ao adicionar funcionário!\n");
		}
		if (escritorio.addFuncionarioVendas("Carlos", "222.222.222-00", 4000, 5000)) {
			System.out.println("Funcionário adicionado com sucesso!\n");
		} else {
			System.out.println("Erro ao adicionar funcionário!\n");
		}
		if (escritorio.addFuncionarioTelemarketing("Rafael", "333.333.333-00", 2000, 100)) {
			System.out.println("Funcionário adicionado com sucesso!\n");
		} else {
			System.out.println("Erro ao adicionar funcionário!\n");
		}
		System.out.println(escritorio.toString());
		
	}

}
