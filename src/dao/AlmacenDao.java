package dao;

import java.util.List;

import datos.Almacen;
import datos.Stock;

public class AlmacenDao extends Dao<Almacen> {
	private static AlmacenDao instancia = null;

	public AlmacenDao() {

	}

	public static AlmacenDao getInstance() {
		if (instancia == null) {
			instancia = new AlmacenDao();
		}

		return instancia;
	}

	// CU5
	public List<Stock> traer(String ubicacion) {
		List<Stock> lista = null;

		try {
			iniciaOperacion();
			lista = session.createQuery(
					"from Almacen a inner join fetch a.producto inner join fetch a.lote where a.ubicacion = :ubicacion",
					Stock.class)
					.setParameter("ubicacion", ubicacion).list();
		} finally {
			// TODO: handle finally clause
			session.close();
		}

		return lista;
	}
}
