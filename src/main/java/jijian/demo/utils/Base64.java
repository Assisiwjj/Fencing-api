package jijian.demo.utils;

import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Base64 {
    public static String toBase64(String image){
        if (image!=null && !image.equals("")) {
            InputStream inputStream = null;
            byte[] data = null;
            String imgFile = Constants.getCurrenPath() + image;
            try {
                inputStream = new FileInputStream(imgFile);
                data = new byte[inputStream.available()];
                inputStream.read(data);
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 加密
            BASE64Encoder encoder = new BASE64Encoder();
            String Data = "data:image/png;base64," + encoder.encode(data);
            Data = Data.replaceAll("\r\n", "").replaceAll("\r", "").replaceAll("\n", "");
            return Data;
        }else {
            return null;
        }
    }
}
