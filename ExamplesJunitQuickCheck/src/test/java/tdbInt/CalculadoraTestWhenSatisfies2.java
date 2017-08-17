package tdbInt;



import org.junit.runner.RunWith;


import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import models.Calculadora;



import static org.junit.Assert.*;




@RunWith(JUnitQuickcheck.class)
public class CalculadoraTestWhenSatisfies2 {
	
		
	/**
	satisfies=>Utiliza Uma express�o OGNL usada para restringir os valores alimentados ao 
			 par�metro da propriedade anotada. A express�o deve avaliar para um valor booleano.
			 Dentro da express�o, "_" refere-se ao par�metro da propriedade.*/
	
	@Property(trials = 2,shrink=true)
	public void testesadicao(@When(satisfies = "(#_>= 1 ) || (#_<= 9)") int number) 
	
	{
				
		System.out.println("Numeros gerados: " + number);
		
		Calculadora calculadora = new Calculadora();
		calculadora.add(number);
		assertEquals(calculadora.getResult(), number);
	}
	

}
