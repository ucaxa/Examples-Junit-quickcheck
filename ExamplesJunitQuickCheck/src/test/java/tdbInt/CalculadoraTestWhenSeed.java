package tdbInt;



import static org.junit.Assert.*;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import models.Calculadora;


@RunWith(JUnitQuickcheck.class)
public class CalculadoraTestWhenSeed {
	

	/**@When: Marca um parametro e estabelece uma estrat�gia de gera��o para os valores
	/*Marca-se um par�metro de um m�todo de propriedade com esta anota��o 
	para especificar metadados sobre valores gerados para esse par�metro.
	podemos usar 3 parametros(seed(Long),satisfies(string), discardRation(int)) 
	 
	
	/**
	seed=> valor a ser usado como a semente inicial para o gerador de valor aleat�rio. 
			 N�o especificando um valor faz com que a semente  escolhida seja a default do JDK
	*/ 
	
	
	@Property(trials = 2)
	public void testedeadicaocomvalorsemente(@When(seed = -1L) int number) {
		
		System.out.println("Numeros gerados para tesdeadicaocomvalorsemente: " + number);
		
		Calculadora calculator = new Calculadora();
		calculator.add(number);
		assertEquals(calculator.getResult(), number);
	}

	//Objetivo da anota��o seed
	/**Voc� pode querer  fixar a semente quando uma propriedade falhar,para  
	 * testar a propriedade repetidamente com o mesmo conjunto de 
	 * valores gerados que causou a falha.*/
	
	
	
	
	
			 
	
	

}
