import java.util.Scanner; // Importa a classe Scanner para leitura de entradas do usuário

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para capturar entradas
        String name;
        double balance = 0;
        int choice = 0;

        // Solicita ao usuário que digite seu nome para realizar o cadastro
        System.out.println("Para Realizar o Cadastro Digite seu Nome: ");
        name = scanner.nextLine();

        System.out.println("Cadastro realizado!");

        // Pergunta ao usuário se deseja realizar um depósito inicial
        System.out.println("Deseja realizar Um Deposito Inicial ?!");
        System.out.println("Sim ou Não");
        String option = scanner.next();

        // Verifica se o usuário respondeu sim
        if (option.equals("Sim") || option.equals("sim") || option.equals("s")) {
            System.out.println("Qual Valor Deseja Depositar? ");
            balance = scanner.nextDouble();
            System.out.println("Deposito Realizado com Sucesso!");
        }

        // Inicia um loop que continuará até que o usuário escolha sair (opção 4)
        while (choice != 4) {
            // Exibe as opções disponíveis
            System.out.println("╔═══════════════════╗╔═══════════════════╗");
            System.out.println("║            Opções Disponível           ║ ");
            System.out.println("║           1.Exibir Dados               ║ ");
            System.out.println("║           2.Depositar Valor            ║ ");
            System.out.println("║           3.Sacar Valor                ║ ");
            System.out.println("║           4.Sair                       ║ ");
            System.out.println("╚═══════════════════╝╚═══════════════════╝");
            int menu = scanner.nextInt();

            // Inicia o switch com base na opção escolhida
            switch (menu) {
                case 1:
                    // Exibe os dados do cliente
                    System.out.println("╔═══════════════════╗╔═══════════════════╗");
                    System.out.println("║            Dados do Cliente            ║");
                    System.out.println(" Nome:              " + name);
                    System.out.println(" Tipo de conta:     Corrente");
                    System.out.println(" Saldo disponível:  " + balance + "R$");
                    System.out.println("║                                        ║ ");
                    System.out.println("╚═══════════════════╝╚═══════════════════╝");
                    break; // Sai do switch

                case 2:
                    System.out.println("Qual Valor do depósito?");
                    double deposit = scanner.nextDouble();

                    // Verifica se o valor do depósito é inválido
                    if (deposit <= 0.0) {
                        System.out.println("Saldo Insuficiente!");
                    } else {
                        // Adiciona o depósito ao saldo
                        balance += deposit;
                        System.out.println("Deposíto Realizado com Sucesso!");
                        System.out.println("Seu Saldo Atual é: " + balance + "R$");
                    }
                    break;

                case 3:
                    System.out.println("Qual Valor Deseja Sacar?");
                    double withdraw = scanner.nextDouble(); //

                    // Verifica se o saque é válido
                    if (withdraw <= 0.0 || withdraw > balance) {
                        System.out.println("Saldo Insuficiente!");
                    } else {
                        // Subtrai o saque do saldo
                        balance -= withdraw;
                        System.out.println("Saque Realizado com Sucesso!");
                        System.out.println("Seu Saldo Atual é: " + balance + "R$");
                    }
                    break;

                case 4:
                    System.out.println("Conta Desconectada!");
                    System.exit(0); // Encerra o programa


                default:
                    System.out.println("Opção inválida!!"); // Mensagem de erro para opções inválidas
                    break;
            }
        }
    }
}
