import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		int dia;
		Scanner entrada=new Scanner(System.in);

		System.out.println("Digite o dia 1 a 7");
		dia=entrada.nextInt();
		
		//comentario de uma linha
		
		/*if(dia==1) {
			System.out.println("Domingo");
		}
		else {
			if(dia==2) {
				System.out.println("Segunda");
			}
			else {
				System.out.println("Valor invalido");

			}
			
		}*/
		
		switch(dia) {
		
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		default:
			System.out.println("Valor invalido!!");
			
		}
	}
}
