	public class For{
public static void main (String[]args){
	int i, delta = 5;
	for(i=0; i<=10; i+=delta){ //i++ equivale a i=i+1
		System.out.println(i);
	}
	do{
		System.out.println(i);
		i = i + delta;
	}while((i<=100));
	
	while(i<=100)
	{
		System.out.println(i);
		i = i + delta;
	}
	}
}
