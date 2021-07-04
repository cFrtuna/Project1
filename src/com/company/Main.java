class Main {
  public static void main(String[] args) {
    CalculatorWithMemory cal = new CalculatorWithMemory();
    cal.setMemory(34.6);
    cal.recall();
    System.out.println();
    System.out.println("Accumulator after recalling: " + cal.getAccumulator());
    cal.clearMemory();
    cal.recall();
    cal.save();
    System.out.println("After Clearing Accumulator: " + cal.getAccumulator());
  }
}
