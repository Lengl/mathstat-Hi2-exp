package com.github.Lengl;

import com.github.Lengl.Generators.BernulliGenerator;
import com.github.Lengl.Generators.GaussGenerator;
import com.github.Lengl.Generators.UniformGenerator;
import com.github.Lengl.MaxLikehood.MLBernulli;
import com.github.Lengl.MaxLikehood.MLGauss;
import com.github.Lengl.MaxLikehood.MLUni;

import java.text.DecimalFormat;
import java.util.Vector;

/**
 * Created by Lengl on 10.12.2015.
 */
public class Task42 {

  public static void main(String[] args) {
    GaussGenerator gauss = new GaussGenerator(0, 4);
    BernulliGenerator bern = new BernulliGenerator(0.7);
    UniformGenerator unif = new UniformGenerator(0, 1);

    Vector<Double> G = new Vector<>();
    Vector<Integer> B = new Vector<>();
    Vector<Double> U = new Vector<>();

    for (int i = 0; i < 100; i++) {
      G.add(gauss.nextGauss());
      B.add(bern.nextBernulli());
      U.add(unif.nextUniform());
    }

    DecimalFormat formatter = new DecimalFormat("#0.000");

    G.stream().forEach(d -> System.out.print(formatter.format(d) + " "));
    System.out.println();
    System.out.println("theta1 = " + formatter.format(MLGauss.estimateM(G)) + ", theta2 = " + formatter.format(MLGauss.estimateD(G)));

    B.stream().forEach(d -> System.out.print(formatter.format(d) + " "));
    System.out.println();
    System.out.println("theta = " + MLBernulli.estimate(B));

    U.stream().forEach(d -> System.out.print(formatter.format(d) + " "));
    System.out.println();
    System.out.println("theta = " + formatter.format(MLUni.estimateB(U)));

  }
}
