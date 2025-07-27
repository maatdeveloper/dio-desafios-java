import java.util.Scanner;

import src.Cliente;
import src.Conta;
import src.ContaCorrente;
import src.ContaPolpanca;
import src.Instituicao;
import src.TipoConta;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implementar interface...
        Cliente cliente = new Cliente("Marx", 20);
        Conta ccgpt = new ContaCorrente(1111,
                                        "Generico",
                                        TipoConta.Corrente, 
                                        Instituicao.Caixa); // ContaCorrenteGenericaParaTransferencia
        Conta cpgpt = new ContaPolpanca(2222, 
                                       "Generico",
                                       TipoConta.Poupanca,
                                       Instituicao.Caixa); // ContaPoupancaGenericaParaTranferencia
        int escolha;
        double valor;

        while (true) {
            menu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Conta c;
                    Instituicao i;

                    System.out.println("Escolha uma instituiçao:");
                    System.out.println("1 - Bradesco");
                    System.out.println("2 - Caixa");
                    System.out.println("3 - Itau");
                    System.out.print("> ");
                    escolha = scanner.nextInt();

                    if (escolha == 1) {
                        i = Instituicao.Bradesco;
                    } else if (escolha == 2) {
                        i = Instituicao.Caixa;
                    } else if (escolha == 3) {
                        i = Instituicao.Itau;
                    } else {
                        System.out.println("Instituicao não encontrada.");
                        System.out.println("Abortando operação");
                        continue;
                    }
                    // -------------------------------------------
                    System.out.println("Tipo da conta: ");
                    System.out.println("1 - Corrente");
                    System.out.println("2 - Poupanca");
                    System.out.print("> ");
                    escolha = scanner.nextInt();
                    
                    if (escolha == 1) {
                        c = new ContaCorrente();
                    } else if (escolha == 2) {
                        c = new ContaPolpanca();
                    } else {
                        System.out.println("Opcao invalida.");
                        System.out.println("Abortando operação");
                        continue;
                    }

                    c.setInstituicao(i);
                    c.setTitular(cliente.getNome());
                    c.setNumero(1);

                    cliente.setContaBancaria(c);
                    break;
                case 2:
                    System.out.println(cliente.getContaBancaria());
                    break;
                
                case 3:
                    System.out.println("Quanto deseja depositar?");
                    System.out.print(">");
                    valor = scanner.nextDouble();

                    if (valor < 0.0) {
                        System.out.println("O valor deve ser acima de 0.0");
                        continue;
                    }

                    valor += cliente.getContaBancaria().getSaldo();
                    cliente.getContaBancaria().setSaldo(valor);
                    break;

                case 4:
                    System.out.println("Quanto deseja sacar?");
                    System.out.print(">");
                    valor = scanner.nextDouble();

                    if (valor < 0.0 || valor > cliente.getContaBancaria().getSaldo()) {
                        System.out.println("Operacao abortada.");
                        continue;
                    }

                    valor -= cliente.getContaBancaria().getSaldo();
                    cliente.getContaBancaria().setSaldo(valor);
                    break;

                case 5:
                    System.out.println("Quanto deseja tranferir?");
                    System.out.print(">");
                    valor = scanner.nextDouble();

                    if (valor < 0.0 || valor > cliente.getContaBancaria().getSaldo()) {
                        System.out.println("Operacao abortada.");
                        continue;
                    }

                    cliente.getContaBancaria().transferir(ccgpt, valor);
                    break;
                case 6:
                    System.out.println("saindo...");
                    scanner.close();
                    System.exit(0);

                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        }
    }

    public static void menu() {
        System.out.println("=====================================");
        System.out.println("BANCO DIGITAL");
        System.out.println();
        System.out.println(" 1 - Criar conta");
        System.out.println(" 2 - Mostrar conta");
        System.out.println(" 3 - Depositar");
        System.out.println(" 4 - Sacar");
        System.out.println(" 5 - Transferir");
        System.out.println(" 6 - Sair");
        System.out.print("> ");
    }
}