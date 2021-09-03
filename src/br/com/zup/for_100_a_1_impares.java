package br.com.zup;

public class for_100_a_1_impares {
    public static void main(String[] args) {
        for (int cont = 100; cont >= 1; cont -= 1) {
            if (cont % 2 != 0) {
                System.out.println(cont);
            }
        }
    }
}
