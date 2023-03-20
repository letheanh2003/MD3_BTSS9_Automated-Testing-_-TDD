package classificationOfTriangles;

import java.util.Arrays;
import java.util.Collections;

public class ClassificationOfTriangles {
    public static String getClassificationOfTriangles(int sideA, int sideB, int sideC) {
        boolean isTriangle = checkIfTriangle(sideA, sideB, sideC);
        if (isTriangle)
            return getClassify(sideA, sideB, sideC);
        else
            return "not triangle";
    }

    public static boolean checkIfTriangle(int sideA, int sideB, int sideC) {
        Integer[] triangleSideArr = {sideA, sideB, sideC};
        int longestSide = Collections.max(Arrays.asList(triangleSideArr));
        int longestSideIndex = Arrays.asList(triangleSideArr).indexOf(longestSide);
        int totalTwoSideSmallSide = 0;
        for (int i = 0; i < triangleSideArr.length; i++) {
            if (i != longestSideIndex){
                totalTwoSideSmallSide += triangleSideArr[i];
            }
        }
        return totalTwoSideSmallSide > longestSide;
    }

    public static String getClassify(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideC == sideB) {
            return "equilateral triangle";
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "isosceles triangle";
        } else {
            return "normal triangle";
        }
    }
}
