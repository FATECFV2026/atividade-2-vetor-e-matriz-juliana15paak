import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU DE EXERCÍCIOS ---");
            System.out.println("1. Progressão Geométrica");
            System.out.println("2. Sequência Decrescente");
            System.out.println("3. Vetor Dinâmico");
            System.out.println("4. Sequência Crescente com Soma");
            System.out.println("5. Matriz com Valores Incrementais");
            System.out.println("6. Operação entre Matrizes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = in.nextInt();

            switch (opcao) {
                case 1: ex01(); break;
                case 2: ex02(); break;
                case 3: ex03(); break;
                case 4: ex04(); break;
                case 5: ex05(); break;
                case 6: ex06(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        in.close();
    }

    // --- MÉTODOS AUXILIARES ---

    private static int lerValor(Scanner scanner, String mensagem, int min, int max, boolean maxInclusivo) {
        int valor;
        do {
            // System.out.print(mensagem); // Opcional
            valor = scanner.nextInt();
        } while (valor <= min || (maxInclusivo ? valor > max : valor >= max));
        return valor;
    }

    private static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int calcularSoma(int[] vetor) {
        int soma = 0;
        for (int v : vetor) soma += v;
        return soma;
    }

    // --- LÓGICA DOS EXERCÍCIOS ---

    public static int[] progressaoGeometrica(int valorInicial) {
        if (valorInicial > 20) return null;
        int[] vetor = new int[10];
        vetor[0] = valorInicial;
        for (int i = 1; i < 10; i++) vetor[i] = vetor[i - 1] * 2;
        return vetor;
    }

    public static int[] sequenciaDecrescente(int valorInicial) {
        if (valorInicial <= 1 || valorInicial >= 100) return null;
        int[] vetor = new int[10];
        vetor[0] = valorInicial;
        for (int i = 1; i < 10; i++) vetor[i] = vetor[i - 1] - 1;
        return vetor;
    }

    public static int[] vetorDinamico(int tamanho) {
        if (tamanho <= 1 || tamanho > 1000) return null;
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) vetor[i] = i + 1;
        return vetor;
    }

    public static int[] sequenciaCresenteComSoma(int valorInicial) {
        if (valorInicial <= 1 || valorInicial >= 100) return null;
        int[] vetor = new int[10];
        vetor[0] = valorInicial;
        for (int i = 1; i < 10; i++) vetor[i] = vetor[i - 1] + 1;
        
        System.out.println("Soma: " + calcularSoma(vetor));
        return vetor;
    }

    public static int[][] matrizIncrementais(int tamanho) {
        if (tamanho <= 3 || tamanho > 50) return null;
        int[][] matriz = new int[tamanho][tamanho];
        int contador = tamanho + 1;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = contador++;
            }
        }
        exibirMatriz(matriz);
        return matriz;
    }

    public static int[][][] operacaoEntreMatrizes(int tamanho) {
        if (tamanho <= 3 || tamanho > 50) return null;
        int[][] N = new int[tamanho][tamanho];
        int[][] Z = new int[tamanho][tamanho];
        int[][] Soma = new int[tamanho][tamanho];
        int contador = tamanho + 1;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                N[i][j] = contador;
                Z[i][j] = contador;
                Soma[i][j] = N[i][j] + Z[i][j];
                contador++;
            }
        }
        exibirMatriz(N);
        exibirMatriz(Z);
        exibirMatriz(Soma);
        return new int[][][] { N, Z, Soma };
    }

    // ========================================
    // METODOS REQUERIDOS PELO AUTOGRADER
    // NAO REMOVER - Necessarios para avaliacao automatica
    // ========================================

    public static int[] ex01() {
        Scanner in = new Scanner(System.in);
        int v = lerValor(in, "", -9999, 20, true);
        int[] res = progressaoGeometrica(v);
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static int[] ex02() {
        Scanner in = new Scanner(System.in);
        int v = lerValor(in, "", 1, 100, false);
        int[] res = sequenciaDecrescente(v);
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static int[] ex03() {
        Scanner in = new Scanner(System.in);
        int v = lerValor(in, "", 1, 1000, true);
        int[] res = vetorDinamico(v);
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static int[] ex04() {
        Scanner in = new Scanner(System.in);
        int v = lerValor(in, "", 1, 100, false);
        int[] res = sequenciaCresenteComSoma(v);
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static int[][] ex05() {
        Scanner in = new Scanner(System.in);
        int v = lerValor(in, "", 3, 50, true);
        return matrizIncrementais(v);
    }

    public static int[][][] ex06() {
        Scanner in = new Scanner(System.in);
        int v = lerValor(in, "", 3, 50, true);
        return operacaoEntreMatrizes(v);
    }
}