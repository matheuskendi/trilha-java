package apps;

public class FacebookMessenger extends ServicosMensagensIstantanea {


    @Override
    public void EnviarMensagem() {
        validarConectadoAinternet();
        System.out.println("Enviando Mensagem Facebook ");
    }

    public void ReceberMensagem() {
        System.out.println("Recebendo Mensagem Facebook");
    }
}
