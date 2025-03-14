import java.util.Scanner;
import java.util.Locale;

public class Usuario {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primerio numero");
        int num1 = scanner.nextInt();


        System.out.println("Digite o segundo numero");
        int num2 = scanner.nextInt();


        System.out.println("Digite a operação numero: * + - / ");
        int operador = scanner.nextInt();

        


    }

    
}
