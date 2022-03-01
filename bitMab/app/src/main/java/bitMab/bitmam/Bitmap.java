package bitMab.bitmam;




import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;



import java.io.IOException;
import java.awt.*;
public class Bitmap {

  private BufferedImage imageData;// subclass describes an Image with an accessible buffer of image data



// constacter

    public Bitmap(String photoPath,String outputPath)  throws IOException{

           File photoAsFile = new File(photoPath);//to deal with image file

        this.imageData = ImageIO.read(photoAsFile);// te read the image file
    }



        public void ImageWrite(String outputPath) throws IOException {

        File OUTPUT = new File(outputPath); //to create file

        ImageIO.write(this.imageData, "bmp", OUTPUT);//to outpt the file with new output

            System.out.println("successfly convert! ");


    }

    // instance that converts image to grayscale
    public int greenLayer() {
        for (int row=0; row < this.imageData.getWidth();row++){

      for( int colom=0; colom < this.imageData.getHeight(); colom++){

        Color bitColor = new Color(this.imageData.getRGB(row, colom));  //color of bit
                          int green = bitColor.getGreen();
                           int alpha = bitColor.getAlpha();

                     Color greenColor = new Color (0, green, 0, alpha);
                this.imageData.setRGB(row, colom, greenColor.getRGB());


            }}
        return 1;
    }

    public void sunyColor() {
        for (int row=0; row < this.imageData.getWidth();row++){

            for( int colom=0; colom < this.imageData.getHeight(); colom++){

                Color bitColor = new Color(this.imageData.getRGB(row, colom));  //color of bit
                       int green = bitColor.getGreen();
                int alpha = bitColor.getAlpha();

                Color greenColor = new Color (125, green, 0, alpha);
                this.imageData.setRGB(row, colom, greenColor.getRGB());
            }}}





    public void purpleLayer() {
        for (int row=0; row < this.imageData.getWidth();row++){

            for( int colom=0; colom < this.imageData.getHeight(); colom++){

                Color bitColor = new Color(this.imageData.getRGB(row, colom));  //color of bit
                int green = bitColor.getGreen();
                int alpha = bitColor.getAlpha();

                Color greenColor = new Color (125, green, 185, alpha);
                this.imageData.setRGB(row, colom, greenColor.getRGB());
            }}}




}