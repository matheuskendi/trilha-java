package apps;

public class TelegramMessenger extends ServicosMensagensIstantanea {

    @Override
    public void EnviarMensagem() {
        validarConectadoAinternet();
        System.out.println("Enviando Mensagem Telegram");
    }

    public void ReceberMensagem() {
        System.out.println("Recebendo Mensagem Telegram");
    }
}
