package datos;

import java.time.LocalDate;

public class Pedido extends Stock {
	private int idPedido;
	private LocalDate fecha;
	private String cliente;

	public Pedido() {

	}

	public Pedido(LocalDate fecha, String cliente) {
		super();
		this.fecha = fecha;
		this.cliente = cliente;
	}

	public int getIdPedido() {
		return idPedido;
	}

	protected void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [ " + super.toString() + ", fecha=" + fecha + ", cliente=" + cliente
				+ "] \n";
	}

}
