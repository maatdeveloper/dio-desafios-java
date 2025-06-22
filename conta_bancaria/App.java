import java.util.Scanner;

import src.ContaBancaria;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();
        String agencia, nome;

        System.out.println("Por favor, digite o número da sua agência.");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome.");
        nome = scanner.nextLine();
        
        contaBancaria.setAgencia(agencia);
        contaBancaria.setCliente(nome);
        System.out.println(contaBancaria);
        
        scanner.close();
    }
}