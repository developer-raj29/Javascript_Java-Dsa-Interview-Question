public class patternPractice {
    /*
     * * * *
     * * * *
     * * * *
     * * * *
     */
    public static void pattern1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * 
     * *
     * * *
     * * * *
     */
    public static void pattern2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * *
     * * *
     * *
     *
     */
    public static void pattern3(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * -* * * *
     * ---* * *
     * -----* *
     * -------*
     */
    public static void pattern4(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= num - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // public static void pattern4(int num) {
    // for (int i = 1; i <= num; i++) {
    // // Print leading spaces
    // for (int j = 1; j < i; j++) {
    // System.out.print(" "); // two spaces to align with "* "
    // }
    // // Print stars
    // for (int k = 1; k <= num - i + 1; k++) {
    // System.out.print("* ");
    // }
    // System.out.println(); // move to next line
    // }
    // }

    /*
     * * * * *
     * * - - *
     * * - - *
     * * * * *
     */

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*
     * - - - *
     * - - * *
     * - * * *
     * * * * *
     */

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= n - i; j++) { // inner loop
                System.out.print(" "); // spaces
            }
            for (int k = 1; k <= i; k++) { // inner loop
                System.out.print("*"); // stars
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */
    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= i; j++) { // inner loop
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     */
    public static void pattern8(int n) {
        for (int i = n; i >= 1; i--) { // outer loop
            for (int j = 1; j <= i; j++) { // inner loop
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= n - i + 1; j++) { // inner loop
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     */

    public static void pattern10(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= i; j++) { // inner loop
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     * 1 0 1 0 1
     */
    public static void pattern11(int n) {
        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= i; j++) { // inner loop
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");

                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 4;
        pattern1(num);
        System.out.println();
        pattern2(num);
        System.out.println();
        pattern3(num);
        System.out.println();
        pattern4(num);
        System.out.println();
        pattern5(num);
        System.out.println();
        pattern6(num);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
    }
}
