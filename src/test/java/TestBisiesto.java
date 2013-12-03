import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestBisiesto {
	Bisiesto bs;
	@Before
	public void setUp()
	{
		bs=new Bisiesto();
	}
	@Test
	public void ImprimirAnioIngresado() 
	{
	   assertEquals("2012",bs.Mostrar(2012));
	}
	
	@Test
	public void DeterminarSiEsBisiesto()
	{
		assertEquals(true,bs.Calcular(2004));	
	}
	
}
