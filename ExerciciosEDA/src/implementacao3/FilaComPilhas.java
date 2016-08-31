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
public class FilaComPilhas implements Fila_IF{
    private PilhaComArray p1 =new PilhaComArray();
    private PilhaComArray p2 = new PilhaComArray();
    private int elementos=0;
    @Override
    public void enqueue(int element) throws Exception {
        if(isFull()){
            throw new Exception("Fila esta cheia");
        }
        elementos++;
        p1.push(element);

        
    }

    @Override
    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Fila esta vazia");
        }
        int temp = 0;
        for(int i=0;i<elementos;i++){
           p2.push(temp = p1.pop());
        }
        for(int i=0;i<elementos;i++){
            int atual = p2.pop();
            if(atual != temp){
                p1.push(atual);
            }
        }
        elementos--;
        return temp;
    }

    @Override
    public int head() throws Exception {
        if(isEmpty()){
            throw new Exception("Fila esta vazia");
        }
        int temp = 0;
        for(int i=0;i<elementos;i++){
           p2.push(p1.pop());
        }
        temp = p2.top();
        for(int i=0;i<elementos;i++){
            p1.push(p2.pop());
        }
        return temp;
    }
    @Override
    public boolean isEmpty() {
        return p1.isEmpty();
    }

    @Override
    public boolean isFull() {
        return p1.isFull();
    }
    
}
