/* Case Study 1

A college placement cell has 10,000 student records that need to be arranged by package score. The college wants a sorting technique that gives consistent (O(nlog n)) performance even when the data is already sorted or reverse sorted.
Task: Develop a Java program to arrange the records in ascending order.

Input=
8
45 12 78 34 23 67 9 56

Output=
Sorted marks:
9 12 23 34 45 56 67 78
    
*/
import java.util.*;

public class CaseStudy1 {

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = arr[left + i];
        }

        for (int i = 0; i < n2; i++) {
            b[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = b[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted marks:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
