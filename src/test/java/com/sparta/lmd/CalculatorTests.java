package com.sparta.lmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    @DisplayName("check to see if correct option add is chosen correctly")
    void checkOptionAdd(){
        Assertions.assertEquals("The result is: 10", Calculator.chooseOperation(1,6,4));
    }

    @Test
    @DisplayName("check to see if correct option subtract is chosen correctly")
    void checkOptionSubtract(){
        Assertions.assertEquals("The result is: 2", Calculator.chooseOperation(2,6,4));
    }

    @Test
    @DisplayName("check to see if correct option multiply is chosen correctly")
    void checkOptionMultiply(){
        Assertions.assertEquals("The result is: 24", Calculator.chooseOperation(3,6,4));
    }

    @Test
    @DisplayName("check to see if correct option subtract is chosen correctly")
    void checkOptionDivide(){
        Assertions.assertEquals("The result is: 2", Calculator.chooseOperation(4,8,4));
    }

    @Test
    @DisplayName("check to see if correct option add is given for invalid input")
    void checkOptionInvalid(){
        Assertions.assertEquals("Error! Invalid Input", Calculator.chooseOperation(5,6,4));
    }




}
