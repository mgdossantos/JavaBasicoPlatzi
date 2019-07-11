import java.util.*;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tarefas= new String[5];
		int[] contexto= new int[5];

		int[] status = new int[5];
		int op,ultimo,pesquisa;
		Scanner entrada= new Scanner(System.in);
		op=-1;
		ultimo=0;
		while(op!=0) {
			
			System.out.println("Sistema de Controle de Tarefas Diario");
			System.out.println("***Menu***");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Modificar");
			System.out.println("3 - Listar Geral");
			System.out.println("4 - Listar por Contexto");
			System.out.println("5 - Listar por Status");
			System.out.println("0 - Sair");
			System.out.println(" ");
			op=entrada.nextInt();
			entrada.nextLine();
			
			switch(op) {
			case 1:
				System.out.println("Qual a sua tarefa? ");
				tarefas[ultimo]=entrada.nextLine();
				
				
				System.out.println("Qual o contexto");
				System.out.println("1- Casa");
				System.out.println("2- Home Office");
				System.out.println("3- Rua");
				 
				contexto[ultimo]=entrada.nextInt();

				System.out.println("Qual o status");
				System.out.println("1- Para Fazer");
				System.out.println("2- Fazendo");
				System.out.println("3- Feito");
				status[ultimo]=entrada.nextInt();
				ultimo++;
				System.out.println("Seus dados foram armazenados!!");
				break;
				
			case 2:
				System.out.println("Qual a ID da tarefa que deseja modificar?");
				pesquisa=entrada.nextInt();
				
				System.out.println("Qual o contexto");
				System.out.println("1- Casa");
				System.out.println("2- Home Office");
				System.out.println("3- Rua");
				contexto[pesquisa-1]=entrada.nextInt();

				System.out.println("Qual o status");
				System.out.println("1- Para Fazer");
				System.out.println("2- Fazendo");
				System.out.println("3- Feito");
				status[pesquisa-1]=entrada.nextInt();
				
				System.out.println("Seus dados foram modificados!!");

				break;
			
			case 3:
				for(int i=0;i<ultimo;i++) {
					System.out.println("ID da tarefa: "+(i+1));
					System.out.println("Tarefa: "+tarefas[i]);
					if(contexto[i]==1) {
						System.out.println("Contexto: Casa");
					}
					if(contexto[i]==2) {
						System.out.println("Contexto: Home Office");
					}
					if(contexto[i]==3) {
						System.out.println("Contexto: Rua");
					}
					if(status[i]==1) {
						System.out.println("Status: Para fazer");
					}
					if(status[i]==2) {
						System.out.println("Status: Fazendo");
					}
					if(status[i]==3) {
						System.out.println("Status: Feito");
					}
				}
				break;
			case 4:
				System.out.println("Por qual contexto?");
				System.out.println("1- Casa");
				System.out.println("2- Home Office");
				System.out.println("3- Rua");
				pesquisa=entrada.nextInt();
				for(int i=0;i<ultimo;i++) {
					if(contexto[i]==pesquisa) {
						System.out.println("ID da tarefa: "+(i+1));
						System.out.println("Tarefa: "+tarefas[i]);
						if(status[i]==1) {
							System.out.println("Status: Para fazer");
						}
						if(status[i]==2) {
							System.out.println("Status: Fazendo");
						}
						if(status[i]==3) {
							System.out.println("Status: Feito");
						}
					}
				}
				break;
				
			case 5:
				System.out.println("Qual o status?");
				System.out.println("1- Para Fazer");
				System.out.println("2- Fazendo");
				System.out.println("3- Feito");
				pesquisa=entrada.nextInt();
				for(int i=0;i<ultimo;i++) {
					if(status[i]==pesquisa) {
						System.out.println("ID da tarefa: "+(i+1));
						System.out.println("Tarefa: "+tarefas[i]);
						if(contexto[i]==1) {
							System.out.println("Contexto: Casa");
						}
						if(contexto[i]==2) {
							System.out.println("Contexto: Home Office");
						}
						if(contexto[i]==3) {
							System.out.println("Contexto: Rua");
						}
					}
				}
				break;

			case 0:
				System.out.println("Saindo do programa!!");
				
			}

		}
	}
	
	
}
