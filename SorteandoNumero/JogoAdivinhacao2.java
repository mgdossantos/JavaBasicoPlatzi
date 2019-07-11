import java.util.Random;

public class JogoAdivinhacao2{
	public static void main(String args[]){
		
		Random gerador= new Random();
		int numeroSorteado;
		

		//sorteando qualquer numero inteiro
		numeroSorteado=gerador.nextInt();
		System.out.println("Numero sorteado "+numeroSorteado);
		
		//sorteando um numero inteiro de 0 a 9
		numeroSorteado=gerador.nextInt(10);
		System.out.println("Numero sorteado entre 0 e 9: "+numeroSorteado);

		//sorteando um numero inteiro de 1 a 10

		numeroSorteado=1+gerador.nextInt(10);
		System.out.println("Numero sorteado entre 1 e 10: "+numeroSorteado);

		
	}
}
