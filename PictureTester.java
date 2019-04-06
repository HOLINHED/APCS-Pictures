/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("./images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** added */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("./images/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  /** added */
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("./images/beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  /** added */
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("./images/beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  /** added */
  public static void testNegate()
  {
    Picture beach = new Picture("./images/beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  /** added */
  public static void testGrayscale()
  {
    Picture beach = new Picture("./images/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  /** added */
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("./images/water.jpg");
    beach.explore();
    beach.fixWater();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("./images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("./images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorArms()
  {
    Picture temple = new Picture("./images/snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }

    /** Method to test mirrordiagonal */
    public static void testMirrorDiagonal()
    {
      Picture temple = new Picture("./images/beach.jpg");
      temple.explore();
      temple.mirrorDiagonal();
      temple.explore();
    }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("./images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("./images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Added */
  public static void testCopy() {
    // copies part of a picture to this picture
    Picture swan = new Picture("./images/swan.jpg");
    Picture from = new Picture("./images/snowman.jpg");
    swan.copy(from, 50, 0,220,100);
    swan.explore();
  }

  /** Added */
  public static void myCollage() {
    Picture canvas = new Picture("./images/640x480.jpg");
    
    Picture pic1 = new Picture("./images/swan.jpg");
    Picture pic2 = new Picture("./images/snowman.jpg");
    Picture pic3 = new Picture("./images/beach.jpg");

    pic1.mirrorHorizontal();
    pic3.grayscale();
    pic2.negate();

    canvas.copy(pic2,0,179);
    canvas.copy(pic3, 200, 0);
    canvas.copy(pic1, 0, 0, 0, 300);

    canvas.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //myCollage();
    //testEdgeDetection();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
