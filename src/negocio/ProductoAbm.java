package negocio;

import dao.ProductoDao;
import datos.Producto;

public class ProductoAbm {
	private static ProductoAbm instancia = null;

	public ProductoAbm() {

	}

	public static ProductoAbm getInstance() {
		if (instancia == null) {
			instancia = new ProductoAbm();
		}

		return instancia;
	}

	// CU1
	public Producto traer(String codigo) {
		return ProductoDao.getInstance().traer(codigo);
	}

	// CU2
	public int agregar(String codigo, String nombre, double precio) throws Exception {
		Producto productoAux = traer(codigo);

		if (productoAux != null) {
			throw new Exception("ERROR: el producto ya existe en la Base de Datos.");
		}

		// Retonar al Dao
		return ProductoDao.getInstance().agregar(new Producto(codigo, nombre, precio));
	}
}
