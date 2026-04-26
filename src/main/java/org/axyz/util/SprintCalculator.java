package org.axyz.util;

public class SprintCalculator {
    public static int totalPoint(int... points){
        int total = 0;
        for(int point : points){
            total += point;
        }
        return total;
    }

    public static double averagePerTask( int count, int[] numberOfTasksAndPoints){
        int total = 0;
        for (int i = 0; i < numberOfTasksAndPoints.length; i++){
            if(numberOfTasksAndPoints[i] > 0){
                 total += numberOfTasksAndPoints[i];
                count ++;
            }
        }
        return (double) total/count;
    }
    public static double completionPercentage(int target, int totalDone){
        return (totalDone / (double)target) * 100;
    }


}
