package Practica15;

public class Math2 implements IExtremos {
    
  @Override
  public int min(int[] a) {
      int minValue = a[0];
      for (int value : a) {
          if (value < minValue) {
              minValue = value;
          }
      }
      return minValue;
  }
  
  @Override
  public int max(int[] a) {
      int maxValue = a[0];
      for (int value : a) {
          if (value > maxValue) {
              maxValue = value;
          }
      }
      return maxValue;
  }
  
  @Override
  public double min(double[] a) {
      double minValue = a[0];
      for (double value : a) {
          if (value < minValue) {
              minValue = value;
          }
      }
      return minValue;
  }
  
  @Override
  public double max(double[] a) {
      double maxValue = a[0];
      for (double value : a) {
          if (value > maxValue) {
              maxValue = value;
          }
      }
      return maxValue;
  }
}
