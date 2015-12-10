package com.github.Lengl.MaxLikehood;

import java.util.AbstractCollection;

/**
 * Created by Lengl on 10.12.2015.
 */
public class MLGauss {
  public static double estimateM(AbstractCollection<Double> data) {
    return data.stream().mapToDouble(Double::doubleValue).sum() / data.size();
  }

  public static double estimateD(AbstractCollection<Double> data, double M) {
    return data.stream().reduce(0.0, (a, b) -> a + (b - M) * (b - M)) / data.size();
  }

  public static double estimateD(AbstractCollection<Double> data) {
    return estimateD(data, estimateM(data));
  }
}
