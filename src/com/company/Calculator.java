public class Calculator {
   /* The accumulator */
   private double accumulator;
   /* Instantiates a new calculator */
   public Calculator() {
       this.accumulator = 0.0;
   }
   /* Gets the accumulator and then returns the accumulator */
   public double getAccumulator() {
       return accumulator;
   }
   /* Sets the accumulator with the new accumulator*/
   public void setAccumulator(double accumulator) {
       this.accumulator = accumulator;
   }
}
