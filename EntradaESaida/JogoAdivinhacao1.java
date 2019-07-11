import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao1{
	public static void main(String args[]){

		Scanner entrada=new Scanner(System.in);
		String nome;
		
		//Boas vindas
		System.out.println("Seja bem-vindo ao Jogo de Adivinhacao");
		//Pede o nome do usuario
		System.out.println("Digite seu nome: ");
		nome= entrada.nextLine();
		System.out.println("Comecaremos o jogo para voce "+nome);
		
		//Informacoes para o usuario
		System.out.println("Sortearemos um numero de 0 a 50 para voce");
		
	}
}
