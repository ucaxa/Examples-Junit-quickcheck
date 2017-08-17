package tdbArrays;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import models.ArrayListExample;


@RunWith(JUnitQuickcheck.class)
public class ArrayListExampleTeste {
	
	
	@Property(trials = 5,shrink=true)
	public void testeArrray(@InRange(minInt=1, maxInt=4) ArrayList<Integer> a ) {
		
		
		System.out.println("ArrayList' "+ a.toString());
		
		boolean teste = ArrayListExample.Possuelemento(a);
		
		assertTrue(teste);
	}

}
