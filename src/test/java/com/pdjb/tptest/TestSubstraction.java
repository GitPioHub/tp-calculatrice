package com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import com.pdjb.tptest.Substraction;

import org.junit.Test;


public class TestSubstraction {

  @Test
  public final void testSubstract() {
    assertTrue(Substraction.substract(2,2) == 0);
  }
}
