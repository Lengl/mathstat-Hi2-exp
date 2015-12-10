package com.github.Lengl.Generators;

import java.util.Random;

/**
 * Created by Lengl on 10.12.2015.
 */
public class UniformGenerator {
  private final double a;
  private final double b;
  private final Random uniformGenerator;

  public UniformGenerator(double a, double b) {
    this.a = a;
    this.b = b;
    uniformGenerator = new Random();
  }

  public double nextUniform() {
    return a + (b - a) * uniformGenerator.nextDouble();
  }
}
