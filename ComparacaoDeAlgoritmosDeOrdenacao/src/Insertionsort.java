public class Insertionsort {

    public void insertionsort(int[] vetor){
        int x, j;
        for (int i = 1; i < vetor.length; i++){
            x = vetor[i];
            j = i - 1;
            //enquanto elemento j for maior ou igual a 0 e elemento na posicao
            // j for maior que o elemento x
            while (j >= 0 && vetor[j] > x){
                //empurra elemento j para a direita
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = x;
        }
    }
}