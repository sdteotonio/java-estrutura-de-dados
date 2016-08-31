package implementacao3;


public class Quick_Sort  {
    public static int[] ordena(int[] vetor, int esquerda, int direita) {
      int index = partition(vetor, esquerda, direita);
      if (esquerda < index - 1)
            ordena(vetor, esquerda, index - 1);
      if (index < direita)
            ordena(vetor, index, direita);
      return vetor;
}
    private static int partition(int[] vetor, int esquerda, int direita){
      int i = esquerda, j = direita;
      int tmp;
      int pivo = vetor[(esquerda + direita) / 2];
     
      while (i <= j) {
            while (vetor[i] < pivo)
                  i++;
            while (vetor[j] > pivo)
                  j--;
            if (i <= j) {
                  tmp = vetor[i];
                  vetor[i] = vetor[j];
                  vetor[j] = tmp;
                  i++;
                  j--;
            }
      }
     
      return i;
}
 

    
}
