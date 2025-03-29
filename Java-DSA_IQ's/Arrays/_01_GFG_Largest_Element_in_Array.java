public class _01_GFG_Largest_Element_in_Array {
    public static int largest(int arr[], int n) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println("Largest: " + Largest + " , " + arr[i]);
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 8, 7, 56, 90 };

        System.out.println("Largest No. " + largest(arr, n));

        // output = 90
    }
}

/*
 * Approache:
 * 1. check Largest or max value is less than current value {arr[i]}. toh update
 * largest or max value assign karo current value {arr[i]} ko.
 * if(largest < arr[i]) largest = arr[i];
 * 2. return largest value.
 */