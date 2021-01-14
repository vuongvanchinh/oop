public class Sort {
   
      void quickSort(int[] arr, int left, int right)
      {
         System.out.println(left + " " + right);
         if (left >= right) return;
         int pivot = arr[right];
         int i = left - 1;
         int j = right;
         //int t;
         
         while (true)
         {
            while (arr[++i] < pivot)
            {
               if (i == right)break;
            }

            while (arr[--j] > pivot)
            {
               if (j == left)break;
            }

            if (i >= j)break;
            
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
         }
         
         int t = arr[i];
         arr[i] = arr[right];
         arr[right] = t;

        // printArray(arr);

         quickSort(arr, left, i-1);
         quickSort(arr, i + 1, right);
      }
   static void printArray(int[] arr) {
      for (int i : arr) {
         System.out.print(i + " ");
      }
      System.out.println("");
   }
   public static void main(String[] args) {
     
      Sort ob = new Sort();
      int[] arr = {0,3,1,-1};
      //te(arr);
      ob.quickSort(arr, 0, 3);

      // for (int i : arr) {
      //    System.out.println(i);
      // }
   }
}
