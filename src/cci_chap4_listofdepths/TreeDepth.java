/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci_chap4_listofdepths;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Ali
 */
public class TreeDepth 
{
    private final ArrayList<LinkedList<Node>> listOfLevels;
    private final LinkedList<Node> parentQueue;
    private LinkedList<Node> childQueue;
    private LinkedList<Node> tempList;
    
    public TreeDepth(Node root)
    {
        listOfLevels = new ArrayList<>();
        parentQueue = new LinkedList<>();
        parentQueue.add(root);
        childQueue = new LinkedList<>();
        tempList = new LinkedList<>();
    }
    
    public void levelOrderTraversal()
    {        
        if (parentQueue.isEmpty())
        {
            return;
        }
        
        Node n = parentQueue.removeLast();
        tempList.add(n);
        
        if (n.left != null)
        {
            childQueue.addFirst(n.left);
        }
        if (n.right != null)
        {
            childQueue.addFirst(n.right);
        }
        
        if (parentQueue.isEmpty())
        {
            listOfLevels.add(tempList);
            tempList = new LinkedList<>();
            parentQueue.addAll(childQueue);
            childQueue = new LinkedList<>();
        }
        
        levelOrderTraversal();
    }
    
    public ArrayList<LinkedList<Node>> getListOfLevels()
    {
        return listOfLevels;
    }
}
