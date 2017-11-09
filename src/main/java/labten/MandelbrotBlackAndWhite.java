package labten;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * This class has a main method that creates a black-and-white Mandelbrot
 * image. You do not need to understand all of the working details associated
 * with this program. Instead, you should develop a basic understanding of how
 * it works. Please consult with a teaching assistant, tutor, or a course
 * instructor if there are parts of the program that you do not intuitively
 * understand.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Gregory M. Kapfhammer
 */

public class MandelbrotBlackAndWhite {

  /** The main entry point for MandelbrotBlackAndWhite. This method will
   * iteratively construct the visualization using multiple loop and if
   * statements.
   *
   * @param args The command-line arguments
   */

  public static void main(String[] args) throws Exception {

    int width = 1920;
    int height = 1080;
    int max = 1000;
    int black = 0x000000;
    int white = 0xFFFFFF;
    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    for (int row = 0; row < height; row++) {
      for (int col = 0; col < width; col++) {
        double c_re = (col - width / 2) * 4.0 / width;
        double c_im = (row - height / 2) * 4.0 / width;
        double x = 0;
        double y = 0;
        int iterations = 0;
        while (x * x + y * y < 4 && iterations < max) {
          double x_new = x * x - y * y + c_re;
          y = 2 * x * y + c_im;
          x = x_new;
          iterations++;
        }
        if (iterations < max) {
          image.setRGB(col, row, white);
        } else image.setRGB(col, row, black);
      }
    }
    ImageIO.write(image, "png", new File("mandelbrot-bw.png"));
  }
}
