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
public class Insertion_Sort {
    public static int[] ordena(int[] vetor) {
               int j;
               int chave;
               int i;
   
               for (j = 1; j < vetor.length; j++)
               {
                      chave = vetor[j];
                      for (i = j - 1; (i >= 0) && (vetor[i] > chave); i--)                                                                                                        
                      {
                             vetor[i + 1] = vetor[i];
                      }
                      vetor[i + 1] = chave;
               }
               return vetor;
         }
    
}
