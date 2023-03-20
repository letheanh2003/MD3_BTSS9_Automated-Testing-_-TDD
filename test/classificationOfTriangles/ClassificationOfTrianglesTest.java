package classificationOfTriangles;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassificationOfTrianglesTest {
    @ParameterizedTest
    @CsvSource({
            "2, 2, 2, equilateral triangle",
            "2, 2, 3, isosceles triangle",
            "2, 4, 5, normal triangle",
            "8, 2, 3, not triangle",
            "-1, 2, 1, not triangle",
            "0, 1, 1, not triangle",
    })
    void getClassificationOfTrianglesTest(int sideA, int sideB, int sideC, String expected){
        String result = ClassificationOfTriangles.getClassificationOfTriangles(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
}