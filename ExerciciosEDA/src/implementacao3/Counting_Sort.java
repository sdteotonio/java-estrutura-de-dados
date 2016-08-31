package implementacao3;

import java.util.Arrays;

public class Counting_Sort {
    public static int[] ordena(int[] a, int k){
        int[] b = new int[a.length];
        int c[] = new int[k+1];
        //Alimentar o array auxilixar com 0
        for (int i=0; i<c.length; ++i){
            c[i] = 0;
        }
        //Contar as ocorrencias
        for (int i=0; i<a.length; ++i){
            ++c[a[i]];
        }
        //Somar 
        for (int i=1; i<=c.length-1; ++i){
            c[i] += c[i-1];
        }
        //Atribuir
         for (int i = 0; i<a.length; ++i)
        {
            b[c[a[i]]-1] = a[i];
            --c[a[i]];
        }
        return b;
    }
    
}
