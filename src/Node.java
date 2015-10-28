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
    private Node parentNode;
    
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
     * Get the parent node
     * @return the parent node
     */
    public Node getParentNode()
    {
        return parentNode;
    }
    /**
     * Set the parent  node
     * @param newParentNode the new parent node
     */
    public void setParentNode(Node newParentNode)
    {
        this.parentNode = newParentNode;
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
