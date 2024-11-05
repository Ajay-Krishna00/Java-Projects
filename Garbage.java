public class Garbage {
  public static void main(String[] args) {
    String s = "Hello";
    System.out.println(s);
    s = null;
    System.gc();
  }

  // Override the finalize method to clean up the object
  @Override
  // finalize() method is called just before an object is garbage collected
  protected void finalize() {
    System.out.println("Garbage collected");
  }
}
