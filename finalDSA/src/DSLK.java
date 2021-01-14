public class DSLK {

   static Node selectionSort(Node root) {
      Node t = root;
      Node j;
      while (t.next != null) {
         Node min = t;
         j = t.next;
         while (j != null) {
            min = (j.value < min.value) ? j : min;
            j = j.next;
         }
         int v = t.value;
         t.value = min.value;
         min.value = v;
         t = t.next;
      }
      return root;
   }

   static Node addNewNode(Node root, int data) {
      if (root == null) return new Node(data);
      root.next = addNewNode(root.next, data);
      return root;
   }

   static void showList(Node root) {
      Node t = root;
      while (t != null) {
         System.out.print(t.value + " ");
         t = t.next;
      }
   }

   static boolean hasCycle(Node root) {
      Node t1 = root;
      Node t2 = root;
      while (t1!= null && t2 != null && t2.next != null) {
         t1 = t1.next;
         t2 = t2.next.next;
         if (t1.value == t2.value) return true;
      }
      return false;
   }
   
   static Node tailNode(Node root) {
      Node t = root;
      while (t.next != null) {
         t = t.next;
      }
      return t;
   }



   public static void main(String[] args) {
      Node root = null;
      root = addNewNode(root, 1);
      addNewNode(root, 3);
      addNewNode(root, 2);
      addNewNode(root, -1);
      addNewNode(root, 5);
      //selectionSort(root);
      Node tail = tailNode(root);
      tail.next = root;
      System.out.println(hasCycle(root));
      //showList(root);
   }

   Node rightRotate(Node y)  
    {  
        Node x = y.left;  
        Node T2 = x.right;  
  
        // Perform rotation  
        x.right = y;  
        y.left = T2;  
  
        // Update heights  
        y.height = max(height(y.left), height(y.right)) + 1;  
        x.height = max(height(x.left), height(x.right)) + 1;  
  
        // Return new root  
        return x;  
    }  
    Node leftRotate(Node x)  
    {  
        Node y = x.right;  
        Node T2 = y.left;  
  
        // Perform rotation  
        y.left = x;  
        x.right = T2;  
  
        // Update heights  
        x.height = max(height(x.left), height(x.right)) + 1;  
        y.height = max(height(y.left), height(y.right)) + 1;  
  
        // Return new root  
        return y;  
    }  
}

class Node {
   int value;
   Node next;

   public Node(int data) {
      this.value = data;
   }
}


