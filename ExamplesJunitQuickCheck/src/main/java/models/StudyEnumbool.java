package models;



public class StudyEnumbool {
	
	
	
	public static boolean IsProfessorEfetivo(String tp, boolean Efetivo){
		
			
		if ((tp.equals("Professor")) && (Efetivo=true)){
			return true;
		}
		
		return false;
				
	}
	

	

}
