package negocio;

import java.util.List;

import dao.AlmacenDao;
import datos.Stock;

public class AlmacenAbm {
	private static AlmacenAbm instancia = null;

	public AlmacenAbm() {

	}

	public static AlmacenAbm getInstance() {
		if (instancia == null) {
			instancia = new AlmacenAbm();
		}

		return instancia;
	}

	// CU5
	public List<Stock> traer(String ubicacion) {
		return AlmacenDao.getInstance().traer(ubicacion);
	}
}
