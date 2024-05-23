package datos;

public class Lote {
	private int idLote;
	private String codigo;
	private Producto producto;

	public Lote() {

	}

	public Lote(String codigo, Producto producto) {
		super();
		this.codigo = codigo;
		this.producto = producto;
	}

	public int getIdLote() {
		return idLote;
	}

	protected void setIdLote(int idLote) {
		this.idLote = idLote;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Lote [idLote=" + idLote + ", codigo=" + codigo + ", producto=" + producto + "] \n";
	}
	
}
