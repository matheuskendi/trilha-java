public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume= 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentar_volume(){
        volume++;
    }

    public void diminuir_volume(){
        volume--;
    }

    public void mudar_canal(){
        canal++;
    }
}