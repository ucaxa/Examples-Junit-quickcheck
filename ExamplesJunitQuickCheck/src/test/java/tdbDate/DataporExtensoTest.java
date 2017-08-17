package tdbDate;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;


import models.DataporExtenso;


@RunWith(JUnitQuickcheck.class)
public class DataporExtensoTest {

	@Property(trials=10)
	public void testeDt(Date data){

		DataporExtenso dtuser = new DataporExtenso();
		String dt = dtuser.retornaData(data);
		System.out.println("Data gerada: " + data.toString() +    "   ----    " + dt);

		boolean result= dtuser.verificaSegunda(data);

		assertTrue(result);

	}

	@Property(trials=1)
	public void testeUmaData(Date data){

		DataporExtenso dtuser = new DataporExtenso();
		String dt = dtuser.retornaData(data);
		System.out.println("Data gerada pelo teste uma data: " + data.toString() + "" + dt);

		boolean result= dtuser.verificaSegunda(data);
		assertTrue(result);

	}

	
}	
