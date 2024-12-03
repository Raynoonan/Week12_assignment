package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {
  
  private TestDemo testDemo;
  static void parameter() {
    
  }

  @BeforeEach
  void setUp() throws Exception {
    testDemo = new TestDemo();
  }

  @ParameterizedTest
  @MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
  
  void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean 
      expectedException) {
    
   if(!expectedException) {
     assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
   } else { 
     assertThatThrownBy(() ->
     testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
   }
  }
  
  public static Stream<Arguments> arugmentsForAddPositive() {
    parameter.arguments(2,4,6,false);
    parameter.arguments(-1,2,3,true);
    parameter.arguments(0,6,7,false);
   return Stream.of();
    
  }
  @Test
   void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
    assertThat(testDemo.addPositive(4,5)).isEqualTo(9);
    assertThat(testDemo.addPositive(40,50)).isEqualTo(90);
    assertThat(testDemo.addPositive(2, 6)).isEqualTo(8);
    
  }
  @ParameterizedTest
  public void JUnitTest() {
    TestDemo.NewFunctionality();
  }
  @Test
   void assertThatNumberSquaredIsCorrect() {
    TestDemo mockDemo = spy(testDemo);
    doReturn(5).when(mockDemo).getRandomInt();
    int fiveSquared = mockDemo.randomNumberSquared();
    assertThat(fiveSquared).isEqualTo(25);
  }

}
