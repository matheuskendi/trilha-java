import java.util.Scanner;
import java.util.Locale;

public class Usuario {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primerio numero");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("Digite o operador desejado: + - * /");
        String op = scanner.next();
        
        int resultados = 0;

        //resultados com o IF
        //if ( op.equals("+")){
        //    resultados = num1 + num2 ;
        //    System.out.println("O resultado é: " + resultados );
//
        //}else if( op.equals("-")) {
        //    resultados = num1 - num2 ;
        //    System.out.println("O resultado é: " + resultados);
        //
        //}else if( op.equals("*")) {
        //    resultados = num1 * num2 ;
        //    System.out.println("O resultado é: " + resultados);
//
        //}else if( op.equals("/")) {
        //    if((num1 > 0)&&(num2 > 0)){
        //        resultados = num1 / num2 ;
        //        System.out.println("O resultado é: " + resultados);
        //    }else{
        //            System.out.println("Erro!! Não pode ser dividido por 0, troque o numero!!");
        //    }
        //    
        //}

        //resultados com o Switch
        switch (op) {
            case "+":
                resultados = num1 + num2;
                System.out.println("O resultado é : " + resultados);                
                break;

            case "-":
                resultados = num1 - num2;
                System.out.println("O resultado é : " + resultados);                
                break;

            case "*":
                resultados = num1 * num2;
                System.out.println("O resultado é : " + resultados);                
                break;

            case "/":
                if((num1 > 0)&&(num2 > 0)){
                    resultados = num1 / num2;
                    System.out.println("O resultado é : " + resultados);         
                }else{
                     System.out.println("Erro!! Não pode ser dividido por 0, troque o numero!!");
                }
                break;
        
            default:
                System.out.print("Operação inválida! Escolha entre +, -, * ou /.");
                break;
        }
    }

}
