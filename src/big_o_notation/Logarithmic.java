package big_o_notation;

import java.util.Arrays;

public class Logarithmic {
    public static void main(String[] args) {
        int[] pages = {2, 4, 6, 8, 10, 12};
        int index = Arrays.binarySearch(pages, 10);
        System.out.println("Página encontrada no índice: " + index);
    }
}
