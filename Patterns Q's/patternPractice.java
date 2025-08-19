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
     * * * *
     --* * *
     ----* *
     ------*
     */
    public static void pattern4(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
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

    public static void main(String[] args) {
        int num = 4;
        pattern1(num);
        System.out.println();
        pattern2(num);
        System.out.println();
        pattern3(num);
        System.out.println();
        pattern4(num);
    }
}
