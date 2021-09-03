package br.com.zup;

public class for_1_a_100_impar {
    public static void main(String[] args) {
        for (int cont = 1; cont <= 100; cont += 1) {
            if (cont % 2 != 0) {
                System.out.println(cont);
            }
        }
    }
}
