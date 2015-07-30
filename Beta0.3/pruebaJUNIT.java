import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class pruebaJUNIT {
	private Stack<Double> nstack;
	Calculadora<Double> nCalculadora;
	
	@Before
	public void start()
	{
		nCalculadora = new Calculadora<Double>();
		nstack = new Stack<Double>(10);
		nstack.push(1.0);
		
	}
	@Test
	public void test1() throws Exception {
		assertEquals(1.0, nstack.pop(),0);
	}
	@Test
	public void test2() throws Exception {
		assertEquals(10, nstack.size(),0);
	}

}
