/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci_chap4_listofdepths;

/**
 *
 * @author Ali
 */
public class Node 
{
    public int data;
    public Node left;
    public Node right;
    
    public Node()
    {
        data = -1;
        left = null;
        right = null;
    }
    
    public Node(int val)
    {
        data = val;
        left = null;
        right = null;
    }
}
