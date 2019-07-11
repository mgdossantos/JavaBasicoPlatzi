import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// escrever um programa usando do while onde
		// o usuario digita o nome, o programa verifica o tamanho do nome
		// se for menor que 3 ele fica repetindo o pedido
		String nome;
		int qtd;
		Scanner entrada=new Scanner(System.in);
		boolean valida;
		
		do {
			
			System.out.println("Digite seu nome: ");
			nome= entrada.next();
			qtd= nome.length();
			if(qtd<3) {
				System.out.println("Vc digitou um nome cujo tamanho eh menor que 3");
				valida=false;
			}
			else {
				System.out.println("Dados digitados corretamente!!");
				valida=true;
			}
			
		}
		
		while(valida!=true);
		System.out.println("Dadaos gravados corretamente!!!!!");
		
	}
	
}
