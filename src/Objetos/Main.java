package Objetos;

import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) {
		
		//Instanciando
		Delivery delivery = new Delivery("Angel" , "Mora", "26876042-3", "+56 961660356");
		Cliente cliente = new Cliente("Martha" , "Peña", "6876042-3", "+56 931330366", "Av Santa Rosa 170");
		Encargado encargado = new Encargado("Martin", "Rosales", "25741141-3","Encargado Principal");
		
		Producto producto1 = new Producto("Cebolla", "Verdura", "1 kl" , 3500);
		Producto producto2 = new Producto("Tomate", "Verdura", "2 kl" , 5500);
		Producto producto3 = new Producto("Zanahoria", "Verdura", "1 kl" , 5000);
		Producto producto4 = new Producto("Berenjena", "Verdura", "3 kl" , 6500);
		Producto producto5 = new Producto("Remolacha", "Verdura", "1 kl" , 3500);
		Producto producto6 = new Producto("Apio", "Verdura", "1 kl" , 3500);
		Producto producto7 = new Producto("Perejil", "Verdura", "1 kl" , 3500);
		Producto producto8 = new Producto("Puerro", "Verdura", "1 kl" , 3500);
		
		Mercado mercado = new Mercado("Mercado Mayorista de Santiago", 208, "(2)5684521", "La vega central");
	
		Pedido pedido = new Pedido("P0542",new ArrayList<Producto>(), cliente, "Lo barnechea 354","Las Condes");
		pedido.getProducto().add(producto1);
		pedido.getProducto().add(producto2);
		pedido.getProducto().add(producto3);
		pedido.getProducto().add(producto4);
		pedido.getProducto().add(producto5);
		
		//Recorriendo mi arrayList
		String product = "";
		for (int i=0; i < pedido.getProducto().size(); i++) 
		{
			//.getTatuaje().get(i).getDescripcion() + " ,"
			product = product + "-"+ pedido.getProducto().get(i).getNombre() + "\n" ;
		}
		
		Preparacion preparacion = new Preparacion(encargado, "Preparado");
		
		Despacho despacho = new Despacho(preparacion, "Carmen 356, Santiago", "Recolota 1540, Santiago", cliente, delivery, 4500);
		
		Venta venta = new Venta ("V0054", cliente, preparacion, pedido,despacho);
		
		//Instanciando Compra 
		Compra compra = new Compra("C0525",new ArrayList<Producto>(), 5 , mercado);	
		compra.getProducto().add(producto1);
		compra.getProducto().add(producto2);
		compra.getProducto().add(producto3);
		compra.getProducto().add(producto4);
		compra.getProducto().add(producto5);
		compra.getProducto().add(producto6);
		compra.getProducto().add(producto7);
		compra.getProducto().add(producto8);
		
		//Recorriendo el arrayList de productos pertenecientes a la compra	
		String palmacen = "";
		for (int i=0; i < pedido.getProducto().size(); i++) 
		{
			double precio = compra.getProducto().get(i).getPrecio() * compra.getCantidad();
			//.getTatuaje().get(i).getDescripcion() + " ,"
			palmacen = palmacen + "-"+ compra.getProducto().get(i).getNombre() + " Gasto: "+ precio + " "+  " Por una compra de: " + compra.getCantidad() + "Kl"+ "\n" ;
		}
		
		//Trayendo toda la información que se desea mostrar
		
		System.out.println("******************Control De Venta******************"
				+ "\n" + "N° venta: " + venta.getNumeroVenta()  + " Cliente: " + venta.getCliente().getNombre() + " Rut: " + venta.getCliente().getRut() 
				+ "\n" + "******************************************************"
				+ "\n" + "Detalle del pedido: "
				+ "\n" + "******************************************************"
				+"\n" + "Código del pedido: " + venta.getPedido().getCodigo()
				+"\n" + "Productos: " 
				+"\n" + product
				+ "\n" + "******************************************************"
				+"\n" +"Detalle de entrega: "
				+"\n" + "- "+ "Preparador: "+ venta.getPreparacion().getEncargado().getNombre()
				+"\n" +"- "+"Delivery: " + venta.getDespacho().delivery.getNombre()
				+"\n" +"- "+"Dirección de entrega:  "+ venta.getDespacho().getDirecciónEntrega()
				+"\n"+ "- "+ " Cliente: " + venta.getCliente().getNombre()
				+"\n" +"- "+"Costo del delivery: $" + venta.getDespacho().getPrecio()
				+ "\n" + "******************************************************"
				+ "\n"
				+ "\n"
				+ "\n"+ "******************Control De Compra******************"
				+ "\n" + "N° control: "+ compra.getNumero() + " "
				+ "\n" + " Compras realizadas en: " + compra.getMercado().getNombre() + " Dirección: " +  compra.getMercado().getDireccion()
				+ "\n" + "Productos: "
				+ "\n" + palmacen 
				+ "\n" + "******************************************************"
				);
				
		
		
		
		
	}

	
	

}
