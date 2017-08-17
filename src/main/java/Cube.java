public class Cube {
  private Rectangle mFace;

  public Cube(Rectangle rectangle) {
    mFace = rectangle;
  }

  public int surfaceArea() {
  return mFace.area() * 6;
}
  }

}
