/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author braya
 */
public class BasicOperation {

    //adittion, subtraction, divison, multiplication
    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }

    public static float subtractTwoNumbers(float minuend, float subtrahend) {
        float subtraction = 0;
        subtraction = minuend - subtrahend;
        return subtraction;
    }

    public static float multiplyTwoNumbers(float multipliying, float multiplier) {
        float product = 0;
        product = multipliying * multiplier;
        return product;
    }

    public static float divideTwoNumbers(float dividend, float divisor) {
        float quotient = 0;
        quotient = dividend / divisor;
        return quotient;
    }
    
}
