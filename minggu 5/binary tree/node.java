/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.tree;

/**
 *
 * @author acer
 */
public class node {
    public int id;
    public String data;
    public node leftchild;
    public node rightchild;
    
    public void displaynode() {
        System.out.print("{ " + id + ", " + data + " } ");
        
    }
}
