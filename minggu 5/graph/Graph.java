/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.Stack;

/**
 *
 * @author acer
 */
public class Graph {
    private final int MAX_VERTS = 20;
    private vertex vertexlist[];
    private int adjmat[][];
    private int nVerts;
    //DFS
    private theStack theStack;
    //bfs
    private Queue theQueue;
 
    public Graph() {
        vertexlist = new vertex[MAX_VERTS];
        adjmat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjmat[i][j] = 0;
            }
        }
       theQueue = new Queue (); //bfs
       theStack = new theStack (); //dfs
    }
    public void addvertex (char label) {
        vertexlist[nVerts++] =
                new vertex (label);
    }
    public void addEdge (int start, int end) {
        adjmat [start][end] = 1;
        adjmat [end][start] = 1;
    }
    
    public void displayVertex(int v) {
        System.out.print(vertexlist[v].label+" ");
        
    }
    
    //implementasi bfs
    public void bfs() {
       System.out.println("Visit using BFS Algorithm: ");
       vertexlist[0].wasVisited = true; 
       displayVertex(0);
       theQueue.insert(0);
       
       int v2;

       while( !theQueue.isEmpty() ) {
          int v1 = theQueue.remove();   

          while( (v2=getAdjUnvisitedVertex(v1)) != -1 ) {                                  
             vertexlist[v2].wasVisited = true;  
             displayVertex(v2);                 
             theQueue.insert(v2);               
            }   
        }  

       for(int i=0; i<nVerts; i++)             // reset flags
          vertexlist[i].wasVisited = false;
       }  
    // implementasi dfs
    
     public void dfs() { 
        System.out.println("Visit using DFS Algorithm: ");
        vertexlist[0].wasVisited = true;  
        displayVertex(0);   
        theStack.push(0); 

        while (!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex( theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                vertexlist[v].wasVisited = true;  
                displayVertex(v);  
                theStack.push(v);
            }
        }  


        for (int i = 0; i < nVerts; i++) { // reset flags
            vertexlist[i].wasVisited = false;
        }
    }  
    public int getAdjUnvisitedVertex (int v) {
    for (int i = 0; i < nVerts; i++ ) {
        if (adjmat[v][i] == 1 && vertexlist[i].wasVisited == false) {
            return i;
        }
    }
    return -1;
    }
    public void display() {
         System.out.println("Adjecency: ");
         for (int row = 0; row < nVerts; row++) {
             for (int col = 0; col < row; col++) {
                 if ( adjmat[row][col] == 1) {
                     System.out.println(
                             vertexlist[row].label + " -- " + vertexlist[col].label);
                 }
             }
         }
         System.out.println("");
    }
}
  