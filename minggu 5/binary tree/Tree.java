/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.tree;

import java.util.Stack;

/**
 *
 * @author acer
 */
public class Tree {
    private node root;
    
    public Tree() {
       root = null;
       
    }
    public node find (int key) { node current = root;
    while (current.id != key) {
        if (key < current.id) {
            current = current.leftchild;
            
        } else {
            current = current.rightchild;
        }
        if (current == null) {
            return null;
        }
      }
    return current;
    }
    public void insert (int id, String data) {
        node newnode = new node();
        newnode.id = id;
        newnode.data = data;
        if (root == null) {
            root = newnode;
        } else {
            node current = root; node parent;
            while (true) {
                parent = current;
                if (id < current.id) {
                    current = current.leftchild;
                    if (current == null) {
                        parent.leftchild = newnode; return;
                    }
                }else{
                    current = current.rightchild;
                    if (current == null) {
                        parent.rightchild = newnode;
                        return;
                    }
                }
            }
        }
    }
    public boolean delete (int key) {
        node current = root;
        node parent = root;
        boolean isleftchild = true;
        
        while (current.id != key) {
            parent = current;
            if (key < current.id) {
                isleftchild = true;
                current = current.leftchild;
            } else {
                isleftchild = false;
                current = current.rightchild;
            }
            if (current == null) {
                return false;
            }
        }
        if (current.leftchild == null && current.rightchild == null ) {
            if (current == root) {
                root = null;
                
            }else if (isleftchild ) {
                parent.leftchild = current.leftchild;
                
            } else {
                parent.rightchild = current.leftchild;
                
            }
        } else if (current.rightchild == null) {
            if (current == root) {
                root = current.leftchild;
            }else if (isleftchild) {
                parent.leftchild = current.leftchild;
            }else {
                parent.rightchild = current.rightchild;
            }
        } else if (current.leftchild == null) {
            if (current == root) {
                root = current.rightchild;
            }else if (isleftchild) {
                parent.leftchild = current.rightchild;
            }else {
                parent.rightchild = current.rightchild;
            }
        }else {
            node successor = getSuccessor (current);
            if (current == root) {
                root = successor;
                
            }else if (isleftchild) {
                parent.leftchild = successor;
            }else {
                parent.rightchild = successor;
            }
            successor.leftchild = current.leftchild;
            
        }
        return true;
    }
  private node getSuccessor (node delnode) {
      node successorParent = delnode;
      node successor = delnode;
      node current = delnode.rightchild;
      while (current != null) {
          successorParent = successor;
          successor = current;
          current = current.leftchild;
      }
      if (successor != delnode.rightchild) {
          successorParent.leftchild = successor.rightchild;
          successor.rightchild = delnode.rightchild;
      }
      return successor;
  }
  public void traverse (int traverseType) {
      switch (traverseType) {
          case 1:
              System.out.print("Preorder traversal : ");
              preOrder(root);
              break;  
          case 2:
              System.out.print("inorder travesal : ");
              inOrder(root);
              break;
          case 3:
              System.out.print("postorder travesal : ");
              postOrder (root);
              break;
      }
      System.out.println();
  }
 private void preOrder (node localroot) {
     if (localroot != null) {
         System.out.print(localroot.id + " ");
         preOrder (localroot.leftchild);
         preOrder (localroot.rightchild);
     }
 }
 private void inOrder (node localroot ){
     if (localroot != null) {
         inOrder(localroot.leftchild);
         System.out.print(localroot.id + " ");
         inOrder (localroot.rightchild);
     }
 }
 private void postOrder(node localroot) {
     if (localroot != null) {
         postOrder(localroot.leftchild);
         postOrder(localroot.rightchild);
         System.out.print(localroot.id + " ");
         
     }
 }
 public void displayTree() {
     Stack globalStack = new Stack();
     globalStack.push(root);
     int nBlanks = 32;
     boolean isRowEmpty = false; System.out.println(
     "....................................................."
     );
     while (isRowEmpty == false) {
         Stack localStack = new Stack();
         isRowEmpty = true;
         for (int j = 0; j < nBlanks; j++) {
             System.out.print(' ');
             
         } 
         while (globalStack.isEmpty() == false) {
             node temp = (node) globalStack.pop();
             if (temp != null) {
                 System.out.print(temp.id);
                 localStack.push(temp.leftchild);
                 localStack.push(temp.rightchild);
                 if (temp.leftchild != null  || temp.rightchild != null) {
                     isRowEmpty = false;
                 }
             }else {
                 System.out.print("--"); localStack.push(null); localStack.push(null);
             }
             for (int j = 0; j < nBlanks * 2 - 2; j++) {
                 System.out.print(' ');
             }
         }
         System.out.println();
         
         nBlanks /= 2;
         while (localStack.isEmpty() == false) {
             globalStack.push(localStack.pop());
         }
     }
     System.out.println(
     "........................................................");
 }
}
