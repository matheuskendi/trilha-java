public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T" ; //m /b

        switch (plano) {
            case "T" -> {
                System.out.println("5GB Youtube");
            }
            case "M" -> {
                System.out.println("Whats e Instagram GRATIS");
            }
            case "B" -> {
                System.out.println("100 min de ligação");
            }
        
            default -> {
            }
        }
    }
}
