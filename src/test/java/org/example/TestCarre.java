package org.example;


import org.examples.Carre;
import org.junit.Assert;
import org.junit.Test;

public class TestCarre {

    @Test
    public void testAire(){
        // arrange
        float expectedResult = 4;
        Carre testcarre = new Carre(2);

        // act
        float result = testcarre.aire();

        // assert
        Assert.assertEquals(expectedResult, result, 0.1f);
    }
    @Test
    public void testPerimetre(){
        // arrange
        float expectedResult = 3*4;
        Carre testcarre = new Carre(3);

        // act
        float result = testcarre.perimetre();

        // assert
        Assert.assertEquals(expectedResult, result, 0.1f);
    }

}
