package interfaces;

import java.util.List;

import classes.Moto;

public interface MotoRepositorio {
	public void criarMoto(Moto moto) throws Exception;
	Moto obterMotoPorId(int id) throws Exception;
	public boolean atualizarMoto(Moto moto) throws Exception;
	public void excluirMotoPorId(Moto moto) throws Exception;
	public List<Moto> ListarMotos();
}
