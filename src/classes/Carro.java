package classes;

import java.util.Scanner;

import implementacoes.CarroImplementacoes;

public class Carro extends Veiculo {
	private String cambio;
	private String carroceria;
	
	public Carro() {
		
	}
	
	public Carro(String marca, String modelo, String cor, int ano, int km, String cambio, String carroceria) {
		super(marca, modelo, cor, ano, km);
		this.cambio = cambio;
		this.carroceria = carroceria;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}

	@Override
	public void venderVeiculo() {
		CarroImplementacoes ci = new CarroImplementacoes();
		Carro c = new Carro();
		Scanner leitor = new Scanner(System.in);
		int id;
		
		try {
			System.out.println("--- Vender Carro ---");
			System.out.println("Digite o ID do carro que foi vendido: ");
			c.setId(id = leitor.nextInt());
			ci.excluirCarroPorId(id);
			System.out.println("Carro excluído do sistema com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		leitor.close();
	}
}
