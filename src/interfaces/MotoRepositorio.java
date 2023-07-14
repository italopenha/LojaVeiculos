package interfaces;

import classes.Moto;

public interface MotoRepositorio {
	public void criarMoto(Moto moto);
	Moto obterMotoPorId(int id);
	public void atualizarMoto(Moto moto);
	public void excluirMotoPorId(int id);
}
