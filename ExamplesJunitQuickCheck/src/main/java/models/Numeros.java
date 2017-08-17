package models;

public class Numeros {
	
	
	
	
	public boolean adicaoIsmaiorquezero(Double n1, Double n2){
		
		Double resultado = n1+ n2;
		return (resultado>0);
	}
	
	
	public static boolean IsPrime(int n){


		//	n=Integer.parseInt(entrada);
		int  cont=0;
		for (int i=1;i<=n;i++ ){
			if(n%i == 0)
				cont=cont+1;
		}
		/* if (cont==2){
		   JOptionPane.showMessageDialog(null, "o numero" +n+ " é primo");
		  }else{
		   JOptionPane.showMessageDialog(null,"o numero" +n+ " não é primo");
		  }*/   

		return (cont==2);
	}
	
}
