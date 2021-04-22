public class Menu{
	public static int aleatorio(int numero)
{
return (int)Math.round(Math.floor(Math.random()*numero)+1);
}
	public static float sumar(float a, float b){
		return a+b;
}

	public static void menu(){
int opc;
float resultado;
do{
	System.out.println("1. opcion 1");
	System.out.println("2. opcion 2");
	System.out.println("3. opcion 3");
	System.out.println("4. opcion 4");
	System.out.println("5. opcion 5");
	System.out.println("6. salir");
	opc = aleatorio(6);
	System.out.println("-------"+opc+"-------");

	if(opc == 1)
	{
	//resultado = sumar(5,89);
	//System.out.println("El resultado es"+resultado);
	System.out.println("El resultado es "+sumar(15,9));
	}

	}while(opc != 6);

	}

	public static void main(String[] args) {
	menu();
 }
}