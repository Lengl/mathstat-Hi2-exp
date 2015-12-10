package com.github.Lengl.MaxLikehood;

import java.util.AbstractCollection;
import java.util.Comparator;

/**
 * Created by Lengl on 10.12.2015.
 */
public class MLUni {

  public static double estimateA(AbstractCollection<Double> data) {
    return data.stream().min(Comparator.naturalOrder()).get();
  }

  public static double estimateB(AbstractCollection<Double> data) {
    return data.stream().max(Comparator.naturalOrder()).get();
  }
}
