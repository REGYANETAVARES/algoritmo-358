/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetor6;

import java.util.Scanner;

public class GerenciadorDeMercadorias {

    // Método que executa a lógica do programa
    public void executar() {
        // Definir variáveis
        double[] precoCompra = new double[100];
        double[] precoVenda = new double[100];
        double lucro;
        int totLucroMenor10 = 0, totLucroMenor20 = 0, totLucroMaior20 = 0;
        Scanner scanner = new Scanner(System.in);

        // Entrada dos preços de compra e venda
        for (int i = 0; i < 100; i++) {
            System.out.print("\nPreço de compra da mercadoria " + (i + 1) + ": ");
            precoCompra[i] = scanner.nextDouble();
            System.out.print("Preço de venda da mercadoria " + (i + 1) + ": ");
            precoVenda[i] = scanner.nextDouble();
        }

        // Calcular o lucro e classificar as mercadorias
        for (int i = 0; i < 100; i++) {
            lucro = precoVenda[i] - precoCompra[i];

            if (lucro < 10.0) {
                totLucroMenor10++;
            } else if (lucro <= 20.0) {
                totLucroMenor20++;
            } else {
                totLucroMaior20++;
            }
        }

        // Saída dos resultados
        System.out.println("\nTotal de mercadorias com lucro < 10%: " + totLucroMenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totLucroMenor20);
        System.out.println("Total de mercadorias com lucro > 20%: " + totLucroMaior20);
    }
}