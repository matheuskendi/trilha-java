public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PIAUI ("PI", "Pauai", 13),
    MARANHAO ("MA", "Maranhão", 14)
    ;

    private String sigla;
    private String nome;
    private int ibge;
    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public static EstadoBrasileiro[] value() {
        return EstadoBrasileiro.values();
    }

    public int getIbge() {
        return ibge;
    }

    public Object getSigla() {
        return sigla;
    }

    public Object getNome() {
        return  nome;
    }
}
