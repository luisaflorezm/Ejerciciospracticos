public class Matrices2
{
	public static void main(String[] args) {
		int datos[][];
		int i,j;
		
		datos = new int[3][4];
		
		datos[0][0] = 3;
		datos[1][1] = -5;
		datos[2][0] = 2;
		
		System.out.println("filas datos.length "+datos.length);
		System.out.println("columnas datos[0].length "+datos[0].length);
		
			for (j = 0; j<datos[0].length;j++)
		{
		    System.out.print("|");
            for (i = 0; i<datos.length;i++)
            {
                System.out.print(datos[i][j]);
                
                if(i+1<datos.length)
                {
                    System.out.print(",");
                }
            }
            System.out.print("|");
            System.out.println();
            
            /* Como hacer para que la matriz siempre imprima bien, independiente
            de la cantidad de digitos de cada celda. eje: Limitar los digitos de los numeros*/
		}
	}
}