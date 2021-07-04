public class CalculatorWithMemory extends Calculator {
   /* The memory */
   private double memory;
   /* Instantiates a new calculator with memory */
   public CalculatorWithMemory() {
       this.memory = 0;
   }
   /* Save */
   public void save() {
       memory = getAccumulator(); // The value of accumulator assigned to memory
   }
   /* Recall */
   public void recall() {
       setAccumulator(memory); // The value of memory again assigned to accumulator
   }
   /* Clear memory */
   public void clearMemory() {
       memory = 0; // Zero value is assigned to the memory
   }
   /* Sets the memory with the new memory */
   public void setMemory(double memory) {
       this.memory = memory;
   }
   /* Gets the memory and then returns the memory */
   public double getMemory() {
       return memory; // This returns the value stored in the memory
   }
}
