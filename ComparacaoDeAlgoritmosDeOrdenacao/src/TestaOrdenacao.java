import java.util.Arrays;
import java.util.Random;

public class TestaOrdenacao {

    public static void main(String[] args) {
        Quicksort qs = new Quicksort();
        Insertionsort is = new Insertionsort();
        Selectionsort ss = new Selectionsort();
        Heapsort he = new Heapsort();
        Mergesort me = new Mergesort();
        Shellsort she = new Shellsort();
        //instancie outras classes aqui, seguindo como eu fiz


        int[] vetor = gerar(10);
        //qs.ordenacao(vetor);
//        he.heapsort(vetor);
 //       me.mergeSort(10,vetor);
        she.ordenar(vetor);
//        is.insertionsort(vetor);
//        ss.selectionsort(vetor);
        System.out.println(Arrays.toString(vetor));
    }

    //gerar vetor aleatório
    public static int[] gerar(int n){
        int[] vetor = new int[n];
        Random gerador = new Random();
        for (int i = 0; i < n; i++){
            vetor[i] = gerador.nextInt(n);
        }
        return vetor;
    }
}
