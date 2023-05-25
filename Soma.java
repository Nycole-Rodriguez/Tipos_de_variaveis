import java.util.Scanner;

public class Soma {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	int soma1;
	int soma2;
	int resultado;
	System.out.println("Digite o pimeiro número");
		soma1 = scan.nextInt();
		System.out.println("Digite o segundo número");
        soma2 = scan.nextInt();
		resultado = soma1+soma2;
		
			System.out.println("O resultado da soma é:"+ resultado);	
			
			scan.close();
	}
	
	
	

}
