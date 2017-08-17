package tdbInt;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import models.Numeros;

@RunWith(JUnitQuickcheck.class)
public class NumerosTestShirink {
	
	
	@Property(shrink = false)
    public void testePrimo(@InRange(minInt = 2) int i) {
        assertTrue(String.valueOf(i), Numeros.IsPrime(i));
     
    }

	
/*	@Property(shrink = true)
    public void testePrimoShirink(@InRange(minInt = 2) int i) {
        assertTrue(String.valueOf(i), Numeros.IsPrime(i));
     
    }*/
	
}
