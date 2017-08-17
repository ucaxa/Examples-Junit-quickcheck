package models;



public class PesquisaArrays {



	public static boolean pertenceAoArray(int[] array, int n ){

		boolean achou=false;
		for( int i=0; i < array.length; i++)
		{
			if (array[i]==n)
			{
				achou=true;
				break;
			}

		}	
		return achou;
	}
}
