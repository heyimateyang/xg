package org.heyimateyang.unit;

import java.security.MessageDigest;

import org.junit.Test;

/**
 * @Description MD5加密算法工具类
 * @Description (用于密码验证,配合UUID随机盐使用)
 * @version 1.0版本
 * @author heyimateyang
 *
 */

public class MD5_Unilt {
	
	
	public final static String MD5(String pwd) {  
        //用于加密的字符  
        char md5String[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',  
                'A', 'B', 'C', 'D', 'E', 'F' };  
        try {  
            //将结果存储到一个新的 byte数组中  
            byte[] btInput = pwd.getBytes();  
               
            //信息摘要是安全的单向哈希函数，它接收任意大小的数据，并输出固定长度的哈希值。  
            MessageDigest mdInst = MessageDigest.getInstance("MD5");  
               
            //MessageDigest对象通过使用 update方法处理数据， 使用指定的byte数组更新摘要  
            mdInst.update(btInput);  
               
            // 摘要更新之后，通过调用digest（）执行哈希计算，获得密文  
            byte[] md = mdInst.digest();  
               
            // 把密文转换成十六进制的字符串形式  
            int j = md.length;  
            char str[] = new char[j * 2];  
            int k = 0;  
            for (int i = 0; i < j; i++) {   //  i = 0  
                byte byte0 = md[i];  //95  
                str[k++] = md5String[byte0 >>> 4 & 0xf];    //    5   
                str[k++] = md5String[byte0 & 0xf];   //   F  
            }  
               
            //返回经过加密后的字符串  
            return new String(str);  
               
        } catch (Exception e) {  
            return null;  
        }  
    }  
	
	@Test
	public void TestMD5(){
		UUID_Unitl uuid_Unitl = new UUID_Unitl();
		String UUID_test = uuid_Unitl.UUID_Number();
		String password = "andy84129227";
		System.out.println(MD5(password));
		String salte = password + "fedd97efcf1d47cead59cc218ce7ed3e";
		//System.out.println(salte);
		String md5_tes = MD5(salte);
		System.out.println(md5_tes);
	}

}
