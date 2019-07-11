import java.util.Scanner;
import java.util.Random;

class JogoAdivinhacao3{
	public static void main(String args[]){

		String nome;
		int numeroSorteado;
		Scanner entrada=new Scanner(System.in);
		Random gerador= new Random();
		
		
		System.out.println("");
		System.out.println("Bem-vindo ao jogo de Adivinhacao");
		System.out.println("Qual seu nome?");
		nome=entrada.nextLine();
		System.out.println("Comecaremos o jogo para voce "+nome);
		System.out.println("Sorteando um numero aleatorio entre 1 e 50");
		numeroSorteado= 1+gerador.nextInt(50);
		System.out.println("Numero sorteado: "+numeroSorteado);
		
		
		

	}
}