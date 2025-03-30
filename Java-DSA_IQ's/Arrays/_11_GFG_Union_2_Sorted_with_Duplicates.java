
// import java.util.ArrayList;
// import java.util.HashSet;
import java.util.*;

public class _11_GFG_Union_2_Sorted_with_Duplicates {
    public static ArrayList<Integer> union(int arr1[], int arr2[], int n, int m) {
        HashSet<Integer> set = new HashSet<>(); // create a hashset to store unique elements.
        ArrayList<Integer> Union = new ArrayList<>(); // create an arraylist to store the result.

        for (int i = 0; i < n; i++) {
            set.add(arr1[i]); // add elements of arr1 to the hashset.
        }

        for (int j = 0; j < m; j++) {
            set.add(arr2[j]); // add elements of arr2 to the hashset.
        }

        for (int it : set) {
            Union.add(it);
        }
        return Union; // return the arraylist.
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5 };
        int n = arr1.length;
        int m = arr2.length;
        System.out.println(union(arr1, arr2, n, m)); // output = [1, 2, 3, 4, 5, 6]
    }
}
