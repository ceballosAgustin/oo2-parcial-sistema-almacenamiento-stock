package test;

import java.time.LocalDate;

import negocio.AlmacenAbm;
import negocio.LoteAbm;
import negocio.PedidoAbm;
import negocio.ProductoAbm;

public class TestGeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("\n1) ");

		/*
		 * try { ProductoAbm.getInstance().agregar("6", "placa de video", 500000); }
		 * catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace();
		 * }
		 */

		System.out.println(ProductoAbm.getInstance().traer("6"));
		System.out.println();



		System.out.println("\n2) ");
		try {
			ProductoAbm.getInstance().agregar("6", "audifonos", 500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();



		System.out.println("\n3) ");
		System.out.println(LoteAbm.getInstance().traer("2"));
		System.out.println();



		System.out.println("\n4) ");
		System.out.println(LoteAbm.getInstance().traer(ProductoAbm.getInstance().traer("2")));
		System.out.println();



		System.out.println("\n5) ");
		System.out.println(AlmacenAbm.getInstance().traer("Banfield"));
		System.out.println();



		System.out.println("\n6) ");
		System.out.println(PedidoAbm.getInstance().traer(LocalDate.of(2024, 5, 17), LocalDate.of(2024, 5, 21)));
		System.out.println();



		System.out.println("\n7) ");
		System.out
				.println(PedidoAbm.getInstance().traer(LocalDate.of(2024, 5, 17), LocalDate.of(2024, 5, 21), "Pablo"));
		System.out.println();

	}

}
