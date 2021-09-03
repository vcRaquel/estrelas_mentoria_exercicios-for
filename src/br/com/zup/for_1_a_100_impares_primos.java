package br.com.zup;

public class for_1_a_100_impares_primos {
    public static void main(String[] args) {
        for (int cont = 1; cont <= 100; cont += 2) {
            int primo = 0;

            for (int contador = 1; contador <= cont; contador++) {
                if (cont % contador == 0) {
                    primo += 1;
                }
            }
            if (primo == 2 || cont == 1) {
                System.out.println(cont);
            }

        }
    }
}

