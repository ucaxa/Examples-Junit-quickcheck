package tdbInt;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import models.Calculadora;


@RunWith(JUnitQuickcheck.class)
public class CalculadoraTestRange {
	
	
	
	@Property(trials = 5)
	public void testeadicaoUsandoRangeMenor(@InRange(minInt = 3) int number) {
	
		System.out.println("numero gerado a partir de 3 foi " + number);
		
		Calculadora calculadora = new Calculadora();
		calculadora.add(number);
		assertEquals(calculadora.getResult(), number);
	}
	
	

	@Property(trials = 5)
	public void testeadicaoUsandoRangeMaior(@InRange(maxInt = 4) int number) {
	
		System.out.println("Numero gerado abaixo de 4 foi " + number);
		
		Calculadora calculadora = new Calculadora();
		calculadora.add(number);
		assertEquals(calculadora.getResult(), number);
	}
	
	
	
	@Property(trials = 5)
	public void testeadicaoUsandoRangecomIntervalo(@InRange(minInt = 0, maxInt=8) int number) {
		
		System.out.println("Numero gerado entre 0 e 8 foi " + number);
		
		Calculadora calculadora = new Calculadora();
		calculadora.add(number);
		assertEquals(calculadora.getResult(), number);
	}
	
	
	
	

}
