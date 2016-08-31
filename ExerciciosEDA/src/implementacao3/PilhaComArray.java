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
public class PilhaComArray implements Pilha_IF{
    private int[] vetorAUX = new int[10];
    private int topo=0;
    @Override
    public void push(int element) throws Exception {
        if(isFull()){
            throw new Exception("Pilha esta cheia!");
        }else{
            vetorAUX[topo] = element;
            topo+= 1;
        }
    }

    @Override
    public int pop() throws Exception {
       if(isEmpty()){
       throw new Exception("Pilha vazia!");
       }else{
           topo -= 1;
           return vetorAUX[topo]; 
       }
    }

    @Override
    public int top() throws Exception {
        if(isEmpty()){
            throw new Exception("Pilha vazia!");
        }else{
            return vetorAUX[topo-1];
        }
    }

    @Override
    public boolean isEmpty() {
        if(topo==0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if(topo == vetorAUX.length){
            return true;
        }
        return false;
    }
    
}
