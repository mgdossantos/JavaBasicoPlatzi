import java.util.Scanner;

public class DesafioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int voto,votosWindows=0,votosLinux=0,votosMac=0;
		int numeroDeVotos,cont=0;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Qts eleitores? ");
		numeroDeVotos=entrada.nextInt();
		while(cont<numeroDeVotos) {
			System.out.println("Menu");
			System.out.println("1 - Windows");
			System.out.println("2 - Linux");
			System.out.println("3 - MacOS");
			voto= entrada.nextInt();
			
			
			switch(voto) {
			case 1:
				votosWindows++;
				cont++;
				break;
			case 2:
				votosLinux++;
				cont++;
				break;
			case 3:
				votosMac++;
				cont++;
				break;
			default:
				System.out.println("Voto invalido");
			}
		}
		
		System.out.println("Windows = "+votosWindows);
		System.out.println("Linux = "+votosLinux);
		System.out.println("MacOS = "+votosMac);
	}

}
