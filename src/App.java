

import java.util.Arrays;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);
        // int valor;
        // System.out.println("1. Exercicio 01: Progressao Geometrica\r\n" + 
        //                 "2. Exercicio 02: Sequencia Decrescente\r\n" + 
        //                 "3. Exercicio 03: Vetor Dinamico\r\n" + 
        //                 "4. Exercicio 04: Sequencia Crescente com Soma\r\n" + 
        //                 "5. Exercicio 05: Matriz com Valores Incrementais\r\n" + 
        //                 "6. Exercicio 06: Operacao entre Matrizes\r\n" + 
        //                 "0. Sair");
        // valor = in.nextInt();

        // switch (valor) {
        //     case 0:
        //         break;
        //     case 1:
        //         progressaoGeometrica(valorInicial);
        //         break;
        //     case 2:
        //         sequenciaDecrescente(valorInicial);
        //         break;
        //     case 3:
        //         vetorDinamico(valorInicial);
        //         break;
        //     case 4:
        //         sequenciaCresenteComSoma(valorInicial);
        //         break;
        //     case 5:
        //         matrizIncrementais(tamanho);
        //         break;
        //     case 6:
        //         operacaoEntreMatrizes(tamanho);
        //     default:
        //         break;
        // }
        // in.close();
        // Utilize o método lerValor para validação de entrada
        // Exiba os resultados utilizando Arrays.toString() para vetores
        // Para matrizes, utilize o método exibirMatriz()
    }
    
    /**
     * Metodo auxiliar para ler e validar entrada do usuario
     * @param scanner Scanner para leitura
     * @param mensagem Mensagem a ser exibida
     * @param min Valor minimo (exclusivo)
     * @param max Valor maximo (inclusivo)
     * @return Valor valido lido
     */
    private static int lerValor(Scanner scanner, String mensagem, int min, int max) {
        // TODO: Implementar validacao de entrada
        int valor;
        do{
            valor = scanner.nextInt();
        } while (valor <= min || valor >= max);
        return valor;
    }
    
    /**
     * Metodo auxiliar para exibir matriz formatada
     * @param matriz Matriz a ser exibida
     */
    private static void exibirMatriz(int[][] matriz) {
        // TODO: Implementar exibicao da matriz
        // Use System.out.printf("%4d ", matriz[i][j]) para formatacao
    }
    
    /**
     * Exercicio 01: Progressao Geometrica
     * @param valorInicial Valor inicial (deve ser <= 20)
     * @return Vetor de 10 elementos com progressao geometrica (dobro) ou null se invalido
     */
    public static int[] progressaoGeometrica(int valorInicial) {
        // TODO: Implementar progressao geometrica

        if (valorInicial >= 20){
            return null;
        }
        int [] vetor = new int[10];
        vetor[0] = valorInicial;
        for(int i=1; i<10; i++){
            vetor[i] = vetor[i-1]*2;
        }
        return vetor;
    }
    
    /**
     * Exercicio 02: Sequencia Decrescente
     * @param valorInicial Valor inicial (deve ser > 1)
     * @return Vetor de 10 elementos com sequencia decrescente ou null se invalido
     */
    public static int[] sequenciaDecrescente(int valorInicial) {
        // TODO: Implementar sequencia decrescente

        if (valorInicial > 1 && valorInicial < 100){
            int [] vetor = new int[10];
            vetor[0] = valorInicial;
            for (int i=1; i<10; i++){
                vetor[i] = vetor[i-1] - 1;
            }
            return vetor;
        }
        return null; 
    }
    
    /**
     * Exercicio 03: Vetor Dinamico
     * @param tamanho Tamanho do vetor (deve ser <= 1000)
     * @return Vetor com sequencia de 1 ate tamanho ou null se invalido
     */
    public static int[] vetorDinamico(int tamanho) {
        // TODO: Implementar vetor dinamico

        if(1 < tamanho && tamanho<=1000){
            int [] vetor = new int[tamanho];
            for(int i=0; i<tamanho; i++){
                vetor[i] = i+1;
            }
            return vetor;
        }
        return null; 
    }
    
    /**
     * Exercicio 04: Sequencia Crescente com Soma
     * @param valorInicial Valor inicial
     * @return Vetor de 10 elementos com sequencia crescente
     */
    public static int[] sequenciaCresenteComSoma(int valorInicial) {
        // TODO: Implementar sequencia crescente
        // Criar vetor de 10 elementos
        // vetor[0] = valorInicial
        // Para i=1 ate 9: vetor[i] = vetor[i-1] + 1

        int [] vetor = new int[10];
        vetor[0] = valorInicial;
        for(int i=1; i<10; i++){
            vetor[i] = vetor[i-1] + 1;
        }
        int somaTotal = calcularSoma(vetor);
        System.out.println("Soma: "+somaTotal);
        return vetor;
    }
    
    /**
     * Calcula a soma de todos os elementos do vetor
     * @param vetor Vetor para calcular a soma
     * @return Soma de todos os elementos
     */
    public static int calcularSoma(int[] vetor) {
        // TODO: Implementar calculo da soma
        // Percorrer o vetor e somar todos os elementos
        int soma = 0;
        for(int i=0; i<10; i++){
            soma += vetor[i];
        }
        return soma;
    }
    
    /**
     * Exercicio 05: Matriz com Valores Incrementais
     * @param tamanho Tamanho da matriz quadrada
     * @return Matriz NxN com valores incrementais iniciando em tamanho+1
     */
    public static int[][] matrizIncrementais(int tamanho) {
        // TODO: Implementar matriz com valores incrementais
        // Criar matriz quadrada NxN
        // Contador inicial = tamanho + 1
        // Para cada posicao [i][j]: matriz[i][j] = contador++
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Exercicio 06: Operacao entre Matrizes
     * @param tamanho Tamanho das matrizes quadradas
     * @return Array com 3 matrizes: [0]=N, [1]=Z, [2]=Soma
     */
    public static int[][][] operacaoEntreMatrizes(int tamanho) {
        // TODO: Implementar operacao entre matrizes
        // Criar 3 matrizes NxN: matrizN, matrizZ, matrizSoma
        // Contador inicial = tamanho + 1
        // Para cada posicao [i][j]:
        //   matrizN[i][j] = contador
        //   matrizZ[i][j] = contador (valores iguais)
        //   matrizSoma[i][j] = matrizN[i][j] + matrizZ[i][j]
        //   contador++
        // Retornar array com as 3 matrizes
        return null; // Remover esta linha apos implementacao
    }
    
    // ========================================
    // METODOS REQUERIDOS PELO AUTOGRADER
    // NAO REMOVER - Necessarios para avaliacao automatica
    // ========================================
    
    /**
     * Metodo ex01 para compatibilidade com autograder
     * @return resultado do exercicio 01
     */
    public static int[] ex01() {
        // TODO: Implementar leitura de entrada e chamar progressaoGeometrica()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex02 para compatibilidade com autograder
     * @return resultado do exercicio 02
     */
    public static int[] ex02() {
        // TODO: Implementar leitura de entrada e chamar sequenciaDecrescente()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex03 para compatibilidade com autograder
     * @return resultado do exercicio 03
     */
    public static int[] ex03() {
        // TODO: Implementar leitura de entrada e chamar vetorDinamico()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex04 para compatibilidade com autograder
     * @return resultado do exercicio 04
     */
    public static int[] ex04() {
        // TODO: Implementar leitura de entrada e chamar sequenciaCresenteComSoma()
        Scanner in = new Scanner(System.in);
        int valorInicial = lerValor(in, "Digite o valor inicial: ", 1, 100);
        int[] resultado = sequenciaCresenteComSoma(valorInicial);
        System.out.println(Arrays.toString(resultado));
        return resultado;
    }
    
    /**
     * Metodo ex05 para compatibilidade com autograder
     * @return resultado do exercicio 05
     */
    public static int[][] ex05() {
        // TODO: Implementar leitura de entrada e chamar matrizIncrementais()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex06 para compatibilidade com autograder
     * @return resultado do exercicio 06
     */
    public static int[][][] ex06() {
        // TODO: Implementar leitura de entrada e chamar operacaoEntreMatrizes()
        return null; // Remover esta linha apos implementacao
    }
}
