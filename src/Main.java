/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyQueue queue = new MyQueue();
        
        queue.enqueue(new Node(1));
        queue.enqueue(new Node(2));
        queue.enqueue(new Node(3));
        //System.out.println(queue.peek().getValue());
        /*
        System.out.println(queue.dequeue().getValue());
        System.out.println(queue.peek().getValue());
        System.out.println(queue.size());*/
        queue.print();
        
    }
}
