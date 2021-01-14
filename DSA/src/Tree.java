import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node 
   { 
      int key; 
      Node left, right; 
      public Node(int k) {
         key = k;
         left = null;
         right = null;
      }
} 
// Java program to check whether a given 
// Binary Tree is Perfect or not 
public class Tree { 

   /* Tree node structure */
   
   
   // Returns depth of leftmost leaf. 
   static int findADepth(Node node) 
   { 
      int d = 0; 
      while (node != null) 
      { 
         d++; 
         node = node.left; 
      } 
      return d; 
   } 
   
   /* This function tests if a binary tree is perfect 
   or not. It basically checks for two things : 
   1) All leaves are at same level 
   2) All internal nodes have two children */
   static boolean isPerfectRec(Node root, int d, int level) 
   { 
      // An empty tree is perfect 
      if (root == null) 
         return true; 
   
      // If leaf node, then its depth must be same as 
      // depth of all other leaves. 
      if (root.left == null && root.right == null) 
         return (d == level+1); 
   
      // If internal node and one child is empty 
      if (root.left == null || root.right == null) 
         return false; 
   
      // Left and right subtrees must be perfect. 
      return isPerfectRec(root.left, d, level+1) && isPerfectRec(root.right, d, level+1); 
   } 
   
   // Wrapper over isPerfectRec() 
   static boolean isPerfect(Node root) 
   { 
      int d = findADepth(root); 
      return isPerfectRec(root, d, 0); 
   } 
   
   /* Helper function that allocates a new node with the 
   given key and NULL left and right pointer. */
   
   
   // Driver Program 
   public static void main(String args[]) 
   { 
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int[][] t = new int[n][2];
      Node[] nodes = new Node[n];
      
      for (int i = 0; i <  n-1; i++) {
         int x = s.nextInt();
         int y = s.nextInt();
         if (nodes[x] == null) {
            nodes[x] = new Node(1);
         }
         if (nodes[y] == null) {
            nodes[y] = new Node(1);
         }
         if (nodes[x].left == null) {
            nodes[x].left = nodes[y];
         } else if (nodes[x].right == null){
            nodes[x].right = nodes[y];
         } else {
            System.out.println("no");
            return;
         }
      }
      s.close();
      if (isPerfect(nodes[0])) {
         System.out.println("yes");
      } else {
         System.out.println("no");
      }
     
   } 
   
}
 