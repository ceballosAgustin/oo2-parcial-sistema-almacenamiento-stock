package dao;

import java.util.List;

import datos.Lote;
import datos.Producto;

public class LoteDao extends Dao<Lote> {
	private static LoteDao instancia = null;

	public LoteDao() {

	}

	public static LoteDao getInstance() {
		if (instancia == null) {
			instancia = new LoteDao();
		}

		return instancia;
	}

	// CU3
	public Lote traer(String codigo) {
		Lote objeto = null;

		try {
			iniciaOperacion();
			objeto = (Lote) session.createQuery("from Lote l inner join fetch l.producto where l.codigo = :codigo")
					.setParameter("codigo", codigo).uniqueResult();
		} finally {
			// TODO: handle finally clause
			session.close();
		}

		return objeto;
	}

	// CU4
	public List<Lote> traer(Producto producto) {
		List<Lote> lista = null;

		try {
			iniciaOperacion();
			lista = session
					.createQuery("from Lote l inner join fetch l.producto p where p.codigo = :codigo", Lote.class)
					.setParameter("codigo", producto.getCodigo()).list();
		} finally {
			// TODO: handle finally clause
			session.close();
		}

		return lista;
	}
}
