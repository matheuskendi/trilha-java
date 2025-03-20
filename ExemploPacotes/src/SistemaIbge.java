public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.value()) {
            System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.RIO_JANEIRO;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getIbge());
    }
}
