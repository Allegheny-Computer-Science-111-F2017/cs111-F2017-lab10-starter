package labten;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * This class has a main method that creates a color Mandelbrot image. You do
 * not need to understand all of the working details associated with this
 * program. Instead, you should develop a basic understanding of how it works.
 * Please consult with a teaching assistant, tutor, or a course instructor if
 * there are parts of the program that you do not intuitively understand.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Gregory M. Kapfhammer
 */

public class MandelbrotColor {

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
    int black = 0;
    int[] colors = new int[max];

    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    // starting point: i = 0
    // termination condition: i<max
    // advancement strategy: i++
    for (int i = 0; i < max; i++) {
      colors[i] = Color.HSBtoRGB(i / 256f, 1, i / (i + 8f));
    }

    // starting point: row = 0
    // termination condition: row<height
    // advancement strategy: row++
    for (int row = 0; row < height; row++) {
      // starting point: col = 0
      // termination condition: col<height
      // advancement strategy: col++
      for (int col = 0; col < width; col++) {
        double c_re = (col - width / 2) * 4.0 / width;
        double c_im = (row - height / 2) * 4.0 / width;
        double x = 0, y = 0;
        double r2;
        int iteration = 0;
        while (x * x + y * y < 4 && iteration < max) {
          double x_new = x * x - y * y + c_re;
          y = 2 * x * y + c_im;
          x = x_new;
          iteration++;
        }
        if (iteration < max) image.setRGB(col, row, colors[iteration]);
        else image.setRGB(col, row, black);
      }
    }
    ImageIO.write(image, "png", new File("mandelbrot-color.png"));
  }
}
