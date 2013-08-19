/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

import java.util.ArrayList;

/**
 *
 * @author Mordechai
 */
public class MyLinkedList<T>
{

    private Node head = null;//  point to the first node
    private Node tail = null;//  point to the last node
    private int size = 0;

    public MyLinkedList()
    {
    }

    public void add(int index, T data)
    {
        if (index > size || index < 0)
        {
            throw new IndexOutOfBoundsException("Add at index " + index + " attempted while linked list size is only " + size);
        } else if (index == size)
        {
            Node n = new Node(data);
            tail.next = n;
            n.previous = tail;// should make a replace tail method. or replce node with node method
            tail = n;

        } else
        {
            Node oneBefore = head;
            for (int i = 0; i < index - 1; i++)// go to one before given index and insert there.
            {
                oneBefore = oneBefore.next;
            }

            Node toAdd = new Node(data);
            toAdd.next = oneBefore.next;
            toAdd.previous = oneBefore;
            oneBefore.next = toAdd;
        }
    }

    public T remove(int index)
    {
        if (index > size || index < 0)
        {
            throw new IndexOutOfBoundsException("Remove at index " + index + " attempted while linked list size is only " + size);
        } else if (index == size)
        {
            T temp = (T) tail.data;
            tail = tail.previous;
            return temp;
        } else
        {
            Node oneBefore = head;
            for (int i = 0; i < index - 1; i++)// go to one before given index and insert there.
            {
                oneBefore = oneBefore.next;
            }

            T temp = (T) oneBefore.next.data;
            oneBefore.next.next.previous = oneBefore;
            oneBefore.next = oneBefore.next.next;

            return temp;
        }
    }

    public boolean add(T data)
    {
        boolean collectionChanged = false;
        Node n = new Node(data);
        if (head == null)
        {
            head = n;
            n.previous = null;
            collectionChanged = true;
        }
        //if no tail node, loop while currentNode.next != null
        //break when it is and this is the last node, set the new node as this nodes, next node.

        if (tail == null)
        {
            tail = n;
            collectionChanged = true;
        } else
        {
            tail.next = n;
            n.previous = tail;
            tail = n;
            collectionChanged = true;
        }

        size++;
        return collectionChanged;
    }

    public void print()
    {
        if (head != null)
        {
            head.print();
        }
    }

    public void clear()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public int size()
    {
        return size;
    }
    
    public void printReverse ()
    {
        tail.printReverse();
    }
}
