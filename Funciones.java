public class Funciones{
	public static void sinsin(){ //Sin retorno y sin parámetros.
	System.out.println("Función sin datos de entrada y sin parámentros"); //Primer tipo de función.
	}
	public static void sincon(int numero){ //Segundo tipo de función
		System.out.println(numero*numero);
	}
	public static int concon(int numero,String cadena){ //Tercer tipo de función
		System.out.println(cadena);
		return numero;
	}
	public static void DividirSinRetorno(int numero1, int numero2){
		if(numero2!=0){
			System.out.println("La división es "+(numero1/numero2));
		}
		else{
			System.out.println("Error división por cero");
		}
	}
	public static void main(String[]args){
		int respuesta;
		sinsin();
		sincon(256);
		respuesta = concon(5,"Hola Mundo");
		DividirSinRetorno(10,5);

	}
}