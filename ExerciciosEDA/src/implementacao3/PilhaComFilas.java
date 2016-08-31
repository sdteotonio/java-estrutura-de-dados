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
public class PilhaComFilas implements Pilha_IF{
    private FilaComArray f1 = new FilaComArray();
    private FilaComArray f2 = new FilaComArray();
    private int topo=-1;
    @Override
    public void push(int element) throws Exception {
      if(isFull()){
        throw new Exception("Pilha esta cheia");
      }
      f1.enqueue(element);
      topo++;
    }

    @Override
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Pilha esta vazia");
        }
        int temp=0;
        for(int i = 0; i <= topo; i++){
           f2.enqueue(temp =f1.dequeue());
           
        }
        for(int i=0;i<=topo;i++){
            int atual = f2.dequeue();
            if(atual != temp){
                f1.enqueue(atual);
            }
        }
        topo--;
        return temp;
    }

    @Override
    public int top() throws Exception {
        if(isEmpty()){
            throw new Exception("Pilha esta vazia");
        }
        int temp=0;
        for(int i = 0; i <= topo; i++){
           f2.enqueue(temp =f1.dequeue());
           f1.enqueue(f2.dequeue());
        }
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return f1.isEmpty();
    }

    @Override
    public boolean isFull() {
        return f1.isFull();
    }
}

