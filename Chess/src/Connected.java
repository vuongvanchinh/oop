public class Connected {

   static boolean check(int x, int y, int n, int m) {
      return x >= 0 && x < n && y >= 0 && y < m; 
   }

   static int[] coordinate(int[][] matrix, boolean[][] visited, int m, int n) {
      int[] result = {-1, -1};
      for (int i = 0; i< m; i++) {
         for (int j = 0; j < n; j++) {
            if (!visited[i][j] && matrix[i][j] == 1) {
               result[0] = j;
               result[1] = i;
               return result;
            }
         }
      }
      return result;
   }

    static int connectedCell(int[][] matrix) {
        int max = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean visited[][] = new boolean[m][n];
        int[] position = coordinate(matrix, visited, m, n);
        while (position[0] != -1) {
            max = Math.max(max, depthFirstSearch(position[0], position[1], matrix, visited));
            position = coordinate(matrix, visited, m, n);
            //System.out.println("here");
         }
        return max;
    }
   static int depthFirstSearch(int xt, int yt, int[][] matrix, boolean[][] visited) {
      visited[yt][xt] = true;
      //System.out.println(yt + " " + xt);
      int p1;
      int p2;
      int result = 1;
      for (int y = -1; y <= 1; y++) {
         for (int x = -1; x <= 1; x++) {
            p2 = yt + y;
            p1 = xt + x;
            if (yt == 4 && xt == 2) {System.out.println(p2 + " " + p1);}
            if (check(p1, p2, matrix[0].length, matrix.length) && matrix[p2][p1] == 1 && !visited[p2][p1]) {
               result += depthFirstSearch(p1, p2, matrix, visited);
            }
         }
      }
     
      return result;
   }
    

   public static void main(String[] args) {
      /**
       * 0 1 1 1 1
1 0 0 0 1
1 1 0 1 0
0 1 0 1 1
0 1 1 1 0
       */
      int[][] matrix = {{0, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 1, 0, 1, 0}, {0, 1, 0, 1, 1}, {0, 1, 1, 1, 0}};

      int[][] a = {{1, 1}, {0,1}};
      
      System.out.println(connectedCell(a));
      //System.out.println(check(2, 1, a[0].length, a.length));
   }
}
