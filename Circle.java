public class Circle { 
   static final int radius = 10;
   public static void main(String[] args) {
         // draw rows radius to -radius, counting down by -1
      for (int y = radius; y >= -radius; y--) {
      // row has spaces, stars, newline
         int circleX = (int)(2*Math.sqrt(radius*radius - y*y)+.5);
      
      // spaces start at -radius, end at -circleX - 1
         for (int x = -2*radius; x < -circleX; x++) {
            System.out.print(" ");
         }
      
      // star loop -circleX to circleX 
         for (int x = -circleX; x <= circleX; x++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
