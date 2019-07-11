import java.util.Scanner;

public class ControleDespesas {

	public static void main(String[] args) {
		
	int mes;
	mes=3;
	double [][]gastos=new double[3][2];
	double []salario= new double[3];
	double []despesas= new double[3];
	Scanner entrada=new Scanner(System.in);
	double soma;
		
	for(int i=0;i<3;i++) {
		soma=0;
		System.out.println("Digite seu salrio: ");
		salario[i]=entrada.nextDouble();
		for(int j=0;j<2;j++) {
			System.out.println("Digite seus gastos: ");
			gastos[i][j]=entrada.nextDouble();
			soma=soma+gastos[i][j];
		}
		despesas[i]=soma;
		
	}
	

	
	for(int i=0;i<gastos.length;i++) {
		System.out.println("Gastos Mes: "+(i+1));
		System.out.println("Soma Despesas: "+despesas[i]);
		System.out.println("Salario: "+salario[i]);
		System.out.println("Saldo do mes: "+(salario[i]-despesas[i]));
		System.out.println("");
		
	}
	
	}
	

}
