package dao;

import datos.Producto;

public class ProductoDao extends Dao<Producto> {
	private static ProductoDao instancia = null;

	public ProductoDao() {

	}

	public static ProductoDao getInstance() {
		if (instancia == null) {
			instancia = new ProductoDao();
		}

		return instancia;
	}

	// CU1
	public Producto traer(String codigo) {
		Producto objeto = null;

		try {
			iniciaOperacion();
			objeto = (Producto) session.createQuery("from Producto p where p.codigo = :codigo")
					.setParameter("codigo", codigo).uniqueResult();
		} finally {
			// TODO: handle finally clause
			session.close();
		}

		return objeto;
	}
}
