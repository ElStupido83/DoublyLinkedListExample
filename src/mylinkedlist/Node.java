/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author Mordechai
 */
public class Node<T>
{

    Node previous = null;
    Node next = null;
     T data;

    public Node()
    {
    }

    public Node(T data_)
    {
        data = data_;
    }

    public void print()
    {
        System.out.println(toString());
        if (next != null)
        {
            next.print();
        }
    }
    
    public void printReverse()
    {
        System.out.println(toString());
        if (previous != null)
        {
            previous.printReverse();
        }
    }

    @Override
    public String toString()
    {
        return "Node{" + "previous=" + ((previous == null) ? "null" : previous.data) + ", next=" + ((next == null) ? "null" : next.data) + ", data=" + ((data == null) ? "null" : data)  + '}';
    }

    public Node getLeft()
    {
        return previous;
    }

    public void setLeft(Node left)
    {
        this.previous = left;
    }

    public Node getRight()
    {
        return next;
    }

    public void setRight(Node right)
    {
        this.next = right;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
