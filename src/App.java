

import java.util.Arrays;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU INTERATIVO ===");
            System.out.println("1. Exercicio 01: Progressao Geometrica");
            System.out.println("2. Exercicio 02: Sequencia Decrescente");
            System.out.println("3. Exercicio 03: Vetor Dinamico");
            System.out.println("4. Exercicio 04: Sequencia Crescente com Soma");
            System.out.println("5. Exercicio 05: Matriz com Valores Incrementais");
            System.out.println("6. Exercicio 06: Operacao entre Matrizes");
            System.out.println("0. Sair");
            
            opcao = lerValor(scanner, "Escolha uma opcao: ", -1, 6);

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + Arrays.toString(ex01()));
                    break;
                case 2:
                    System.out.println("Resultado: " + Arrays.toString(ex02()));
                    break;
                case 3:
                    System.out.println("Resultado: " + Arrays.toString(ex03()));
                    break;
                case 4:
                    int[] vetorEx04 = ex04();
                    System.out.println("Resultado: " + Arrays.toString(vetorEx04));
                    System.out.println("Soma dos elementos: " + calcularSoma(vetorEx04));
                    break;
                case 5:
                    System.out.println("Resultado Matriz:");
                    exibirMatriz(ex05());
                    break;
                case 6:
                    int[][][] matrizes = ex06();
                    if (matrizes != null) {
                        System.out.println("Matriz N:");
                        exibirMatriz(matrizes[0]);
                        System.out.println("Matriz Z:");
                        exibirMatriz(matrizes[1]);
                        System.out.println("Matriz Soma:");
                        exibirMatriz(matrizes[2]);
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
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
        // Deve repetir a leitura ate que o valor seja valido (min < valor <= max)
        return 0; // Remover esta linha apos implementacao
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
        if (valorInicial>20){
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
        if (valorInicial<=1) {
            return null;
        }
        int [] vetor = new int[10];
        vetor[0] = valorInicial;
        for(int i=1; i<10; i++){
            vetor[i] = vetor[i-1]-1;
        }

        return vetor;
    }
    
    /**
     * Exercicio 03: Vetor Dinamico
     * @param tamanho Tamanho do vetor (deve ser <= 1000)
     * @return Vetor com sequencia de 1 ate tamanho ou null se invalido
     */
    public static int[] vetorDinamico(int tamanho) {
        if (tamanho >= 1000) {
            return null;
        }

        int [] vetor = new int[tamanho];
        for(int i=0; i<tamanho; i++){
            vetor[i] = i + 1;
        }
        return vetor;
    }
    
    /**
     * Exercicio 04: Sequencia Crescente com Soma
     * @param valorInicial Valor inicial
     * @return Vetor de 10 elementos com sequencia crescente
     */
    public static int[] sequenciaCresenteComSoma(int valorInicial) {
        int [] vetor = new int [10];
        vetor[0] = valorInicial;
        for(int i=1; i<10; i++){
            vetor[i] = vetor[i-1]+1;
        }
        return vetor;
    }
    
    /**
     * Calcula a soma de todos os elementos do vetor
     * @param vetor Vetor para calcular a soma
     * @return Soma de todos os elementos
     */
    public static int calcularSoma(int[] vetor) {
        if (vetor == null) {
            return 0;
        }
        
        int soma = 0;
        // Ajustado para vetor.length para evitar erro caso o vetor mude de tamanho
        for(int i=0; i<vetor.length; i++){
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
        // Ajustado para criar matriz dinamicamente com base no 'tamanho' e iniciar de 0
        int matriz[][] = new int[tamanho][tamanho];
        int contador = tamanho + 1;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = contador;
                contador++;
            }
        }
        return matriz; 
    }
    
    /**
     * Exercicio 06: Operacao entre Matrizes
     * @param tamanho Tamanho das matrizes quadradas
     * @return Array com 3 matrizes: [0]=N, [1]=Z, [2]=Soma
     */
    public static int[][][] operacaoEntreMatrizes(int tamanho) {
        int[][][] matrizes = new int[3][tamanho][tamanho];
        int contador = tamanho + 1;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matrizes[0][i][j] = contador; // matrizN
                matrizes[1][i][j] = contador; // matrizZ
                matrizes[2][i][j] = matrizes[0][i][j] + matrizes[1][i][j]; // matrizSoma
                contador++;
            }
        }
        return matrizes;
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
        return null; // Remover esta linha apos implementacao
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
