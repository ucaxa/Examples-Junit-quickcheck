package tbdDouble;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import models.Numeros;


@RunWith(JUnitQuickcheck.class)
public class NumerosTestAssumeRange {

	
	@Property(trials = 5,shrink=true)
	public void testaadicao(Double numero1,@InRange(minDouble =10.0,maxDouble=15.0) Double numero2) {
		
		assumeTrue((numero1>=0.0 && numero1<=10.0));
		assumeTrue((numero2>=10.0 && numero2<=15));
				
		System.out.println("NumerosGerados:......numero 1:  "  + numero1 + " .....numero 2: " + numero2);
		Numeros teste = new Numeros();
		boolean resultado =teste.adicaoIsmaiorquezero(numero1, numero2);
		assertEquals((numero1 + numero2 > 0), resultado);
		
		
	}
	
}
