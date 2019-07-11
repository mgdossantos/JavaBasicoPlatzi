import java.util.Scanner;
import java.lang.Math;

public class Operadores1 {

	public static void main(String[] args) {
		
		double qtdHoras,valorDaHora,salarioBruto,salarioLiquido,despesas;
		
		String mes;
		Scanner entrada= new Scanner(System.in);

		//digite o mes
		System.out.println("Digite o mes: ");
		mes=entrada.nextLine();
		
		//digite o valor da hora
		System.out.println("Digite o valor da hora: ");
		valorDaHora=entrada.nextDouble();
		
		//digite o qnt deseja que seja seu salario bruto
		System.out.println("Digite o salario bruto: ");
		salarioBruto=entrada.nextDouble();
		
		//digite as despesas mensais
		System.out.println("Digite as despesas mensais: ");
		despesas=entrada.nextDouble();
		
		//calcule o salario liquido
		salarioLiquido=salarioBruto-despesas;
		
		
		//calcular qtdHoras	
		qtdHoras=salarioBruto/valorDaHora;
		
		System.out.println("Voce devera trabalhar "+Math.round(qtdHoras)+" no mes de "+mes);
		System.out.println("E sobrara R$"+ salarioLiquido +" para poupar");

	}

}
