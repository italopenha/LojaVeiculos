package classes;

public class Carro extends Veiculo {
	private String cambio;
	private String carroceria;
	
	public Carro(String marca, String modelo, String cor, int ano, float km, String cambio, String carroceria) {
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
		// TODO Auto-generated method stub
	}
}
