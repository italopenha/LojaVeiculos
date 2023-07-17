package classes;

import implementacoes.MotoImplementacoes;

public class Moto extends Veiculo {
	private int cilindrada;
	
	public Moto(String marca, String modelo, String cor, int ano, float km, int cilindrada) {
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
		
		try {
			mi.excluirMotoPorId(m);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
