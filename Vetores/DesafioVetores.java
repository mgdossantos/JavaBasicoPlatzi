import java.util.*;

public class DesafioVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TAM=5;
		double[] tempoCorrida=new double[TAM];
		double soma,media;
		soma=0;
		Scanner entrada=new Scanner(System.in);

		for(int i=0;i<tempoCorrida.length;i++) {
			System.out.println("Digite o tempo da corrida "+(i+1)+": ");
			tempoCorrida[i]=entrada.nextDouble();
			soma=soma+tempoCorrida[i];
		}
		
		for(int i=0;i<tempoCorrida.length;i++) {
			System.out.println("O tempo da corrida "+(i+1)+" foi: "+tempoCorrida[i]);
		}
		media=soma/tempoCorrida.length;
		System.out.println("E a media do dia foi:" +media);
	}
	

}
