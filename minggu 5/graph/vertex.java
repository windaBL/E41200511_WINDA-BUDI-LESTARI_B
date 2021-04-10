/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author acer
 */
public class vertex {
    public char label;
    public boolean wasVisited;
    
    public vertex (char label) {
        this.label = label; wasVisited = false;
    }
}
