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
public class FilaComArray implements Fila_IF{
    private int[] vetorAUX = new int[10];
    private int comeco=0,fim=-1,elementos;

    @Override
    public void enqueue(int element) throws Exception {
        if(isFull()){
            throw new  Exception("Fila esta cheia!");
        }else{
            if(fim == vetorAUX.length-1){
                fim =-1;
            }
            fim++;
            vetorAUX[fim]=element;
            elementos++;
        }
    }

    @Override
    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Fila estra vazia");
        }
        int temporario = vetorAUX[comeco++];
        if(comeco == vetorAUX.length){
            comeco= 0;
        }
        elementos--;
        return temporario;
    }

    @Override
    public int head() throws Exception {
        if(isEmpty()){
            throw new Exception("Fila estra vazia");
        }
        return vetorAUX[comeco];
    }

    @Override
    public boolean isEmpty() {
        
       return elementos==0;   
    }

    @Override
    public boolean isFull() {
        return elementos==vetorAUX.length;
    }
    
    
}
