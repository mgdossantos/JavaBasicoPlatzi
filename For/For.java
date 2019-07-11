import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		String nome;
		double nota,soma,media;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Calculando a media.");
		System.out.println("Digite seu nome: ");
		nome=entrada.next();
		soma=0;
		
		for(int i =0;i<3;i++) {
			System.out.println("Digite sua nota: ");
			nota=entrada.nextDouble();
			soma= soma+nota;
		}
		
		media=soma/3;
		System.out.println("Sua media: "+media);
		
	}

}
