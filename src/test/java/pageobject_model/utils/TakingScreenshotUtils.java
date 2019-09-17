package pageobject_model.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TakingScreenshotUtils {
    public static void takeScreenshot() throws AWTException, IOException {
        Robot robot = new Robot();
        java.awt.Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage image = robot.createScreenCapture(screenSize);
        ImageIO.write(image, "png", new File("src\\test\\java\\resources\\screenshot\\image"));
    }
}
