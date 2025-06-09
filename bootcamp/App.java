import java.time.LocalDate;
import java.util.Scanner;

import src.Bootcamp;
import src.Curso;
import src.Dev;
import src.Mentoria;

public class App {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Java Developer", LocalDate.now());
        Dev javeiro = new Dev("James Gosling");
        Curso curso1 = new Curso("Programacao em Java", 36);
        Curso curso2 = new Curso("Git e GitHub", 6);
        Curso curso3 = new Curso("Linux Command Line", 6);
        Scanner scanner = new Scanner(System.in);
        int opcao, i;

        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);
        bootcamp.adicionarCurso(curso3);
        
        javeiro.inscreverBootcamp(bootcamp);
        // inicia aqui

        while (true) {
            menu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    javeiro.dadosBootcamp();

                    break;
                case 2:
                    if (javeiro.getBootcamp().isConcluido()) {
                        System.out.println("O bootcamp já foi concluido.");
                        continue;
                    }
                    if (javeiro.getBootcamp().cursos.size() <= 0) {
                        System.out.println("Nao tem cursos disponiveis.");
                        continue;
                    }

                    System.out.println("Escolha o curso:");
                    i = 1;

                    for (Curso c : javeiro.getBootcamp().cursos) { 
                        System.out.println( i + " - " + c.getTitulo());
                        i++;
                    }

                    opcao = scanner.nextInt();

                    if (opcao > javeiro.getBootcamp().cursos.size() || opcao < 1) {
                        System.out.println("Opcao invalida!");
                    } else if (javeiro.getBootcamp().cursos.get(opcao - 1).isConcluido()) {
                        System.out.println("Este curso já foi concluido!");
                    } else {
                        javeiro.getBootcamp().assistirCurso(opcao - 1);
                    }

                    break;
                case 3:
                    if (javeiro.getBootcamp().isConcluido()) {
                        System.out.println("O bootcamp já foi concluido.");
                        continue;
                    }
                    if (javeiro.getBootcamp().mentorias.size() <= 0) {
                        System.out.println("Nao tem mentorias disponiveis.");
                        continue;
                    }

                    System.out.println("Escolha a mentoria:");
                    i = 1;

                    for (Mentoria m : javeiro.getBootcamp().mentorias) { 
                        System.out.println( i + " - " + m.getTitulo());
                        i++;
                    }

                    opcao = scanner.nextInt();

                    if (opcao > javeiro.getBootcamp().mentorias.size() || opcao < 1) {
                        System.out.println("Opcao invalida!");
                    } else {
                        javeiro.getBootcamp().assistirMentoria(opcao - 1);
                    }

                    break;
                case 4:
                    System.out.println("Saindo...");
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
        System.out.println("===================================");
        System.out.println(" Ola dev! ---------->");
        System.out.println("  Voce está inscrito num bootcamp");
        System.out.println("===================================");
        System.out.println("| 1 - Ver bootcamp");
        System.out.println("| 2 - Assistir curso");
        System.out.println("| 3 - Assistir mentoria");
        System.out.println("| 4 - Sair");
        System.out.println();
        System.out.print("> ");
    }
}