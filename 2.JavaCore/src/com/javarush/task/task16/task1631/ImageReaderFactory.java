package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader (ImageTypes image) throws IllegalArgumentException {
        ImageReader returnImage = null;


        try {
            if (image.equals(ImageTypes.JPG)) {
                returnImage = new JpgReader();
            } else if (image.equals(ImageTypes.PNG)) {
                returnImage = new PngReader();
            } else if (image.equals(ImageTypes.BMP)) {
                returnImage = new BmpReader();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return returnImage;
    }
}