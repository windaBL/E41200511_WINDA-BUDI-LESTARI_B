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
public class Queue {
    private final int maxSize = 20;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue () {
        queArray = new int[maxSize];
         front = 0;
         rear = -1;
    }  
    
     public void insert (int i) {
         if (rear == maxSize - 1) 
             rear = -1;
      
         queArray[++rear] = i;
     }
     public int remove() {
         int temp = queArray[front++];
         if (front == maxSize) {
             front = 0;
         }
         return temp;
     }
     
     public long peekFront() {
         return queArray[front];
     }
     
     public boolean isEmpty() {
         return (rear+1==front || (front+maxSize-1==rear));
     }
     public boolean isFull() {
         return (nItems == maxSize);
     }
     public int size() {
         return nItems;
     }
}
