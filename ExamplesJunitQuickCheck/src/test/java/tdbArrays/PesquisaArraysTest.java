package tdbArrays;

import static org.junit.Assert.assertEquals;




import org.junit.Test;



import org.junit.runner.RunWith;



import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import models.PesquisaArrays;


@RunWith(JUnitQuickcheck.class)
public class PesquisaArraysTest {
	
	

	@Test
	public void pesquisat() {
		
		int n[]={3,8,6,5};
		int t=8;
		boolean resultado = PesquisaArrays.pertenceAoArray(n,t);
		assertEquals(true, resultado );
	//	assumeTrue(false);
		
		
	}

	
	@Property(trials = 2,shrink=true)
	public void pesquisa(@InRange(minInt = 0, maxInt=8)int[] n, @InRange(minInt = 0, maxInt=4)int t) {

	
	//	assumeTrue((numero1>=0.0 && numero1<=10.0));
	//	assumeTrue((numero2>=10.0 && numero2<=15));
	//	System.out.println("NumerosGerados:......numero 1:  "  + n.toString());
		String vetor="[";
		for (int i = 0; i < n.length; i++) {
		 vetor = + n[i] +",";
		}

		vetor= vetor + "]";
	     System.out.println(vetor);	
	//	System.out.println("NumerosGerados:......numero 1:  "  + n[i] + " .....numero 2: " + t);
		
		boolean resultado = PesquisaArrays.pertenceAoArray(n,t);
		
		assertEquals(true, resultado );
	//	assumeTrue(false);
		
		
	}
	

}
