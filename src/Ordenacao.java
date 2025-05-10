public class Ordenacao {
    //int [] vetor = {3, 2, 5 , 8, 6, 3, 4, 1};

    public void bubbleSort (int [] vetor) {
        for (int i = 0; i < vetor.length -1; i++){
            for (int j = 0; j < vetor.length -1; j++){
                if(vetor[j] > vetor[j +1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j +1];
                    vetor[j +1] = aux;
                }
            }
        }
    }
    public void imprimirVetor(int [] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
    public void imprimirMensagemVetorOrdenado(){
        System.out.println("Vetor Ordenado");
    }

}
