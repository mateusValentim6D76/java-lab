package big_o_notation;

public class Quadratic {
    public static void main(String[] args) {
        String[] persons = {"Alice", "Bob", "Carlos"};

        for (String a : persons) {
            for (String b : persons) {
                System.out.println(a + " cumprimenta " + b);
            }
        }
    }
}