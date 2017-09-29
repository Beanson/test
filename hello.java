/**
 * Created by Administrator on 2017/9/20.
 */
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.awt.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

class hello{

    private static String a="this yeah is not  great is a test for different line";

    public static void main(String[] args) {

        GraphicsConfiguration gconfig = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getDefaultScreenDevice()
                .getDefaultConfiguration();

        screenRecorder = new ScreenRecorder(gconfig,
                new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_QUICKTIME),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,
                        ENCODING_QUICKTIME_JPEG,
                        CompressorNameKey, ENCODING_QUICKTIME_JPEG,
                        DepthKey, (int)24, FrameRateKey, Rational.valueOf(15),
                        QualityKey, 1.0f,
                        KeyFrameIntervalKey, (int) (15 * 60)),
                new Format(MediaTypeKey, MediaType.VIDEO,
                        EncodingKey,"black", FrameRateKey, Rational.valueOf(30)), null);


        System.out.println("hello great darly world!");
    }

    public void greatThings(String dala){
        ab=1;
        ab++;
        System.out.println(dala+" is not really a better way to do it.");

    }
}
