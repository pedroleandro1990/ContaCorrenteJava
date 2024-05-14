import java.util.Scanner;

public class ContaCorrente {

	public static void main(String[] args) {
		//Aqui inicializei o saldo da conta corrente do cliente, suponto que ele tenha R$ 400,00
		double saldo= 400;
		int opcao=0;
		
		//Aqui declarei o scanner pra poder fazer a leitura dos inputs
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seja bem-vindo ao Nosso Banco. Digite a opção desejada:");
		  
		//Essa cadeia de String sera exibida enquanto o cliente não encerrar o atendimento	
		String menuExibicao = """
				1 - Saldo da sua conta.
				2 - Efetuar depósito na sua conta.
				3 - Efetuar saque na sua conta.
				4 - Terminar Auto-Atendimento.
				""";
		//Enquanto o cliente não encerrar o atendimento o sistema exibe a cadeia de texto que representa o menu
		while(opcao !=4) {
			System.out.println(menuExibicao);
			opcao= scanner.nextInt();
			switch (opcao) {
	       //cases para cada uma das opções do menu. As primeiras exibem o saldo ao término da transação e a última finaliza o atendimento
			case 1:
	        	System.out.println("O Saldo da sua conta neste momento é: "+ saldo);
	            break;
	        case 2:
	        	System.out.println("Digite o valor que deseja depositar: ");
	        	double deposito = scanner.nextDouble();
	        	saldo += deposito;
	        	System.out.println("O novo Saldo da sua conta neste momento é: "+saldo);
	            break;
	        case 3:
	            System.out.println("Digite a quantia desejada: ");
	            double saque = scanner.nextDouble();
	            if (saque > saldo) {
	            	System.out.println("Não há saldo disponível para atender esta retirada.");
	            } else {
	            	saldo -= saque;
	            	System.out.println("O novo Saldo da sua conta neste momento é: "+saldo);
	            }
	            break;
	        case 4:
	            System.out.println("Obrigado por usar nossos serviços");
	            break;
	        //Se por ventura o cliente digitar uma opção errada o default entra em ação e exibe a mensagem de opção invalida
	        default:
	            System.out.println("Opção inválida. Tente novamente.");
	            break;
		}
		
		
    }
	}

}
