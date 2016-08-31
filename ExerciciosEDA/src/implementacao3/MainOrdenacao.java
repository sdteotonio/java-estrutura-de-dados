/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao3;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Sèrgio Davi
 */
public class MainOrdenacao {
    public static void main(String[] args) {
        //Para tamanho 20
        int[] arrayInverso20 = vetorInverso(20);
        int[] arrayOrdenado20 = vetorOrdenado(20);
        int[] arrayAleatorio20 = vetorAleatorio(20);
        //Para tamanho 2000
        int[] arrayInverso2000 = vetorInverso(2000);
        int[] arrayOrdenado2000 = vetorOrdenado(2000);
        int[] arrayAleatorio2000 = vetorAleatorio(2000);
        
        long tempoInicial=0,tempoFinal=0;
        //Necessitamos fazer a chamada falsa de todos os algoritmos para não influenciar no tempo.
        int[] teste = {1,2,5,4};
        int maiorTeste=5;
                
        Counting_Sort.ordena(teste, maiorTeste);
        Bubble_Sort.ordena(teste);
        Quick_Sort.ordena(teste, 0, 0);
        Insertion_Sort.ordena(teste);
        MergeSort.ordena(teste, 0);
        Selection_Sort.ordena(teste);
        
        
        //===============================================Counting_Sort===========================================
        int[] auxCounting20;
        int maior20;
        System.out.println("\n==Counting_Sort==\n");
        //Intervalo
        auxCounting20 = arrayOrdenado20.clone();
        maior20 = getMaiorDoArray(auxCounting20);
        System.out.println("Counting_Sort N:"+"20"+" Array("+"Ordenado"+")");
        tempoInicial= System.nanoTime(); 
        Counting_Sort.ordena(auxCounting20,maior20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        //Intervalo
        System.out.println("Counting_Sort N:"+"20"+" Array("+"Inverso"+")");
        auxCounting20= arrayInverso20.clone();
        maior20 = getMaiorDoArray(auxCounting20);
        tempoInicial= System.nanoTime(); 
        Counting_Sort.ordena(auxCounting20,maior20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        System.out.println("Counting_Sort N:"+"20"+" Array("+"Aleatorio"+")");
        auxCounting20= arrayAleatorio20.clone();
        maior20 = getMaiorDoArray(auxCounting20);
        tempoInicial= System.nanoTime(); 
        Counting_Sort.ordena(auxCounting20,maior20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        System.out.println();
        //Para 2000
        int auxCounting2000[];
        int maior2000;
        auxCounting2000=arrayOrdenado2000.clone();
        maior2000=getMaiorDoArray(auxCounting2000);
        //Intervalo
        System.out.println("Counting_Sort N:"+"2000"+" Array("+"Ordenado"+")");
        tempoInicial= System.nanoTime(); 
        Counting_Sort.ordena(auxCounting2000,maior2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        auxCounting2000=arrayInverso2000.clone();
        maior2000=getMaiorDoArray(auxCounting2000);
        //Intervalo
        System.out.println("Counting_Sort N:"+"2000"+" Array("+"Inverso"+")");
        tempoInicial= System.nanoTime(); 
        Counting_Sort.ordena(auxCounting2000,maior2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        auxCounting2000=arrayAleatorio2000.clone();
        maior2000=getMaiorDoArray(auxCounting2000);
        System.out.println("Counting_Sort N:"+"2000"+" Array("+"Aleatorio"+")");
        tempoInicial= System.nanoTime(); 
        Counting_Sort.ordena(auxCounting2000,maior2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //==============================//
        //===========================================================SelectionSort==============================================
        System.out.println("\n==SelectionSort==\n");
        int[] auxSelection20;
        //Intervalo
        auxSelection20 = arrayOrdenado20.clone();
        System.out.println("Selection_Sort N:"+"20"+" Array("+"Ordenado"+")");
        tempoInicial= System.nanoTime(); 
        Selection_Sort.ordena(auxSelection20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        //Intervalo
        auxSelection20 = arrayInverso20.clone();
        System.out.println("Selection_Sort N:"+"20"+" Array("+"Inverso"+")");
        tempoInicial= System.nanoTime(); 
        Selection_Sort.ordena(auxSelection20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        System.out.println("Selection_Sort N:"+"20"+" Array("+"Aleatorio"+")");
        auxSelection20 = arrayAleatorio20.clone();
        tempoInicial= System.nanoTime(); 
        Selection_Sort.ordena(auxSelection20);//==========================================================
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        System.out.println();
        //Para 2000
        //Intervalo
        int[] auxSelection2000;
        System.out.println("Selection_Sort N:"+"2000"+" Array("+"Ordenado"+")");
        auxSelection2000 = arrayOrdenado2000.clone();
        tempoInicial= System.nanoTime(); 
        Selection_Sort.ordena(auxSelection2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        //Intervalo
        System.out.println("Selection_Sort N:"+"2000"+" Array("+"Inverso"+")");
        auxSelection2000 = arrayInverso2000.clone();
        tempoInicial= System.nanoTime(); 
        Selection_Sort.ordena(auxSelection2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        System.out.println("Selection_Sort N:"+"2000"+" Array("+"Aleatorio"+")");
        auxSelection2000 = arrayAleatorio2000.clone();
        tempoInicial= System.nanoTime(); 
        Selection_Sort.ordena(auxSelection2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //==============================//
        //===========================================InsertionSort==========================================
        System.out.println("\n==InsertionSort==\n");
        //Intervalo
        int[] auxInsertion20;
        System.out.println("Insertion_Sort N:"+"20"+" Array("+"Ordenado"+")");
        auxInsertion20= arrayOrdenado20.clone();
        tempoInicial= System.nanoTime(); 
        Insertion_Sort.ordena(auxInsertion20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        //Intervalo
        System.out.println("Insertion_Sort N:"+"20"+" Array("+"Inverso"+")");
        auxInsertion20= arrayInverso20.clone();
        tempoInicial= System.nanoTime(); 
        Insertion_Sort.ordena(auxInsertion20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        System.out.println("Insertion_Sort N:"+"20"+" Array("+"Aleatorio"+")");
        auxInsertion20= arrayAleatorio20.clone();
        tempoInicial= System.nanoTime(); 
        Insertion_Sort.ordena(auxInsertion20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        System.out.println();
        //Para 2000
        //Intervalo
        int[] auxInsertion2000;
        System.out.println("Insertion_Sort N:"+"2000"+" Array("+"Ordenado"+")");
        auxInsertion2000 = arrayOrdenado2000.clone();
        tempoInicial= System.nanoTime(); 
        Insertion_Sort.ordena(auxInsertion2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        //Intervalo
        System.out.println("Insertion_Sort N:"+"2000"+" Array("+"Inverso"+")");
       auxInsertion2000 = arrayInverso2000.clone();
        tempoInicial= System.nanoTime(); 
        Insertion_Sort.ordena(auxInsertion2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        System.out.println("Insertion_Sort N:"+"2000"+" Array("+"Aleatorio"+")");
        auxInsertion2000 = arrayAleatorio2000.clone();
        tempoInicial= System.nanoTime(); 
        Insertion_Sort.ordena(auxInsertion2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //==============================//
        //=======================================================MergeSort=============================================
        System.out.println("\n==MergeSort==\n");
        //Intervalo
        int[] auxMerge20;
        System.out.println("MergeSort N:"+"20"+" Array("+"Ordenado"+")");
        auxMerge20 = arrayOrdenado20.clone();
        tempoInicial= System.nanoTime(); 
        MergeSort.ordena(auxMerge20,20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        //Intervalo
        System.out.println("MergeSort N:"+"20"+" Array("+"Inverso"+")");
        auxMerge20 = arrayInverso20.clone();
        tempoInicial= System.nanoTime(); 
        MergeSort.ordena(auxMerge20,20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        System.out.println("MergeSort N:"+"20"+" Array("+"Aleatorio"+")");
       auxMerge20 = arrayAleatorio20.clone();
        tempoInicial= System.nanoTime(); 
        MergeSort.ordena(auxMerge20,20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        System.out.println();
        //Para 2000
        //Intervalo
        int[] auxMerge2000;
        System.out.println("MergeSort N:"+"2000"+" Array("+"Ordenado"+")");
        auxMerge2000 = arrayOrdenado2000.clone();
        tempoInicial= System.nanoTime(); 
        MergeSort.ordena(auxMerge2000,2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        //Intervalo
        System.out.println("MergeSort N:"+"2000"+" Array("+"Inverso"+")");
        auxMerge2000 = arrayInverso2000.clone();
        tempoInicial= System.nanoTime(); 
        MergeSort.ordena(auxMerge2000,2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        System.out.println("MergeSort N:"+"2000"+" Array("+"Aleatorio"+")");
        auxMerge2000 = arrayAleatorio2000.clone();
        tempoInicial= System.nanoTime(); 
        MergeSort.ordena(auxMerge2000,2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //==============================//
        //=============================================================BublleSort===============================================
        System.out.println("\n==BublleSort==\n");
        //Intervalo
        int[]auxBubble20;
        System.out.println("BublleSort N:"+"20"+" Array("+"Ordenado"+")");
        auxBubble20 = arrayOrdenado20.clone();
        tempoInicial= System.nanoTime(); 
        Bubble_Sort.ordena(auxBubble20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        //Intervalo
        System.out.println("BublleSort N:"+"20"+" Array("+"Inverso"+")");
        auxBubble20 = arrayInverso20.clone();
        tempoInicial= System.nanoTime(); 
        Bubble_Sort.ordena(auxBubble20);
        tempoFinal = System.nanoTime();
        System.out.println("BublleSort usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        System.out.println("BublleSort N:"+"20"+" Array("+"Aleatorio"+")");
        auxBubble20 = arrayAleatorio20.clone();
        tempoInicial= System.nanoTime(); 
        Bubble_Sort.ordena(auxBubble20);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        System.out.println();
        //Para 2000
        //Intervalo
        int[] auxBubble2000;
        System.out.println("BublleSort N:"+"2000"+" Array("+"Ordenado"+")");
        auxBubble2000 = arrayOrdenado2000.clone();
        tempoInicial= System.nanoTime(); 
        Bubble_Sort.ordena(auxBubble2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        //Intervalo
        System.out.println("BublleSort N:"+"2000"+" Array("+"Inverso"+")");
       auxBubble2000 = arrayInverso2000.clone();
        tempoInicial= System.nanoTime(); 
        Bubble_Sort.ordena(auxBubble2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        System.out.println("BublleSort N:"+"2000"+" Array("+"Aleatorio"+")");
        auxBubble2000 = arrayAleatorio2000.clone();
        tempoInicial= System.nanoTime(); 
        Bubble_Sort.ordena(auxBubble2000);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim 
        //==============================//
        //================================================================QuickSort================================================
        System.out.println("\n==QuickSort==\n");
        //Intervalo
        int[] auxQuick20;
        System.out.println("QuickSort N:"+"20"+" Array("+"Ordenado"+")");
        auxQuick20 = arrayOrdenado20.clone();
        tempoInicial= System.nanoTime(); 
        Quick_Sort.ordena(auxQuick20,0,19);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        //Intervalo
        System.out.println("QuickSort N:"+"20"+" Array("+"Inverso"+")");
       auxQuick20 = arrayInverso20.clone();
        tempoInicial= System.nanoTime(); 
        Quick_Sort.ordena(auxQuick20,0,19);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        System.out.println("QuickSort N:"+"20"+" Array("+"Aleatorio"+")");
        auxQuick20 = arrayAleatorio20.clone();
        tempoInicial= System.nanoTime(); 
        Quick_Sort.ordena(auxQuick20,0,19);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        System.out.println();
        //Para 2000
        //Intervalo
        int[] auxQuick2000;
        System.out.println("QuickSort N:"+"2000"+" Array("+"Ordenado"+")");
        auxQuick2000 = arrayOrdenado2000.clone();
        tempoInicial= System.nanoTime(); 
        Quick_Sort.ordena(auxQuick2000,0,1999);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim
        //Intervalo
        System.out.println("QuickSort N:"+"2000"+" Array("+"Inverso"+")");
        auxQuick2000 = arrayInverso2000.clone();
        tempoInicial= System.nanoTime(); 
        Quick_Sort.ordena(auxQuick2000,0,1999);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        //Intervalo
        System.out.println("QuickSort N:"+"2000"+" Array("+"Aleatorio"+")");
        auxQuick2000 = arrayAleatorio2000.clone();
        tempoInicial= System.nanoTime(); 
        Quick_Sort.ordena(auxQuick2000,0,1999);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo usado = "+(tempoFinal-tempoInicial));
        //fim  
        
    }
    //Metodos auxiliares    
    private static int getMaiorDoArray(int[] array){
        int aux=0;
        for(int i =0;i<array.length;i++){
            if(array[i]>aux){
                aux=array[i];
            }
        }
        return aux;
    }
    private static int[] vetorOrdenado(int tamanho){
        int[] vetor =new int[tamanho];
        for(int i=0;i<tamanho;i++){
            vetor[i]= i;
        }
        return vetor;
    }
   private static int[] vetorInverso(int tamanho){
        int[] vetor =new int[tamanho];
        int aux=tamanho-1;
        for(int i=0;i<tamanho;i++){
            vetor[i]=aux;
            aux--;
        }
        return vetor;
    }
   private static int[] vetorAleatorio(int tamanho){
        int[] vetor =new int[tamanho];
        for(int i=0;i<tamanho;i++){
            vetor[i]= (int)(Math.random()*tamanho);
        }
        return vetor;
    }
}
