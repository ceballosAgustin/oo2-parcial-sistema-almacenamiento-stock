package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.PedidoDao;
import datos.Stock;

public class PedidoAbm {
	private static PedidoAbm instancia = null;

	public PedidoAbm() {

	}

	public static PedidoAbm getInstance() {
		if (instancia == null) {
			instancia = new PedidoAbm();
		}

		return instancia;
	}

	// CU6
	public List<Stock> traer(LocalDate fechaDesde, LocalDate fechaHasta) {
		return PedidoDao.getInstance().traer(fechaDesde, fechaHasta);
	}

	// CU7
	public List<Stock> traer(LocalDate fechaDesde, LocalDate fechaHasta, String cliente) {
		return PedidoDao.getInstance().traer(fechaDesde, fechaHasta, cliente);
	}
}
