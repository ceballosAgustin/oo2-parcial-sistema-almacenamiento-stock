package datos;

public class Almacen extends Stock {
	private int idAlmacen;
	private String ubicacion;

	public Almacen() {

	}

	public Almacen(String ubicacion) {
		super();
		this.ubicacion = ubicacion;
	}

	public int getIdAlmacen() {
		return idAlmacen;
	}

	protected void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Almacen [ " + super.toString() + ", ubicacion=" + ubicacion + "] \n";
	}

}
