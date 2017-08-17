package tbdDouble;

import static org.junit.Assert.assertEquals;


import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import models.Numeros;

@RunWith(JUnitQuickcheck.class)
public class NumerosTestRange {
	
	
	@Property(trials = 5,shrink=true)
	public void testaadicao(@InRange(minDouble=5.0, maxDouble=8.0) Double numero1,@InRange(minDouble =10.0,maxDouble=15.0) Double numero2) {
		
		System.out.println("NumerosGerados:......numero 1:  "  + numero1 + " .....numero 2: " + numero2);
		
		Numeros teste = new Numeros();
		
		boolean resultado =teste.adicaoIsmaiorquezero(numero1, numero2);
		
		assertEquals((numero1 + numero2 > 0), resultado);
	

}
	
}