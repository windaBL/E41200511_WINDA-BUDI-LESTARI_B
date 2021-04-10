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
public class graphApp {
    public static void main (String[] args) {
        
        Graph theGraph = new Graph();
        
        theGraph.addvertex('A');//0
        theGraph.addvertex('B');//1
        theGraph.addvertex('C');//2
        theGraph.addvertex('D');//3
        theGraph.addvertex('E');//4
        
        
        
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(2, 3); // AD
        theGraph.addEdge(3, 4); // DE
        
        //theGraph.bfs ();
        
        theGraph.bfs();
        System.out.println();
        System.out.println();
        
        theGraph.dfs();
        System.out.println();
        System.out.println();
        
        theGraph.display();
        
    }
}
