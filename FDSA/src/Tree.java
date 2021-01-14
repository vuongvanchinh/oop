
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class Tree {
   static V addNode(V root, int data) {
      if (root == null) return new V(data);
      if (root.value < data) {
         root.right = addNode(root.right, data);
      } else if (root.value > data) {
         root.left = addNode(root.left, data);
      }
      
      return root;
   }

   static void preOrder(V root) {
      if (root == null) return;
      System.out.print(root.value + " ");
      preOrder(root.left);
      preOrder(root.right);
   }

   static void inOrder(V root) {
      if (root == null) return;
      
      inOrder(root.left);
      System.out.print(root.value + " ");
      inOrder(root.right);
   }

   static void postOrder(V root) {
      if (root == null) return;
      
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.value + " ");
   }

   static int preToValue(String pre) {
      LinkedList<Integer> numbers = new LinkedList<>();
      int i = pre.length() -1;
      int t;

      while (i >= 0) {
         try {
            switch (pre.charAt(i)) {
               case '*':
                  t = numbers.pop() * numbers.pop();
                  numbers.push(t);
                  break;
               case '/':
                  t = numbers.pop() / numbers.pop();
                  numbers.push(t);
                  break;
               case '+':
                  t = numbers.pop() + numbers.pop();
                  numbers.push(t);
                  break;
               case '-':
                  t = numbers.pop() - numbers.pop();
                 
                  numbers.push(t);
                  break;
   
               default:
                  numbers.push(Integer.parseInt(pre.charAt(i) + ""));
                  break;
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
         
         i --;
      }
      return numbers.pop();
   }

   static int postToValue(String post) {
      LinkedList<Integer> numbers = new LinkedList<>();
      int i = 0;
      int t;
      int operand1;
      int operand2;
      while (i < post.length()) {
         switch (post.charAt(i)) {
            case '-':
               operand2 = numbers.pop();
               operand1 = numbers.pop();
               t = operand1 - operand2;
               numbers.push(t);
               
               break;
            case '+':
               t = numbers.pop() + numbers.pop();
               numbers.push(t);
              
               break;
            case '*':
               t = numbers.pop() * numbers.pop();
               numbers.push(t);
               break;
            case '/':
               operand2 = numbers.pop();
               operand1 = numbers.pop();
               numbers.push(operand1 / operand2);
               break;
            default:
               numbers.push(Integer.parseInt("" + post.charAt(i)));
               break;
         }
         i++;
      }
      return numbers.pop();
   }

   static String inFixToPostFix(String infix) {
      StringBuilder postFix = new StringBuilder();
      LinkedList<Character> stack = new LinkedList<>();

      int i = 0;
      while (i < infix.length()) {
         switch (infix.charAt(i)) {
            case '(':
               stack.push(infix.charAt(i));
               break;
            case '+':
            case '-':
            case '*':
            case '/':
               //stack.push(infix.charAt(i));
               while (!stack.isEmpty() && getPriority(infix.charAt(i)) <= getPriority(stack.peek())) {
                  postFix.append(stack.pop());
               }
               stack.push(infix.charAt(i));
               break;
            case ')':
               Character x = stack.pop();
               while (x != '(') {
                  postFix.append(x);
                  x = stack.pop();
               }
               break;
            default:
               postFix.append(infix.charAt(i));
               break;
         }
         i++;
      }
      while (!stack.isEmpty()) {
         postFix.append(stack.pop());
      }
      return postFix.toString();
   }

   static String inFixToPreFix(String infix) {
      StringBuilder postFix = new StringBuilder();
      LinkedList<Character> stack = new LinkedList<>();

      int i = infix.length() - 1;
      while (i >= 0) {
         switch (infix.charAt(i)) {
            case ')':
               stack.push(infix.charAt(i));
               break;
            case '+':
            case '-':
            case '*':
            case '/':
               //stack.push(infix.charAt(i));
               while (!stack.isEmpty() && getPriority(infix.charAt(i)) <= getPriority(stack.peek())) {
                  postFix.append(stack.pop());
               }
               stack.push(infix.charAt(i));
               break;
            case '(':
               Character x = stack.pop();
               while (x != ')') {
                  postFix.append(x);
                  x = stack.pop();
               }
               break;
            default:
               postFix.append(infix.charAt(i));
               break;
         }
         i--;
      }
      while (!stack.isEmpty()) {
         postFix.append(stack.pop());
      }
      postFix.reverse();
      return postFix.toString();
   }

   static int getPriority(Character o) {
      if (o == '/' || o == '*') return 2;
      if (o == '-' || o == '+') return 1;
      return 0;
   }
   static boolean isOperator(Character s) {
      return s == '+' || s =='-' || s == '*' || s == '/';
   }

   static int calculate(int op1, int op2, Character op) {
      switch (op) {
         case '+': return op1 + op2;
         case '-': return op1 - op2;
         case '*': return op1 * op2;
         default: return op1 - op2;
      }
   }

   static int height(V root) {
      if (root == null) return 0;
      int left = height(root.left);
      int right = height(root.right);

      return 1 + Math.max(left, right);
   }
   static int diameter = 0;
   // static void diameterOfTree(V root) {
   //    diameterUtil(root, diameter);
   //    //return diameter;
   // }

   static void diameterUtil(V root) {
      if (root == null) return;
      diameter = Math.max(height(root.right) + height(root.left) + 1, diameter);
      diameterUtil(root.left);
      diameterUtil(root.right);
   }
   public static void main(String[] args) {
      V root = null;
      root = addNode(root, 100);
      addNode(root, 90);
      addNode(root, 110);
      addNode(root, 80);
      addNode(root, 95);
      addNode(root, 105);
      addNode(root, 120);
      addNode(root, 70);
      addNode(root, 60);
      addNode(root, 50);
      addNode(root, 96);
      addNode(root, 97);
      addNode(root, 98);
     // System.out.println(height(root.left));
      diameterUtil(root);
      System.out.println(diameter);
      //preOrder(root);
      // System.out.println();
      // inOrder(root);
      // System.out.println();
      // preOrder(root);
      //int[] pre = {100, 90, 80, 95, 110, 105, 120};
      // String pre = "--31+67";
      // //System.out.println(preToValue(pre));
      // String post = "31-67+-";
      // //System.out.println(preToValue(pre));
      // String infix = "(A*B)+C*((D-E)+F)/G";
      // //System.out.println(inFixToPostFix(infix));
      // System.out.println(inFixToPreFix(infix));

   }
}

class V {
   int value;
   V left;
   V right;

   public V(int data) {
      value = data;
      left = null;
      right = null;
   }
}

 //static int inOrderValue(String infix) {
   //    LinkedList<Integer> operands = new LinkedList<>();
   //    int l = infix.length();
   //    LinkedList<Character> operators = new LinkedList<>();
   //    int i = 0;
   //    while (i < l) {
   //       Character s = infix.charAt(i);
   //      switch (s) {
   //          case '+':
   //          case '-':
   //          case '*':
   //          case '/':
   //             while (!operators.isEmpty() && getPriority(s) <= getPriority(operators.peek())) {
   //                Character op = operators.pop();
   //                int op1 = operands.pop();
   //                int op2 = operands.pop();
   //                operands.push(calculate(op1, op2, op));
   //             } 
   //             break;
   //          case '(':
   //             operators.push(s);
   //             break;
   //          default:
   //             operands.push(Integer.parseInt(s+ ""));
   //      }
   //    }


   // }