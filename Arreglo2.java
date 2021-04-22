public class Arreglo2{
	public static void main (String[]args){
int[] arreglo=  {1,2,3,4,5,6,7};

            System.out.print("[");

            for(int i=0;i<arreglo.length;i++){

                if(i<arreglo.length-1){

                System.out.print(arreglo[i]+" ,");}

            

                if(i==arreglo.length-1){

                    System.out.print(arreglo[i]);
                }
            }

            System.out.print("]");	
	}
}
