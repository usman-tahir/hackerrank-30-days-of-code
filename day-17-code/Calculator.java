
class Calculator {

  public static int power(int n, int p) {
    if (n < 0 || p < 0) {
      throw new InvalidArgumentError("n and p should be non-negative");
    } else {
      return (int)Math.pow(n, p);
    }
  }

  public static class InvalidArgumentError extends RuntimeException {
    public InvalidArgumentError(String message) {
      super(message);
    }
  }

}
