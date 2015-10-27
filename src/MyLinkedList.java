

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * An unordered single linked list
 * @author kobed6328
 */
public class MyLinkedList {
    
    // the first node in the list
    private Node head;
    private int length;
    
    /**
     * Creates an empty linked list
     */
    public MyLinkedList()
    {
        // this is effectively the tail of the list
        head = null;
        length = 0;
    }
    
    public void add(Node node)
    {
        node.setChildNode(head);
        head = node;
        length ++;
    }
    
    public void insert(int index, Node node)
    {
        if (index == 0)
        {
            add(node);
        }
        else
        {
            Node nextNode = head;
            // ignore first element
            for (int i = 0; i < index-1 && i < length; i ++)
            {
                nextNode = nextNode.getChildNode();
            }
            node.setChildNode(nextNode.getChildNode());
            nextNode.setChildNode(node);
            length ++;
        }
    }
    public void remove(int index)
    {
        if (index == 0)
        {
            head = head.getChildNode();
        }
        else
        {
            Node nextNode = head;
            // stop at last element
            for (int i = 0; i < index-1; i ++)
            {
                nextNode = nextNode.getChildNode();
            }
            nextNode.setChildNode(nextNode.getChildNode().getChildNode());
        }
        length --;
    }
    
    public Node get(int index)
    {
        Node nextNode = head;
        for (int i = 0; i < index; i ++)
        {
            nextNode = nextNode.getChildNode();
        }
        return nextNode;
    }
    
    public void printList()
    {
        Node nextNode = head;
        for (int i = 0; i < length; i ++)
        {
            System.out.println(nextNode.getValue());
            nextNode = nextNode.getChildNode();
        }
    }
    
}
