package implementacoes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import classes.Carro;
import dao.Dao;
import interfaces.CarroRepositorio;

public class CarroImplementacoes extends Dao implements CarroRepositorio {

	@Override
	public void criarCarro(Carro carro) throws Exception {
		open();
		stmt = con.prepareStatement("INSERT INTO CARRO VALUES(?,?,?,?,?,?,?,?)");
		stmt.setInt(1, carro.getId());
		stmt.setString(2, carro.getMarca());
		stmt.setString(3, carro.getModelo());
		stmt.setString(4, carro.getCor());
		stmt.setInt(5, carro.getAno());
		stmt.setInt(6, carro.getKm());
		stmt.setString(7, carro.getCambio());
		stmt.setString(8, carro.getCarroceria());
		stmt.execute();
		stmt.close();
		close();
	}

	@Override
	public Carro obterCarroPorId(int id) throws Exception {
		open();
		stmt = con.prepareStatement("SELECT * FROM CARRO WHERE ID = ?");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();
		Carro carro = null;
		if (rs.next()) {
			carro = new Carro();
			carro.setId(rs.getInt("id"));
			carro.setMarca(rs.getString("marca"));
			carro.setModelo(rs.getString("modelo"));
			carro.setCor(rs.getString("cor"));
			carro.setAno(rs.getInt("ano"));
			carro.setKm(rs.getInt("km"));
			carro.setCambio(rs.getString("cambio"));
			carro.setCarroceria(rs.getString("carroceria"));
		} else {
			System.out.println("Registro não encontrado!");
		}
		close();
		return carro;
	}

	@Override
	public void atualizarCarro(Carro carro) throws Exception {
		open();
		stmt = con.prepareStatement("UPDATE CARRO SET MARCA = ?, MODELO = ?, COR = ?, ANO = ?, KM = ?, CAMBIO = ?, CARROCERIA = ? WHERE ID = ?");
		try {
			stmt.setString(1, carro.getMarca());
			stmt.setString(2, carro.getModelo());
			stmt.setString(3, carro.getCor());
			stmt.setInt(4, carro.getAno());
			stmt.setInt(5, carro.getKm());
			stmt.setString(6, carro.getCambio());
			stmt.setString(7, carro.getCarroceria());
			stmt.setInt(8, carro.getId());
			stmt.execute();
		} catch (SQLException ex) {
			System.out.println("Erro: " + ex.getMessage() + stmt);
			stmt.close();
			close();
		}
		stmt.close();
		close();
	}

	@Override
	public void excluirCarroPorId(int id) throws Exception {
		open();
		stmt = con.prepareStatement("DELETE FROM CARRO WHERE ID = ?");
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();
		close();
	}

	@Override
	public List<Carro> ListarCarros() {
		try {
			open();
			stmt = con.prepareStatement("SELECT * FROM CARRO ORDER BY ID");
			rs = stmt.executeQuery();
			
			List<Carro> listaCarros = new ArrayList<>();
			
			while(rs.next()) {
				Carro carro = new Carro();
				carro.setId(rs.getInt("id"));
				carro.setMarca(rs.getString("marca"));
				carro.setModelo(rs.getString("modelo"));
				carro.setCor(rs.getString("cor"));
				carro.setAno(rs.getInt("ano"));
				carro.setKm(rs.getInt("km"));
				carro.setCambio(rs.getString("cambio"));
				carro.setCarroceria(rs.getString("carroceria"));
				listaCarros.add(carro);
			}
			
			for (int i = 0; i < listaCarros.size(); i++) {
				System.out.println("ID: " + listaCarros.get(i).getId());
				System.out.println("Marca: " + listaCarros.get(i).getMarca());
				System.out.println("Modelo: " + listaCarros.get(i).getModelo());
				System.out.println("Cor: " + listaCarros.get(i).getCor());
				System.out.println("Ano: " + listaCarros.get(i).getAno());
				System.out.println("Km: " + listaCarros.get(i).getKm());
				System.out.println("Câmbio: " + listaCarros.get(i).getCambio());
				System.out.println("Carroceria: " + listaCarros.get(i).getCarroceria());
				System.out.println("----------------------------");
			}
			
			close();
			return listaCarros;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
