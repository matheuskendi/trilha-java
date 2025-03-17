public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T" ; //m /b

        switch (plano) {
            case "T":{
                System.out.println("5GB Youtube");
            }
                break;
            case "M":{
                System.out.println("Whats e Instagram GRATIS");
            }
                break;
            case "B":{
                System.out.println("100 min de ligação");
            }
                break;
        
            default:
                break;
        }
    }
}
