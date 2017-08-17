import java.util.List;
import java.util.ArrayList;

public class Rectangle {
  private int mLength;
  private int mWidth;
  private static List<Rectangle> all() {
    return instances;
  }

  public Rectangle(int length, int width) {
     mLength = length;
     mWidth = width;
     instances.add(this);
   }
