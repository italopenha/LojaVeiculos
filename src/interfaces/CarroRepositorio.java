package interfaces;

import java.util.List;

import classes.Carro;

public interface CarroRepositorio {
	public void criarCarro(Carro carro) throws Exception;
	Carro obterCarroPorId(int id) throws Exception;
	public boolean atualizarCarro(Carro carro) throws Exception;
	public void excluirCarroPorId(Carro carro) throws Exception;
	public List<Carro> ListarCarros();
}
