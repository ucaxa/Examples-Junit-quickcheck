package tbdDouble;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import models.Numeros;

@RunWith(JUnitQuickcheck.class)
public class NumerosTestWhenSeed {
	
	
	/*@Property(trials = 2)
	public void testedeadicaocomvalorsemente(@When(seed = -1L) int number) {
		
		System.out.println("Numeros gerados para tesdeadicaocomvalorsemente: " + number);
		
		Calculadora calculator = new Calculadora();
		calculator.add(number);
		assertEquals(calculator.getResult(), number);
	}
*/
	@Property(trials = 5,shrink=true)
	public void testaadicao(@When(seed = 1L) Double numero1,@When(seed = 1L) Double numero2) {
		
		System.out.println("NumerosGerados:......numero 1:  "  + numero1 + " .....numero 2: " + numero2);
		Numeros teste = new Numeros();
		boolean resultado =teste.adicaoIsmaiorquezero(numero1, numero2);
		assertEquals((numero1 + numero2 > 0), resultado);
	

}

	
}
