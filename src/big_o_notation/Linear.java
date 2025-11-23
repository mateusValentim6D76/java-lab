package big_o_notation;

public class Linear {
    public static void main(String[] args) {
        String[] field= {"Grama", "Grama", "Celular", "Grama"};
        for (String item : field) {
            System.out.println("Procurando: " + item);
            if (item.equals("Celular")) {
                System.out.println("Achei!");
                break;
            }
        }
    }
}
