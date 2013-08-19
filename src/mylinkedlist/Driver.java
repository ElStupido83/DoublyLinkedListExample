/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author Mordechai
 */
public class Driver
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MyLinkedList<Integer> mll = new MyLinkedList();

        for (int i = 0; i < 10; i++)
        {
            mll.add(i);
        }

        mll.print();
        System.out.println("");
        mll.printReverse();

        System.out.println("----------------");

        mll.add(mll.size(), 89);
        mll.add(5, 3434);
        mll.print();
        System.out.println("-----------------");
        System.out.println(mll.remove(5));
        // mll.add(Integer.MAX_VALUE,55);
        mll.print();

        System.out.println("------------------");
        mll.clear();
        System.out.println("size: " + mll.size());
        mll.print();
        System.out.println("------------------");
        mll.add(0);
        mll.print();
    }
}
