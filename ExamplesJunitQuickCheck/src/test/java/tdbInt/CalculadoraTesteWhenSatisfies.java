package tdbInt;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import models.Calculadora;

@RunWith(JUnitQuickcheck.class)
public class CalculadoraTesteWhenSatisfies {
	
	
	/**
	satisfies=>Utiliza Uma express�o OGNL usada para restringir os valores alimentados ao 
			 par�metro da propriedade anotada. A express�o deve avaliar para um valor booleano.
			 Dentro da express�o, "_" refere-se ao par�metro da propriedade.*/
	
	
	@Property(trials = 3)
	public void testesadicaocomsatisfies(@When(satisfies = "#_>= 5") int number) {
				
		System.out.println("Numeros gerados 1 : " + number);
		
		Calculadora calculadora = new Calculadora();
		calculadora.add(number);
		assertEquals(calculadora.getResult(), number);
	}
	

	@Property(trials = 3)
	public void testesadicao2(@When(satisfies = "#_<= 9") int number) {
				
		System.out.println("Numeros gerados 2 : " + number);
		
		Calculadora calculadora = new Calculadora();
		calculadora.add(number);
		assertEquals(calculadora.getResult(), number);
	}
	
		
	
}
