/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.tree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
        
/**
 *
 * @author acer
 */
public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "winda");
        theTree.insert(25, "budi");
        theTree.insert(75, "tari");
        theTree.insert(12, "painem");
        theTree.insert(37, "tukiyem");
        theTree.insert(43, "jum");
        theTree.insert(30, "darso");
        theTree.insert(33, "jarwo");
        theTree.insert(87, "miyati");
        theTree.insert(93, "mbah djie");
        theTree.insert(57, "toni");
        
        while (true) {
            System.out.print("Enter first letter of show, " + 
                    "insert, find, delete, or traverse: ");
            int choice = getChar();
            switch (choice) {
                case 's' :
                    theTree.displayTree();
                    break;
                    
                case 'i' :
                    System.out.print("Enter value and data to" + " insert : " );
                    value = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                
                case 'f' :
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    node found = theTree.find (value);
                    if (found != null) {
                        System.out.print("found: ");
                        found.displaynode();
                        System.out.print("\n");
                    } else {
                        System.out.println("Could not find " + value);
                    }
                    break;
                    
                case 'd':
                    System.out.print("Enter value to delete ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.println("delete " + value);
                    } else {
                        System.out.println("could not delete " + value);
                    }
                    break;
                    
                case 't':
                    System.out.print("Enter type 1, 2 or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("invalid entry ");
            }
        }
    }
public static String getString() throws IOException {
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader (isr);
    String s = br.readLine();
    return s;
    
}
public static char getChar() throws IOException{
    String s = getString();
    return s.charAt(0);
    
}
public static int getInt() throws IOException{
    String s = getString();
    return Integer.parseInt(s);
}
}
