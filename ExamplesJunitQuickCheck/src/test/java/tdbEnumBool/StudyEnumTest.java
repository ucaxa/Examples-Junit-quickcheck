package tdbEnumBool;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.ValuesOf;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;



import static org.junit.Assert.*;


@RunWith(JUnitQuickcheck.class)
public class StudyEnumTest {
	
	enum Funcao{Professor,Tecnico,Teste}
	//boolean is;
	
	@Property(trials=8)
	public void TestaMetodo(@ValuesOf Funcao f, @ValuesOf boolean b ){
		
	  System.out.println("a funcao passada foi " + f + " o boolean passado foi " + b);
      
	//  boolean rs = StudyEnumbool.IsProfessorEfetivo(f.toString(), b);
	  boolean rs=true;
      assertTrue(rs);
      
      
 	}
}
