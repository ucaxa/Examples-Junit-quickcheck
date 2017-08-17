package tdbStrings;


	
	
	import com.pholser.junit.quickcheck.Property;
    import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
    import org.junit.runner.RunWith;

    import static org.junit.Assert.*;

    @RunWith(JUnitQuickcheck.class)
    public class StringProperties {
        
    	@Property 
    	public void concatenationLength(String s1, String s2) {
        	
    		System.out.println("O s1 � "  +  s1 );
    		System.out.println("O s2 �" + s2  );
    		System.out.println("O s1 � "  +  s1 + "O s2 �" + s2  );
            
        	System.out.println("--------------------------------------------------------");
        	
            assertEquals(s1.length() + s2.length(), (s1 + s2).length());
        }
    

}
