class test3 {
   public static void main(String[] args) {
// V1: Print the pattern
// V2: Print each line correctly
// V3: Print nine lines correctly
// V4: Considering the rows are numbered 1-9, incrementing by 1.
for (int i = 1; i <= 9; i++) {
// Starts at 1, increment by 1, until row number
for (int j = 1; j <= i; j++) {
System.out.print(j);
System.out.print("-"); 
}

// Starts at row number, decrement by 1, until 1
for (int k = i; k > 1; k--) {
System.out.print(k);
System.out.print("-");
         }
         System.out.print(1);
         System.out.println("");
      }
   }
}
