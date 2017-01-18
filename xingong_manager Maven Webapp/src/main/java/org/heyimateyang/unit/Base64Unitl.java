package org.heyimateyang.unit;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.springframework.stereotype.Repository;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


/**
 * @Description Base64加解密
 * @version 1.0
 * @author heyimateyang
 *
 */

@Repository("base64unitl")
public class Base64Unitl {
	
	//加密  
    public static String getBase64(String str) {  
        byte[] b = null;  
        String s = null;  
        try {  
            b = str.getBytes("utf-8");  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        if (b != null) {  
            s = new BASE64Encoder().encode(b);  
        }  
        return s;  
    }
    
    //解密  
    public static String getFromBase64(String s) {  
        byte[] b = null;  
        String result = null;  
        if (s != null) {  
            BASE64Decoder decoder = new BASE64Decoder();  
            try {  
                b = decoder.decodeBuffer(s);  
                result = new String(b, "utf-8");  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        return result;  
    }  
    
    @Test
    public void Test_64(){
    	System.out.println(getFromBase64("YW5keTg0MTI5MjI3"));
    }

}
