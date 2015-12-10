package com.github.Lengl;

import com.github.Lengl.ChiSquared.Exp1Hypothesis;
import com.github.Lengl.Generators.ExpGenerator;

public class Task39 {
  public static void main(String[] args) {
    ExpGenerator generator = new ExpGenerator(1.0);
    double[] sample = new double[100];
    for (int i = 0; i < 100; i++) {
      sample[i] = generator.nextExp();
    }
    Exp1Hypothesis hyp = new Exp1Hypothesis(4);
    System.out.println(hyp.check(sample) ?
        "The data do not contradict the hypothesis" :
        "The hypothesis should be rejected");
  }
}
