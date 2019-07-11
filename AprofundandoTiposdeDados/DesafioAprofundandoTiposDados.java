import java.util.Scanner;

public class DesafioAprofundandoTiposDados {

	public static void main(String[] args) {
		/* desenvolva um programa para o setor de recursos 
		humanos de uma empresa. Você deverá criar as seguintes 
		variáveis e guardar valores nelas dentro do seu programa: 
		salário bruto, salário líquido 
		e o nome do funcionário. */
		double salarioBruto, salarioLiquido;
		String nomeFuncionario;
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Digite o nome do funcionario");
		nomeFuncionario=entrada.nextLine();
		
		System.out.println("Digite o salario Bruto");
		salarioBruto=entrada.nextDouble();
		
		System.out.println("Digite o salario Liquido");
		salarioLiquido=entrada.nextDouble();
		
		System.out.println("Funcionario: "+nomeFuncionario);
		System.out.println("Salario Bruto: R$ "+salarioBruto);
		System.out.println("Salario Liquido: R$ "+salarioLiquido);

		
		

	}

}
