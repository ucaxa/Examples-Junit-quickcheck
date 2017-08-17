package tdbStrings;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class StringsTrial {
	
	@Property(trials=4) 
	public void concatenationLength(String s1, String s2) {
    	
		System.out.println("O s1 é "  +  s1 );
		System.out.println("O s2 é" + s2  );
		System.out.println("O s1 é "  +  s1 + "O s2 é" + s2  );
        
    	System.out.println("--------------------------------------------------------");
    	
        assertEquals(s1.length() + s2.length(), (s1 + s2).length());
        
    }

}
