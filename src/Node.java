/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Node {
    
    private int value;
    private Node childNode;
    
    /**
     * Creates a node with a value but no child node
     * @param value the node's initial value
     */
    public Node(int value)
    {
        this.value = value;
        childNode = null;
    }
    /**
     * Creates a node with a value and a child node
     * @param value the node's initial value
     * @param childNode the node's initial child node
     */
    public Node(int value, Node childNode)
    {
        this.value = value;
        this.childNode = childNode;
    }
    
    /**
     * Get the child node
     * @return the child node
     */
    public Node getChildNode()
    {
        return childNode;
    }
    /**
     * Set the child node
     * @param newChildNode the new child node
     */
    public void setChildNode(Node newChildNode)
    {
        this.childNode = newChildNode;
    }
    /**
     * Gets the node's value
     * @return the node's value
     */
    public int getValue()
    {
        return value;
    }
}
