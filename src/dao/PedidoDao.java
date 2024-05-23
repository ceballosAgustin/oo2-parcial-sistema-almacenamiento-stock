package dao;

import java.time.LocalDate;
import java.util.List;

import datos.Pedido;
import datos.Stock;

public class PedidoDao extends Dao<Pedido> {
	private static PedidoDao instancia = null;

	public PedidoDao() {

	}

	public static PedidoDao getInstance() {
		if (instancia == null) {
			instancia = new PedidoDao();
		}

		return instancia;
	}

	// CU6
	public List<Stock> traer(LocalDate fechaDesde, LocalDate fechaHasta) {
		List<Stock> lista = null;

		try {
			iniciaOperacion();
			lista = session.createQuery(
					"from Pedido p inner join fetch p.producto inner join fetch p.lote where p.fecha >= :fechaDesde AND p.fecha <= :fechaHasta",
					Stock.class).setParameter("fechaDesde", fechaDesde).setParameter("fechaHasta", fechaHasta).list();
		} finally {
			// TODO: handle finally clause
			session.close();
		}

		return lista;
	}

	// CU7
	public List<Stock> traer(LocalDate fechaDesde, LocalDate fechaHasta, String cliente) {
		List<Stock> lista = null;

		try {
			iniciaOperacion();
			lista = session.createQuery(
					"from Pedido p inner join fetch p.producto inner join fetch p.lote where p.fecha >= :fechaDesde AND p.fecha <= :fechaHasta AND p.cliente = :cliente",
					Stock.class)
					.setParameter("fechaDesde", fechaDesde).setParameter("fechaHasta", fechaHasta)
					.setParameter("cliente", cliente).list();
		} finally {
			// TODO: handle finally clause
			session.close();
		}

		return lista;
	}
}
