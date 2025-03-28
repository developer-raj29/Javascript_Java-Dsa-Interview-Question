public class _01_GFG_Largest_Element_in_Array {
    public static int Largest(int arr[], int n) {
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println("Largest: " + Largest + " , " + arr[i]);
            if (Largest < arr[i]) {
                Largest = arr[i];
            }
        }
        return Largest;
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 8, 7, 56, 90 };

        System.out.println("Largest No. " + Largest(arr, n));

        // output = 90
    }

}