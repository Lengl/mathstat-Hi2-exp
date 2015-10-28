package com.github.Lengl.Exponential;

import java.util.Random;
import java.lang.Math;

public class ExpGenerator {
  private final double lambda;
  private final Random uniformGenerator;

  public ExpGenerator(double lambda) {
    this.lambda = lambda;
    uniformGenerator = new Random();
  }

  public double nextExp() {
    return -Math.log(uniformGenerator.nextDouble()) / lambda;
  }
}
