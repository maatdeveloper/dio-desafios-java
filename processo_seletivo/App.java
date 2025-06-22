import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import src.Candidato;
import src.ProcessoSeletivo;

public class App {
    public static void main(String[] args) {
        ProcessoSeletivo processoSeletivo = new ProcessoSeletivo(2400, "Desenvolvedor BackEnd Junior");
        Candidato[] candidatos = new Candidato[10];
        Scanner scanner = new Scanner(System.in);

        candidatos[0] = new Candidato("Joao");
        candidatos[1] = new Candidato("Maria");
        candidatos[2] = new Candidato("Daniela");
        candidatos[3] = new Candidato("Guilherme");
        candidatos[4] = new Candidato("Matheus");
        candidatos[5] = new Candidato("Bianca");
        candidatos[6] = new Candidato("Fernando");
        candidatos[7] = new Candidato("Eduardo");
        candidatos[8] = new Candidato("Davi");
        candidatos[9] = new Candidato("Iasmin");

        for (int i=0; i<10; i++) {
            candidatos[i].setPretensaoSalarial(valorPretendido());
        }

        System.out.println("--- PROCESSO SELETIVO ---");

        for (int i=0; i<10; i++) {
            processoSeletivo.avaliarCandidato(candidatos[i]);
        }

        processoSeletivo.mostrarCandidatosSelecionados();
        processoSeletivo.ligarParaCandidatos();

        scanner.close();
    }

    public static int valorPretendido() {
        return ThreadLocalRandom.current().nextInt(2000, 3000);
    }
}