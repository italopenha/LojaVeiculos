package interfaces;

import java.util.List;

import classes.Carro;

public interface CarroRepositorio {
	public void criarCarro(Carro carro) throws Exception;
	Carro obterCarroPorId(int id) throws Exception;
	public void atualizarCarro(Carro carro) throws Exception;
	public void excluirCarroPorId(int id) throws Exception;
	public List<Carro> ListarCarros();
}
