package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner();

        Impressora impressora = new EquipamentoMultifuncional();
        Digitalizadora digitalizadora = new Scanner();
        Copiadora copiadora = new EquipamentoMultifuncional();

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();


    }
}