package classes;

import java.util.Scanner;

import implementacoes.MotoImplementacoes;

public class Moto extends Veiculo {
	private int cilindrada;
	
	public Moto(String marca, String modelo, String cor, int ano, int km, int cilindrada) {
		super(marca, modelo, cor, ano, km);
		this.cilindrada = cilindrada;
	}

	public Moto() {
		
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void venderVeiculo() {
		MotoImplementacoes mi = new MotoImplementacoes();
		Moto m = new Moto();
		Scanner leitor = new Scanner(System.in);
		int id;
		
		try {
			System.out.println("--- Vender Moto ---");
			System.out.println("Digite o ID da moto que foi vendida: ");
			m.setId(id = leitor.nextInt());
			mi.excluirMotoPorId(id);
			System.out.println("Moto excluída do sistema com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		leitor.close();
	}
}
