package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class OrdenacaoParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Número de linhas de entrada

        // Lista para armazenar os valores pares
        List<Integer> pares = new ArrayList<>();

        // Lista para armazenar os valores ímpares
        List<Integer> impares = new ArrayList<>();

        // Ler os valores de entrada e separá-los em pares e ímpares
        for (int i = 0; i < N; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        // Ordenar a lista de pares em ordem crescente
        Collections.sort(pares);

        // Ordenar a lista de ímpares em ordem decrescente
        Collections.sort(impares, Comparator.reverseOrder());

        // Imprimir os valores pares
        for (int valor : pares) {
            System.out.println(valor);
        }

        // Imprimir os valores ímpares
        for (int valor : impares) {
            System.out.println(valor);
        }
    }
}