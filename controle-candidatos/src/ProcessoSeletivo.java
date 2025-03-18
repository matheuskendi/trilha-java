import com.sun.source.doctree.SystemPropertyTree;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProcessoSeletivo {
    public static void main(String[] args) {

        selecaoCandidatos();

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