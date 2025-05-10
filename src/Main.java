public class Main {
    public static void main(String[] args) {
        int[] vetor = {3, 2, 1, 5, 4, 2, 7, 3};
        Ordenacao ordenacao = new Ordenacao();

        ordenacao.bubbleSort(vetor);
        ordenacao.imprimirMensagemVetorOrdenado();
        ordenacao.imprimirVetor(vetor);
    }
}
