public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.mudar_canal();
        System.out.println("Novo status -> Canal atual? " + smartTv.canal);

        smartTv.aumentar_volume();
        smartTv.aumentar_volume();
        smartTv.aumentar_volume();
        smartTv.diminuir_volume();
        System.out.println("Novo status -> Volume atual? " + smartTv.volume);


    }
}
