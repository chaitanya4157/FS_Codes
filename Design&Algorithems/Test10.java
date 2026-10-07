
/* QUESTION 17 : weighted union and collapsing find


/*
This experiment is on the implementation of weighted_union() and collapsing_find() algorithms.
The students are expected to write the code wherever "Write your code here" comment is there in the following program.
They are advised to complete the tasks in the following order

(1) Draw the trees represented by the 'parent' array.
(2) Write the disjoint sets represented by the trees.
(3) Write your code for weighted_union()
(4) Write your code for collapsing_find()
(5) Execute your program.  Test your code for test cases.
(6) If your program passes test cases then draw the final trees and sets on the paper to understand weighted_union and collapsing_find

------------
Prerequisite: To read and understand the notes 'find and union.pdf' file thoroughly.
------------

The students are expected to draw trees represented by 'parent' array.  Note that the 0th element of this array is unused.  
The elements from locations 1 to 10 are ONLY used.
*/
import java.util.*;

public class Test5 {

    static int[] parent = new int[11];


    static void weighted_union(int i, int j) {

        int rootI = collapsing_find(i);
        int rootJ = collapsing_find(j);

        if (rootI == rootJ) {
            return;
        }

        if (parent[rootI] <= parent[rootJ]) {
            parent[rootI] = parent[rootI] + parent[rootJ];
            parent[rootJ] = rootI;
        } else {
            parent[rootJ] = parent[rootI] + parent[rootJ];
            parent[rootI] = rootJ;
        }
    }

    static int collapsing_find(int i) {

        int root = i;

        while (parent[root] > 0) {
            root = parent[root];
        }

        while (i != root) {
            int next = parent[i];
            parent[i] = root;
            i = next;
        }

        return root;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        for (int i = 1; i <= 10; i++) {
            parent[i] = -1;
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            weighted_union(a, b);
        }

 
        for (int i = 1; i <= 10; i++) {
            System.out.print(parent[i] + " ");
        }

        System.out.println();

        int x = sc.nextInt();

        System.out.println(collapsing_find(x));

        sc.close();
    }
}