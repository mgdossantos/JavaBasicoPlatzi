import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao7{
	public static void main(String args[]){

		String nome;
		int numeroSorteado,chute;
		Scanner entrada=new Scanner(System.in);
		Random gerador=new Random();
		
		System.out.println("");
		System.out.println("Bem-vindo ao jogo de Adivinhacao");
		System.out.println("Qual seu nome?");
		nome=entrada.next();
		System.out.println("Comecaremos o jogo para voce "+nome);
		System.out.println("Sorteando um numero aleatorio entre 0 e 50");
		numeroSorteado=gerador.nextInt(50);
		System.out.println("Menu");
		System.out.println("Nivel 1 - 7 Tentativas");
		System.out.println("Nivel 2 - 5 Tentativas");
		System.out.println("Nivel 3 - 3 Tentativas");
		int nivel=entrada.nextInt();
		
		switch(nivel) {
		case 1:
			System.out.println("Nivel 1");
			System.out.println("Pronto!! Numero escolhido, chegou a sua vez. Adivinhe o numero sorteado!!!");
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
			break;
			
		case 2:
			System.out.println("Nivel 2");
			System.out.println("Pronto!! Numero escolhido, chegou a sua vez. Adivinhe o numero sorteado!!!");
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
			break;
		case 3:
			System.out.println("Nivel 3");
			System.out.println("Pronto!! Numero escolhido, chegou a sua vez. Adivinhe o numero sorteado!!!");
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
			break;
		}
		
		
	}
}