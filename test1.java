class test1 {
   static int CYCLES = 10;
   public static void main(String[] args){
// V1: Print the pattern
// V2: Print each line correctly
// V3: Print CYCLES lines correctly
// V4: Considering the rows are numbered 
   // j values are 1 to CYCLES
      for(int j = 1; j <= CYCLES; j++) {
      // i values are j to CYCLES
         for(int i = j; i <= CYCLES; i++) {
            System.out.print(i + " ");
         }
         System.out.println(" ");
      }
// V1: Print the pattern
// V2: Print each line correctly 
// V3: Print CYCLES lines correctly 
// V4: Considering the rows are numbered CYCLES to 1, decrementing by 1
   // j values are CYCLES to 1
      for(int j = CYCLES; j >= 1; j--) {
      // i values are j to 1
         for(int i = j; i <= CYCLES; i++) {
            System.out.print(i + " ");
         }
         System.out.println(" ");
   }
}
}
