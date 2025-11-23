package big_o_notation;

public class Factorial {
    public static void exchange(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            exchange(remaining, result + c);
        }
    }

    public static void main(String[] args) {
        exchange("ABC", "");
    }
}
