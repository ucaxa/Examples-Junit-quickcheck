package tdbInt;


import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import static org.junit.Assume.*;
import models.Calculadora;


import static org.hamcrest.Matchers.greaterThan;




@RunWith(JUnitQuickcheck.class)
public class CalculadoraTestAssume {
	
	
	//Assume que os valores para o parâmetro number gerados pelo algoritmo do junit-quichcheck
	//sejam maiores que 10
	


	@Property(trials = 5)
	//@Property
	public void testAdditionUsingAssume(int number) {
		
       assumeThat(number, greaterThan(10));
       System.out.println("Numeros gerados com assume: " + number);
       Calculadora calculadora = new Calculadora();
		calculadora.add(number);
		assertEquals(calculadora.getResult(), number);
	}


}
