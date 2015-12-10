package com.github.Lengl.Generators;

import java.util.Random;

/**
 * Created by Lengl on 10.12.2015.
 */
public class BernulliGenerator {
  private final double theta;
  private final Random uniformGenerator;


  public BernulliGenerator(double theta) {
    this.theta = theta;
    uniformGenerator = new Random();
  }

  public int nextBernulli(){
    return uniformGenerator.nextDouble() < theta ? 1 : 0;
  }
}
