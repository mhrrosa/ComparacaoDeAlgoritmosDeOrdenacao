public class Selectionsort {

    public void selectionsort(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            int menorElemento = i;
            //realiza a busca do menor elemento
            for (int j = i + 1; j < vetor.length; j++){
                //se elemento da posicao j for menor que o menoElemento
                if(vetor[j] < vetor[menorElemento]){
                    //menorElemento passa a valer j
                    menorElemento = j;
                }
            }
            //realiza a troca de i com o menor elemento
            troca(vetor, i, menorElemento);
        }
    }

    //troca os elementos de posição
    public void troca(int[] vetor, int i, int menorElemento){
        int aux = vetor[i];
        vetor[i] = vetor[menorElemento];
        vetor[menorElemento] = aux;
    }
}