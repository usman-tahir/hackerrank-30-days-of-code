
public class Calculator implements AdvancedArithmetic {

  public int divisorSum(int n) {

    int sum = 0;
    int index;

    for (index = 1; index <= n; index += 1) {
      if (n % index == 0) {
        sum += index;
      }
    }
    return sum;
  }

}
