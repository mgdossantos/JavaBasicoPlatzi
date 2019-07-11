import java.util.Scanner;
import java.util.Random;

public class DesafioWhile{
	public static void main(String args[]){
		String nome;
		int numeroSorteado,chute,numeroTentativas;;
		Scanner entrada=new Scanner(System.in);
		Random gerador=new Random();
		System.out.println("");
		System.out.println("Bem-vindo ao jogo de Adivinhacao");
		System.out.println("Qual seu nome?");
		nome=entrada.next();
		System.out.println("Comecaremos o jogo para voce "+nome);
		System.out.println("Sorteando um numero aleatorio entre 0 e 50");
		numeroSorteado=gerador.nextInt(50);
		System.out.println("Pronto!! Numero escolhido, chegou a sua vez!!!");
		
		numeroTentativas=1;
		chute=numeroSorteado+1;		
		
		while(numeroTentativas<8) {
			System.out.println("Tentativa numero: "+numeroTentativas);
			chute=entrada.nextInt();			
			if(chute>numeroSorteado) {
				System.out.println("Você chutou um numero maior que o sorteado!!");
			}
			else {
				if(chute<numeroSorteado) {
					System.out.println("Você chutou um numero menor que o sorteado!!");
				}
				else {
					System.out.println("Você acertou!!");
				}
			}
			numeroTentativas++;
		}
		System.out.println("Game over!!!");
	}
}