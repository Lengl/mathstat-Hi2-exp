package com.github.Lengl.ChiSquared;

import java.util.Arrays;

public class Exp1Hypothesis {
  private final double[] borders;
  private final double probability;
  private final double quantile = 6.2514; // chi square(3), alpha = 0.1

  public Exp1Hypothesis(int N) {
    borders = new double[N + 1];
    probability = 1.0 / N;
    double counter = probability;
    borders[0] = 0;
    for (int i = 1; i < N; i++) {
      borders[i] = -Math.log(1 - counter);
      counter += probability;
    }
    borders[N] = -Math.log(0);
  }

  public boolean check(double[] sample) {
    Arrays.sort(sample);
    int j = 1;
    int[] dist = new int[borders.length - 1];
    Arrays.fill(dist, 0);
    for (double aSample : sample) {
      if (aSample > borders[j]) {
        j++;
      }
      dist[j - 1]++;
    }
    double T = 0;
    double expect = sample.length * probability;
    for (int aDist : dist) {
      System.out.print(aDist + " ");
      T += (aDist - expect) * (aDist - expect) / expect;
    }
    System.out.println();
    return T < quantile;
  }
}
