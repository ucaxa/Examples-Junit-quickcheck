package tdbDate;

import static org.hamcrest.Matchers.greaterThan;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;

import java.text.DateFormat;
import java.text.ParseException;

import java.util.Date;

import org.junit.runner.RunWith;



import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;


import models.DataporExtenso;


@RunWith(JUnitQuickcheck.class)
public class DataporExtensoTestAssume {
	
	@Property(trials = 5)
	public void testAdditionUsingAssume(Date data) throws ParseException {
		

		
		
	//ate datax = data.getTime();
		DateFormat f = DateFormat.getDateInstance();
		
		Date data2 = f.parse("01/08/2017");
		
			
		
		assumeThat(data, greaterThan(data2));
		
		DataporExtenso dtuser = new DataporExtenso();
	//tring dt = dtuser.retornaData(data);
		System.out.println("Data gerada pelo teste :" + dtuser.retornaData(data));
		
		boolean result= dtuser.verificaSegunda(data);
		assertTrue(result);
	}

}
