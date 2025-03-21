package apps;

public abstract class ServicosMensagensIstantanea {
    //public void EnviarMensagem() {
    //    ValidandoConectandoInternet();
    //    System.out.println("Enviando Mensagem");
    //    SalvandoHistoricoMensagem();
//
    //}
    //public void ReceberMensagem() {
    //    System.out.println("Recebendo Mensagem");
    //}
    //private void ValidandoConectandoInternet() {
    //    System.out.println("Validando Conectando Internet");
    //}
    //private void SalvandoHistoricoMensagem() {
    //    System.out.println("Salvando Historico Mensagem");
    //}
    public abstract void EnviarMensagem();
    public abstract void ReceberMensagem();
    protected void validarConectadoAinternet(){
        System.out.println("Validando se esta conectado a internet");
    }
}
