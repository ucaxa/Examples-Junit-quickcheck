package tdbInt;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;

import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import models.Calculadora;

@RunWith(JUnitQuickcheck.class)
public class CalculadoraTest {
	

//	Método de teste convencional baseado em exemplo
	@Test
	public void TestedeAdicaoBaseadaemExemplo() {
		
		Calculadora calculator = new Calculadora();
		calculator.add(2);
		assertEquals(calculator.getResult(), 2);		
	}
	
//anotacao Shirink
	
	/**
	 * Quando uma propriedade falha para um dado conjunto de valores, 
	 * junit-quickcheck tentará encontrar conjuntos de valores "menores" 
	 * que também refutem a propriedade e denunciem o menor conjunto desse tipo.
	 * @param number
	 */
	
	
	
	//tryals determina a quantidade de valores gerados
	@Property(trials = 5,shrink=true)
	public void testedeadicao(int number) {
		
		System.out.println("Numero gerado: " + number);
		
		Calculadora calculator = new Calculadora();
		calculator.add(number);
		assertEquals(calculator.getResult(), number );
	}
	
	
		


	
}
