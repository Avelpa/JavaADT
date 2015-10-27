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
        MyLinkedList list = new MyLinkedList();
        
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));
        
        
        list.remove(2);
        list.printList();
    }
}
