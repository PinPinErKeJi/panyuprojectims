package com.panyu.panyuprojectims;

import java.awt.image.BufferedImage;
        import java.io.ByteArrayOutputStream;
        import java.io.File;
        import java.io.FileOutputStream;
        import java.io.IOException;

        import javax.imageio.ImageIO;

        import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
        import org.apache.poi.hssf.usermodel.HSSFPatriarch;
        import org.apache.poi.hssf.usermodel.HSSFSheet;
        import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class Text {

    public static void main(String[] args) {
        Father father = new Child();

        System.out.println(Father.class);

        System.out.println(father.getClass());
    }
}

class Father{
    public void showName()
    {
        System.out.println("Father...");
    }
}
class Child extends Father{
    public void showName()
    {
        System.out.println("children");
    }
}

