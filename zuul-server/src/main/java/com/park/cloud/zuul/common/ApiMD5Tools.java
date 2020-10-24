package com.park.cloud.zuul.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 接口MD5
 * @author 1004185
 */
public class ApiMD5Tools {
	public static String encodeMD5(String inStr) {
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			byteArray[i] = (byte) charArray[i];
		}

		byte[] md5Bytes;
		try {
			md5Bytes = MessageDigest.getInstance("MD5").digest(byteArray);
			StringBuffer hexValue = new StringBuffer();
			for (int i = 0; i < md5Bytes.length; i++) {
				int val = ((int) md5Bytes[i]) & 0xff;
				if (val < 16)
					hexValue.append("0");
				hexValue.append(Integer.toHexString(val));
			}
			return hexValue.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		if(args.length==1){
			System.out.println("after MD5 encode:"+encodeMD5(args[0]));
		}else{
			System.out.println("please enter one parameter!");
		}
	}
}
