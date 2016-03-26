public class Circle { 
   static final int radius = 20;
   static final double aspectXY = 3/1.6;
   public static void main(String[] args) {
         // draw rows radius to -radius, counting down by -1
      for (int y = radius; y >= -radius; y--) {
      // row has spaces, stars, newline
         int circleX = (int)(aspectXY*Math.sqrt(radius*radius - y*y)+.5);
      
      // spaces start at -radius, end at -circleX - 1
         for (int x = (int)(-aspectXY*radius-.5); x < -circleX; x++) {
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
