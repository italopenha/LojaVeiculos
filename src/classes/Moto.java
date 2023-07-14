package classes;

public class Moto extends Veiculo {
	private int cilindrada;
	
	public Moto(String marca, String modelo, String cor, int ano, float km, int cilindrada) {
		super(marca, modelo, cor, ano, km);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void venderVeiculo() {
		// TODO Auto-generated method stub
	}
}
