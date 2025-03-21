import apps.FacebookMessenger;
import apps.MsnMessenger;
import apps.ServicosMensagensIstantanea;
import apps.TelegramMessenger;

public class ComputadorMatheus {
    public static void main(String[] args) {
        //System.out.println("Qual q plataforma que deseja enviar? Facebook [f], Telegram [t], Msn[m]:");
        //Scanner scanner = new Scanner(System.in);


        //    apps.FacebookMessenger fcb = new apps.FacebookMessenger();
        //    System.out.println("Facebook");
        //    fcb.EnviarMensagem();
        //    fcb.ReceberMensagem();

        //    apps.TelegramMessenger tl = new apps.TelegramMessenger();
        //    System.out.println("Telegram");
        //    tl.EnviarMensagem();
        //    tl.ReceberMensagem();

        //    apps.MsnMessenger msn = new apps.MsnMessenger();
        //    System.out.println("MSN");
        //    msn.EnviarMensagem();
        //    msn.ReceberMensagem();

        ServicosMensagensIstantanea smi = null;

        String appEscolhido = "tl";

        if (appEscolhido.equals("tl")) {
            smi = new TelegramMessenger();
        } else if (appEscolhido.equals("msn")) {
            smi = new MsnMessenger();
        } else if (appEscolhido.equals("facebook")) {
            smi = new FacebookMessenger();
        }else{
            System.out.println("Erro!!");
        }
        smi.EnviarMensagem();
        smi.ReceberMensagem();

    }
}