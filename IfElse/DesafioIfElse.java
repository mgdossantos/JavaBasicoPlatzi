import java.util.Scanner;


public class DesafioIfElse{
	public static void main(String args[]){

		String nome;
		int idade;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Entre com o seu nome: ");
		nome=entrada.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade=entrada.nextInt();
		
		if(idade<18) {
			System.out.println(nome+ ", voce eh menor de idade!!!");
		}
		else {
			System.out.println(nome+ ", voce eh maior de idade!!!");
		}
		

	}

}
