package negocio;

import java.util.List;

import dao.LoteDao;
import datos.Lote;
import datos.Producto;

public class LoteAbm {
	private static LoteAbm instancia = null;

	public LoteAbm() {

	}

	public static LoteAbm getInstance() {
		if (instancia == null) {
			instancia = new LoteAbm();
		}

		return instancia;
	}

	// CU3
	public Lote traer(String codigo) {
		return LoteDao.getInstance().traer(codigo);
	}

	// CU4
	public List<Lote> traer(Producto producto){
		return LoteDao.getInstance().traer(producto);
	}
}
