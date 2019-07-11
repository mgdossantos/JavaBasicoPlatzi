import java.util.*;
public class Vetores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] temperaturasSensores=new double[5];
		double soma,media;
		soma=0;
		Scanner entrada=new Scanner(System.in);
		
		for(int i=0;i<temperaturasSensores.length;i++) {
			System.out.println("digite a primeira temperatura: ");
			temperaturasSensores[i]=entrada.nextDouble();
			soma=soma+temperaturasSensores[i];
			
		}
		
		for(int i=0;i<temperaturasSensores.length;i++) {
			System.out.println("Temperatura: "+ temperaturasSensores[i]);
			
		}
		
		media=soma/5;
				
		System.out.println("Media das temperaturas: "+media);
	}

}
