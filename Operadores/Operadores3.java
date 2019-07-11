import java.util.Scanner;
public class Operadores3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B;
		Scanner entrada= new Scanner(System.in);
		boolean resultado;
		
		System.out.println("Digite um valor para A: ");
		A=entrada.nextInt();
		
		System.out.println("Digite um valor para B: ");
		B=entrada.nextInt();
		
		//A maior B
		resultado=A>B;
		System.out.println("A eh maior que B: " + resultado);
		
		//A menor B
		resultado=A<B;
		System.out.println("A eh menor que B: " + resultado);
		
		//A eh igual a B
		resultado= A == B;
		System.out.println("A eh igual a B: " + resultado);
		
		// A eh diferente de B
		resultado= A !=B; 
		System.out.println("A eh diferente de B: " + resultado);


		
		
	}

}
