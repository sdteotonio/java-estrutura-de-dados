/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao3;

/**
 *
 * @author Sèrgio Davi
 */
public class Selection_Sort {
    public static int[] ordena(int[] vetor) {
                for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
                    int menor = fixo;

                  for (int i = menor + 1; i < vetor.length; i++) {
                     if (vetor[i] < vetor[menor]) {
                        menor = i;
                     }
                  }
                  if (menor != fixo) {
                    int t = vetor[fixo];
                    vetor[fixo] = vetor[menor];
                    vetor[menor] = t;
                  }
                }
                return vetor;
       }
}
