package ShortHandOperationANDMissilenous;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class QRCodeGeneration {
    //Required additional jar file
/*
* additional java file on src/DownloadedJarFile --> folder
* */


    public static void main(String[] args) throws IOException, NotFoundException {
        String details = "Name : Asanka Lalith - ";

        ByteArrayOutputStream byteArrayOutputStream = QRCode.from(details).to(ImageType.JPG).stream();

        File file = new File("D:\\Desktop\\Final Year Project\\LearningJava\\QRCodeGen.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();

        //Image file convert to string
        BufferedImage bufferedImg = ImageIO.read(file);
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImg);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Result result = new MultiFormatReader().decode(bitmap);


        System.out.println("Barcode Format: " + result.getBarcodeFormat());
        System.out.println("Content: " + result.getText());

    }
}
