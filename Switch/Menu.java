import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Scanner entrada=new Scanner(System.in);

		System.out.println("Menu");
		System.out.println("1 - Opcao 1");
		System.out.println("2 - Opcao 2");
		System.out.println("3 - Opcao 3");
		opcao=entrada.nextInt();
		
		switch(opcao) {
		
		case 1:
			System.out.println("Usuario escolheu 1!!");
			break;
			
		case 2:
			System.out.println("Usuario escolheu 2!!");
			break;
		
		case 3:
			System.out.println("Usuario escolheu 3!!");
			break;
		default:
			System.out.println("Opcao invalida!!");
		}
	}

}
