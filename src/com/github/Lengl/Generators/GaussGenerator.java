package com.github.Lengl.Generators;

import java.util.Random;

/**
 * Created by Lengl on 10.12.2015.
 */
public class GaussGenerator {
  private final double m;
  private final double d2;
  private final Random gaussGenerator;

  public GaussGenerator(double m, double d2) {
    this.m = m;
    this.d2 = d2;
    gaussGenerator = new Random();
  }

  public double nextGauss() {
    return gaussGenerator.nextGaussian() * Math.sqrt(d2) + m;
  }
}
