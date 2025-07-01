import java.util.Scanner;

import src.Aba;
import src.AparelhoTelefonico;
import src.Contato;
import src.Musica;
import src.NavegadorInternet;
import src.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando sistema...");
        System.out.println("...");
        
        menu();
        System.out.print("Escolha: ");
        int opcao = scanner.nextInt();

        while (true) {
            switch (opcao) {
                case 0:
                    System.out.println("Desligando sistema...");
                    scanner.close();
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Suas musicas:");
                    reprodutorMusical.mostrarPlaylist();
                    Musica musica;
                    String msc;

                    while (true) {
                        System.out.println("Escolha uma opcao: ");
                        System.out.println("1 - Tocar musica");
                        System.out.println("2 - Adicionar musica");
                        System.out.println("3 - Remover musica");
                        System.out.println("4 - Mostrar playlist");
                        System.out.println("5 - Voltar");
                        opcao = scanner.nextInt();

                        if (opcao < 1 && opcao > 5) {
                            System.out.println("Opcao invalida!");
                            continue;

                        } else if (opcao == 1) {
                            System.out.println("Escolha uma musica: ");
                            reprodutorMusical.mostrarPlaylist();

                            msc = scanner.nextLine();
                            musica = new Musica(msc, 200);
                            reprodutorMusical.selecionar(musica);
                            reprodutorMusical.tocar();

                        } else if (opcao == 2) {
                            System.out.println("Adicione uma musica: ");
                            msc = scanner.nextLine();
                            musica = new Musica(msc, 200);
                            reprodutorMusical.adicionar(musica);

                        } else if (opcao == 3) {
                            System.out.println("Remova uma musica: ");
                            msc = scanner.nextLine();
                            musica = new Musica(msc, 200);
                            reprodutorMusical.remover(musica);

                        } else if (opcao == 4) {
                            System.out.println("Suas musicas:");
                            reprodutorMusical.mostrarPlaylist();

                        } else if (opcao == 5) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Seus contatos: ");
                    aparelhoTelefonico.meusContatos();
                    Contato contato;
                    String ctt;
                    int num;

                    while (true) {
                        System.out.println("Escolha uma opcao: ");
                        System.out.println("1 - Ligar para contato");
                        System.out.println("2 - Adicionar contato");
                        System.out.println("3 - Remover contato");
                        System.out.println("4 - Mostrar contatos");
                        System.out.println("5 - Gravar correio de voz");
                        System.out.println("6 - Voltar");
                        opcao = scanner.nextInt();

                        if (opcao < 1 && opcao > 6) {
                            System.out.println("Opcao invalida!");
                            continue;
                        } else if (opcao == 1) {
                            System.out.println("Digite o numero:");
                            num = scanner.nextInt();
                            contato = new Contato("Desconhecido", num);
                            aparelhoTelefonico.ligar(contato);

                        } else if (opcao == 2) {
                            System.out.println("Nome: ");
                            ctt = scanner.nextLine();
                            System.out.println("Numero: ");
                            num = scanner.nextInt();

                            contato = new Contato(ctt, num);
                            if (aparelhoTelefonico.adicionar(contato)) {
                                System.out.println("Contato adicionado!");
                            } else {
                                System.out.println("Erro");
                            }

                        } else if (opcao == 3) {
                            System.out.println("Nome: ");
                            ctt = scanner.nextLine();
                            System.out.println("Numero: ");
                            num = scanner.nextInt();

                            contato = new Contato(ctt, num);
                            if (aparelhoTelefonico.remover(contato)) {
                                System.out.println("Contato removido!");
                            } else {
                                System.out.println("Erro");
                            }

                        } else if (opcao == 4) {
                            System.out.println("Seus contatos:");
                            aparelhoTelefonico.meusContatos();

                        } else if (opcao == 5) {
                            System.out.println("Grave seu correio de voz: ");
                            ctt = scanner.nextLine();
                            aparelhoTelefonico.iniciarCorreioVoz(ctt);

                        } else if (opcao == 6) {
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Abas abertas:");
                    navegadorInternet.abasAbertas();
                    Aba aba;
                    String abb, link;

                    while (true) {
                        System.out.println("Escolha uma opcao: ");
                        System.out.println("1 - Atualizar aba");
                        System.out.println("2 - Abrir aba");
                        System.out.println("3 - Fechar aba");
                        System.out.println("4 - Abas abertas");
                        System.out.println("5 - Voltar");
                        opcao = scanner.nextInt();

                        if (opcao < 1 && opcao > 5) {
                            System.out.println("Opcao invalida!");
                            continue;

                        } else if (opcao == 1) {
                            System.out.println("Aba para atualizar: ");
                            abb = scanner.nextLine();
                            System.out.println("Link: ");
                            link = scanner.nextLine();

                            aba = new Aba(abb, link);
                            navegadorInternet.atualizar(aba);
                            
                        } else if (opcao == 2) {
                            System.out.println("Link do site: ");
                            link = scanner.nextLine();
                            System.out.println("Nome: ");
                            abb = scanner.nextLine();
                            
                            aba = new Aba(abb, link);
                            if (navegadorInternet.adicionar(aba)) {
                                System.out.println("Aba aberta com sucesso!");
                            } else {
                                System.out.println("Erro inesperado!");
                            }

                        } else if (opcao == 3) {
                            System.out.println("Link do site: ");
                            link = scanner.nextLine();
                            System.out.println("Nome: ");
                            abb = scanner.nextLine();

                            aba = new Aba(abb, link);
                            if (navegadorInternet.remover(aba)) {
                                System.out.println("Aba fechada com sucesso!");
                            } else {
                                System.out.println("Erro inesperado!");
                            }

                        } else if (opcao == 4) {
                            navegadorInternet.abasAbertas();

                        } else if (opcao == 5) {
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Está opcao nao existe!");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println(":--- Aplicativos do sistema ---:");
        System.out.println("0 \\ Sair");
        System.out.println("1 \\ Reprodutor Musical");
        System.out.println("2 \\ Aparelho Telefonico");
        System.out.println("3 \\ Navegador Internet");
    }
}