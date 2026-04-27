package org.axyz.util;

public class SprintCalculator {
    public static int totalPoints(int... points){
        int total = 0;
        for(int point : points){
            total += point;
        }
        return total;
    }

    public static double averagePerTask( int[] points){
        int total = 0;
        for (int i = 0; i < points.length; i++){
                 total += points[i];

        }
        return (double) total/points.length;
    }
    public static double completionPercentage(int[] points, int target){
        int total = 0;
        int i = 0;
        while (i < points.length){
            total += points[i];
            i++;
        }
        return ((double) total/target) * 100;

    }


}
