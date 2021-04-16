public class Arreglo{
	public static void main(String[]args){
		int arreglo[];
		arreglo = new int[5];

		arreglo[0]= 4;
		arreglo[1]=34;
		arreglo[2]=12;
		arreglo[3]=8;
		arreglo[4]=-2;

		/*for(int i=0; i<arreglo.length; i++ )
		{ //Para imprimir los valores que son menores que 5.
			System.out.println(arreglo[i]);
		}*/
		for(int i:arreglo) //Manera resumida.
		{ //Para imprimir los valores que son menores que 5.
			System.out.println(i);
		}
	}
}