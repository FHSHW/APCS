/*
 * AP CS MOOC
 * Term 2 - Assignment 7: Bitmap
 * Use this runner to test your solutions to Assignment 7.
 */


import java.io.IOException;

public class BitmapRunner
{

 public static void main(String arg[]) throws IOException
 {
  int points[] = { 1, 1, 1, 3, 1, 4, 2, 1, 2, 2, 2, 5, 3, 1, 3, 6, 4, 0,
    4, 1, 4, 6, 4, 7, 5, 1, 5, 3, 5, 6, 6, 1, 6, 3, 6, 6, 7, 1, 7,
    3, 7, 6, 8, 1, 8, 2, 8, 3, 8, 4, 8, 5, 8, 6

  };
  Bitmap b = new Bitmap(points);

  System.out.println(b);
  System.out.println("after horizontal flip: ");
          
        b.flipHorizontal();
  System.out.println(b);
        
        
  System.out.println("after vertical flip: ");
        //flip back before flip Vertical
        b.flipHorizontal();
  b.flipVertical();
  System.out.println(b);

  System.out.println("after reverse flip: ");
        //flip back before reverse
        b.flipVertical();
  b.reverse();
  System.out.println(b);

 }

}
