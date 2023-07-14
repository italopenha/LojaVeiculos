package interfaces;

import classes.Carro;

public interface CarroRepositorio {
	public void criarCarro(Carro carro);
	Carro obterCarroPorId(int id);
	public void atualizarCarro(Carro carro);
	public void excluirCarroPorId(int id);
}
