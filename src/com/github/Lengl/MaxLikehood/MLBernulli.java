package com.github.Lengl.MaxLikehood;

import java.util.AbstractCollection;

public class MLBernulli {
  public static double estimate(AbstractCollection<Integer> data) {
    return ((double) data.stream().mapToInt(Integer::intValue).sum()) / data.size();
  }
}
