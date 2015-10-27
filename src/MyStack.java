/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dmitry
 */
public class MyStack {
    private Node top;
    private int length;
    
    public MyStack()
    {
        top = null;
        length = 0;
    }
    
    public void push(Node node)
    {
        node.setChildNode(top);
        top = node;
        length ++;
    }
    
    public Node peek()
    {
        if (!isEmpty())
        {
            return top;
        }
        return null;
    }
    
    public Node pop()
    {
        Node nextNode = null;
        if (!isEmpty())
        {
            nextNode = top;
            top = top.getChildNode();
            length --;
        }
        return nextNode;
    }
    
    public boolean isEmpty()
    {
        return length == 0;
    }
    
    public int size()
    {
        return length;
    }
    
    public void print()
    {
        Node curNode = top;
        for (int i = 0; i < length; i ++)
        {
            if (curNode != null)
            {
                System.out.println(curNode.getValue());
            }
            else
            {
                System.out.println(curNode);
            }
        }
    }
    
}
