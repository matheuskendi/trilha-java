import com.sun.source.doctree.SystemPropertyTree;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Matheus", "Maria", "Julia", "Jão"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
        selecaoCandidatos();
        imprimirSelecionados();

    }

    static  void  entrandoEmContato(String candidato) {
        int tentativasRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizada++;
            else
                System.out.println("Contato realziado com sucesso");
        }while(continuarTentando && tentativasRealizada < 3);
        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizada + " tentativas");
        }else{
            System.out.println("Não conseguimos contato com " + candidato + "numero maximo de tentativas" + tentativasRealizada);
        }

    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static  void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Matheus", "Maria", "Julia", "Jão"};
        System.out.println("Imprimindo a lista de candidatos no indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato n° " + (indice + 1) + " é o " + candidatos[indice] );
        }
        System.out.println("Forma abreviada de interação foi each");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato );
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Matheus", "Maria", "Julia", "Jão", "Ana", "Caio"};

        int candidatosSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionado < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "solicitou esse valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + "foi selecionado para vaga.");
                candidatosSelecionado++;
            }

            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0 ;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");

        }else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta");

        }else{
            System.out.println("Aguardar os demais candidatos");
        }
    }

}