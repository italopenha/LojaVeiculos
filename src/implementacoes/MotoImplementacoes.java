package implementacoes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import classes.Moto;
import dao.Dao;
import interfaces.MotoRepositorio;

public class MotoImplementacoes extends Dao implements MotoRepositorio {

	@Override
	public void criarMoto(Moto moto) throws Exception {
		open();
		stmt = con.prepareStatement("INSERT INTO MOTO VALUES(?,?,?,?,?,?,?)");
		stmt.setInt(1, moto.getId());
		stmt.setString(2, moto.getMarca());
		stmt.setString(3, moto.getModelo());
		stmt.setString(4, moto.getCor());
		stmt.setInt(5, moto.getAno());
		stmt.setFloat(6, moto.getKm());
		stmt.setInt(7, moto.getCilindrada());
		stmt.execute();
		stmt.close();
		close();
	}

	@Override
	public Moto obterMotoPorId(int id) throws Exception {
		open();
		stmt = con.prepareStatement("SELECT * FROM MOTO WHERE ID = ?");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();
		Moto moto = null;
		if (rs.next()) {
			moto = new Moto();
			moto.setId(rs.getInt("id"));
			moto.setMarca(rs.getString("marca"));
			moto.setModelo(rs.getString("modelo"));
			moto.setCor(rs.getString("cor"));
			moto.setAno(rs.getInt("ano"));
			moto.setKm(rs.getFloat("km"));
			moto.setCilindrada(rs.getInt("cilindrada"));
		} else {
			System.out.println("Registro não encontrado!");
		}
		close();
		return moto;
	}

	@Override
	public boolean atualizarMoto(Moto moto) throws Exception {
		open();
		stmt = con.prepareStatement("UPDATE MOTO SET MARCA = ?, MODELO = ?, COR = ?, ANO = ?, KM = ?, CILINDRADA = ?");
		try {
			stmt.setString(1, moto.getMarca());
			stmt.setString(2, moto.getModelo());
			stmt.setString(3, moto.getCor());
			stmt.setInt(4, moto.getAno());
			stmt.setFloat(5, moto.getKm());
			stmt.setInt(6, moto.getCilindrada());
		} catch (SQLException ex) {
			System.out.println("Erro: " + ex.getMessage() + stmt);
			stmt.close();
			close();
			return false;
		}
		stmt.close();
		close();
		return true;
	}

	@Override
	public void excluirMotoPorId(Moto moto) throws Exception {
		open();
		stmt = con.prepareStatement("DELETE FROM MOTO WHERE ID = ?");
		stmt.setInt(1, moto.getId());
		stmt.execute();
		stmt.close();
		close();
	}

	@Override
	public List<Moto> ListarMotos() {
		try {
			open();
			stmt = con.prepareStatement("SELECT * FROM MOTO ORDER BY ID");
			rs = stmt.executeQuery();
			
			List<Moto> listaMotos = new ArrayList<Moto>();
			
			while(rs.next()) {
				Moto moto = new Moto();
				moto.setId(rs.getInt("id"));
				moto.setMarca(rs.getString("marca"));
				moto.setModelo(rs.getString("modelo"));
				moto.setCor(rs.getString("cor"));
				moto.setAno(rs.getInt("ano"));
				moto.setKm(rs.getFloat("km"));
				moto.setCilindrada(rs.getInt("cilindrada"));
				listaMotos.add(moto);
			}
			
			close();
			return listaMotos;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}