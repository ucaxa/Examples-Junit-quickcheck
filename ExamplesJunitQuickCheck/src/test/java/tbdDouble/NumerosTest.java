package tbdDouble;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import models.Numeros;


@RunWith(JUnitQuickcheck.class)
public class NumerosTest {
	
	//tryals determina a quantidade de valores gerados
	@Property(trials = 5,shrink=true)
	public void testaadicao(Double numero1, Double numero2) {
		
		System.out.println("NumerosGerados:......numero 1:  "  + numero1 + " .....numero 2: " + numero2);
		
		Numeros teste = new Numeros();
		
		boolean resultado =teste.adicaoIsmaiorquezero(numero1, numero2);
		
		assertEquals((numero1 + numero2 > 0), resultado);
		
		
	}


}
