/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.childrensmathsoftware;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChildrensMathSoftwareTest {

    @Test
    public void testCalculateAreaEquilateralTriangle() {
        double result = ChildrensMathSoftware.calculateArea(3, 5.0);
        assertEquals(10.83, result, 0.01);
    }

    @Test
    public void testCalculateAreaSquare() {
        double result = ChildrensMathSoftware.calculateArea(4, 5.0);
        assertEquals(25.0, result, 0.01);
    }

    @Test
    public void testIdentifyShapeTriangle() {
        String result = ChildrensMathSoftware.identifyShape(3);
        assertEquals("Triangle", result);
    }

    @Test
    public void testIdentifyShapeSquare() {
        String result = ChildrensMathSoftware.identifyShape(4);
        assertEquals("Square", result);
    }

    @Test
    public void testIdentifyShapeInvalid() {
        String result = ChildrensMathSoftware.identifyShape(6);
        assertEquals("Invalid number of sides", result);
    }
}
