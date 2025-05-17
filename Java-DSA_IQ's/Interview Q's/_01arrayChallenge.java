public class _01arrayChallenge {

    public static String arrayChallenge(int[] arr) {
        String challengeToken = "p4ja8geq6f"; // Hardcoded token
        int n = arr.length;
        int[] output = new int[n];
        int totalProduct = 1;

        // Count how many zeros are in the array
        int zeroCount = 0;
        for (int num : arr) {
            if (num == 0)
                zeroCount++;
            else
                totalProduct *= num;
        }

        // Build output array
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                output[i] = 0;
            } else if (zeroCount == 1) {
                output[i] = (arr[i] == 0) ? totalProduct : 0;
            } else {
                output[i] = totalProduct / arr[i];
            }
        }

        // Join numbers with hyphen
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(output[i]);
            if (i < n - 1)
                result.append("-");
        }

        // Reverse result and token
        String reversedResult = new StringBuilder(result.toString()).reverse().toString();
        String reversedToken = new StringBuilder(challengeToken).reverse().toString();

        return reversedResult + ":" + reversedToken;
    }

    public static void main(String[] args) {
        // You can test with any array here
        int[] arr = { 1, 4, 3 };
        System.out.print(arrayChallenge(arr));
    }
}