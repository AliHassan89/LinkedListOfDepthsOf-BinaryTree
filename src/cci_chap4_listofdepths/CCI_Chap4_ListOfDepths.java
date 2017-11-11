/*
    List of Depths: Given a binary tree, design an algorithm which creates a 
    linked list of all the nodes at each depth (e.g., if you have a tree with 
    depth D, you'll have D linked lists).
 */
package cci_chap4_listofdepths;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Ali
 */
public class CCI_Chap4_ListOfDepths 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(7);
        root.left.left = new Node(9);
        root.left.right = new Node(10);
        root.right.left = new Node(11);
        root.right.right = new Node(12);
        root.left.left.left = new Node(13);
        root.left.left.right = new Node(14);
        root.left.right.left = new Node(15);
        root.left.right.right = new Node(16);
        root.right.left.left = new Node(17);
        root.right.left.right = new Node(18);
        root.right.right.left = new Node(19);
        root.right.right.right = new Node(20);
        
        TreeDepth treeTraversal = new TreeDepth(root);
        treeTraversal.levelOrderTraversal();
        ArrayList<LinkedList<Node>> listOfLists = treeTraversal.getListOfLevels();
        
        for (LinkedList<Node> list : listOfLists)
        {
            for (Node n : list)
            {
                System.out.print(n.data+",   ");
            }
            System.out.println("");
        }
                
    }
    
}
