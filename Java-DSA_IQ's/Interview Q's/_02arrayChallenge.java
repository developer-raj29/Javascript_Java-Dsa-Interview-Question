// Have the function ArrayChallenge(strArr)read the strarz parameter being passed which will represent two rectangles on a Cartesian coordinate plane and will contain 8 coordinates with the first 4 making up rectangle 1 and the last 4 making up rectange 2. It will be in the following format:["(0,0),(2,2),(2,0), (0,2), (1,0),(1,2),(6,0),(6,2)"]Your program should determine the area of the space where the two rectangles overlap,and then output the number of times this overlapping region can fit into the first rectangle.For the above example,the overlapping region makes up a rectangle of area 2,and the first rectangle(the first 4 coordinates)makes up a rectangle of area 4,so your program should output 2. The coordinates will all be integers.If there'sno overlap between the two rectangles return 0.

// Examples

// Input:new String[]
// {
//    "(0,0), (0,-2), (3,0), (3,-2), (2,-1), (3,-1),(2,3), (3,3)"
// }
// Output: 6

public class _02arrayChallenge {
    public static String arrayChallenge(String[] strArr) {
        String[] coords = strArr[0].replaceAll("[()\\s]", "").split(",");
        int[][] points = new int[8][2];

        for (int i = 0; i < 8; i++) {
            points[i][0] = Integer.parseInt(coords[i * 2]); // x
            points[i][1] = Integer.parseInt(coords[i * 2 + 1]); // y
        }

        // Get bounding box for rectangle 1
        int minX1 = Integer.MAX_VALUE, maxX1 = Integer.MIN_VALUE;
        int minY1 = Integer.MAX_VALUE, maxY1 = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            minX1 = Math.min(minX1, points[i][0]);
            maxX1 = Math.max(maxX1, points[i][0]);
            minY1 = Math.min(minY1, points[i][1]);
            maxY1 = Math.max(maxY1, points[i][1]);
        }

        // Get bounding box for rectangle 2
        int minX2 = Integer.MAX_VALUE, maxX2 = Integer.MIN_VALUE;
        int minY2 = Integer.MAX_VALUE, maxY2 = Integer.MIN_VALUE;

        for (int i = 4; i < 8; i++) {
            minX2 = Math.min(minX2, points[i][0]);
            maxX2 = Math.max(maxX2, points[i][0]);
            minY2 = Math.min(minY2, points[i][1]);
            maxY2 = Math.max(maxY2, points[i][1]);
        }

        // Compute overlap
        int overlapLeft = Math.max(minX1, minX2);
        int overlapRight = Math.min(maxX1, maxX2);
        int overlapBottom = Math.max(minY1, minY2);
        int overlapTop = Math.min(maxY1, maxY2);

        int overlapWidth = overlapRight - overlapLeft;
        int overlapHeight = overlapTop - overlapBottom;

        if (overlapWidth <= 0 || overlapHeight <= 0) {
            return "0";
        }

        int overlapArea = overlapWidth * overlapHeight;
        int rect1Area = (maxX1 - minX1) * (maxY1 - minY1);

        return String.valueOf(rect1Area / overlapArea);
    }

    public static void main(String[] args) {
        String[] input = { "(0,0), (0,-2), (3,0), (3,-2), (2,-1), (3,-1), (2,3), (3,3)" };
        System.out.println(arrayChallenge(input)); // Output: 6
    }
}