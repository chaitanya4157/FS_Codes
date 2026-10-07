/* 
An online shopping application needs to arrange product prices. The developer wants a sorting technique that is fast in practice and uses relatively less extra memory. The program should divide the data based on a selected element and recursively process the resulting parts.

Task:
Develop a Java program to arrange the prices in ascending order.

Input: 5 
5 3 1 6 1   

Output=
Enter number of products:                                                     
Enter prices:                                                                   
                                                                    
Sorted prices:                                                                  
1 1 3 5 6

*/
import java.util.*;

public class CaseStudy2 {

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivot = arr[high];

            int i = low - 1;

            for (int j = low; j < high; j++) {

                if (arr[j] <= pivot) {
                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int p = i + 1;

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products:");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        quickSort(prices, 0, n - 1);

        System.out.println("Sorted prices:");

        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }

        sc.close();
    }
}

