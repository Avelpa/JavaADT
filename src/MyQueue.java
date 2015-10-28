/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dmitry
 */
public class MyQueue {
    
    private Node top;
    private Node end;
    private int length;
    
    public MyQueue()
    {
        top = null;
        end = null;
        length = 0;
    }
    
    public void enqueue(Node node)
    {
        if (!isEmpty())
        {
            end.setChildNode(node);
            node.setParentNode(end.getParentNode());
            end = node;
        }
        else
        {
            top = node;
            end = node;
        }
        length ++;
    }
    
    public Node dequeue()
    {
        Node topNode = top;
        if (!isEmpty())
        {
            top = top.getChildNode();
        }
        length --;
        return topNode;
    }
    
    public Node peek()
    {
        return top;
    }
    
    public int size()
    {
        return length;
    }
    
    public boolean isEmpty()
    {
        return length == 0;
    }
    
    public void print()
    {
        Node curNode = top;
        for (int i = 0; i < length; i ++)
        {
            if (curNode != null)
            {
                System.out.println(curNode.getValue());
                curNode = curNode.getChildNode();
            }
            else
            {
                System.out.println(curNode);
            }
        }
    }
    
}
