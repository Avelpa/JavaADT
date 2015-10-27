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
        
        MyStack stack = new MyStack();
        
        stack.push(new Node(1));
        stack.push(new Node(2));
        System.out.println(stack.pop().getValue());
        System.out.println(stack.peek().getValue());
        System.out.println(stack.size());
    }
}
