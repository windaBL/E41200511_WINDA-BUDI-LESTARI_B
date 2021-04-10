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
class theStack {
   private final int maxSize = 20;
   private int[] st;
   private int top;
   
      public theStack() {
      st = new int[maxSize];
      top = -1;
      }
   public void push(int i)
      { st[++top] = i; }
   
   public int pop()
      { return st[top--]; }
   
   public int peek()
      { return st[top]; }
   
   public boolean isEmpty() 
      { return (top == -1); }
}
