package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Cliente;
import Objetos.Delivery;
import Objetos.Despacho;
import Objetos.Encargado;
import Objetos.Preparacion;


class DespachoTest {
	Encargado encargado = new Encargado("Martin", "Rosales", "25741141-3","Encargado Principal");
	Delivery delivery = new Delivery("Angel" , "Mora", "26876042-3", "+56 961660356");
	Cliente cliente = new Cliente("Martha" , "Peña", "6876042-3", "+56 931330366", "Av Santa Rosa 170");
	Preparacion preparacion = new Preparacion(encargado, "Preparado");

	@Test
	void test() {
		assertEquals(4500, new Despacho( preparacion, "Santta rosa", "Condes",  cliente,delivery, 4500).getPrecio());
	}
	
	@Test
	void testDireccion() {
		assertEquals("Santta rosa", new Despacho( preparacion, "Santta rosa", "Condes",  cliente,delivery, 4500).getDireccionBusquedaDelPedido());
	}

}
