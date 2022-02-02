package Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Objetos.Delivery;


class DeliveryTest {

	@Test
	void testNombre() {
		assertEquals("Angel", new Delivery( "Angel","Mora","26876057-1", "+56 961660356").getNombre());
	}
	
	@Test
	void testApellido() {
		assertEquals("Mora", new Delivery( "Angel","Mora","26876057-1", "+56 961660356").getApellido());
	}

}
