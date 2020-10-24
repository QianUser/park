package com.park.cloud.common.util;

import com.park.cloud.common.constant.Constants;
import com.park.cloud.common.constant.Constants;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.Key;

public class DESTools {
    //算法名称  
    public static final String KEY_ALGORITHM = "DES";
    //算法名称/加密模式/填充方式  
    public static final String CIPHER_ALGORITHM = "DES/ECB/PKCS5Padding";

    public static final String CHART_SET = "UTF-8";

    // 还原密钥 
    private static Key toKey(String key) throws Exception {
        DESKeySpec des = new DESKeySpec(key.getBytes(CHART_SET));
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(KEY_ALGORITHM);
        return keyFactory.generateSecret(des);
    }

    //加密 
    public static String encrypt(String content, String key) {
        try {
            Key k = toKey(key);
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            //IvParameterSpec iv = new IvParameterSpec(key.getBytes(CHART_SET));
            cipher.init(Cipher.ENCRYPT_MODE, k);

            byte[] pasByte = cipher.doFinal(content.getBytes(CHART_SET));
            return toHexString(pasByte).toUpperCase();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //解密
    public static String decrypt(String content, String key) {
        try {
            Key k = toKey(key);
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            //IvParameterSpec iv = new IvParameterSpec(key.getBytes(CHART_SET));
            cipher.init(Cipher.DECRYPT_MODE, k);
            byte[] pasByte = cipher.doFinal(convertHexString(content));

            return new String(pasByte, CHART_SET);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] convertHexString(String ss) {
        byte digest[] = new byte[ss.length() / 2];
        for (int i = 0; i < digest.length; i++) {
            String byteString = ss.substring(2 * i, 2 * i + 2);
            int byteValue = Integer.parseInt(byteString, 16);
            digest[i] = (byte) byteValue;
        }

        return digest;
    }

    public static String toHexString(byte b[]) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            String plainText = Integer.toHexString(0xff & b[i]);
            if (plainText.length() < 2) {
                plainText = "0" + plainText;
            }
            hexString.append(plainText);
        }

        return hexString.toString();
    }


    public static void main(String[] args) throws Exception {
        String key = "";
        String srcCode = "[\n" +
                "  {\n" +
                "    \"an\": \"百度地图\",\n" +
                "    \"ap\": \"com.baidu.map\"\n" +
                "  },{\n" +
                "    \"an\": \"百度\",\n" +
                "    \"ap\": \"com.baidu.search\"\n" +
                "  }\n" +
                "]";
        System.out.println("srcCode=" + srcCode);
        //加密
        String srcCodeEncode = encrypt(srcCode, key);
        System.out.println("srcCodeEncode=" + srcCodeEncode);

        srcCodeEncode = "17BEEFE2877273AC657D183CEAA86B234E4071CD8F1D2E18E55500D92A04DD5712F31D2B4DFD039819B47294714B6AF76A1C1D1748F196DF0CE2FE8A869C486ECE6C489EE5FADFE0879DB5EE007F0F4727502823AA2CE573A55625AFCD1C2E930D80CD8E31BA43FB4EE950A7C9CE82C59FB82C096A0B65F53763EF2EE229F670FF727459C6ADD8A7DCD4276D838C1BE6E684C72DE097367394EC8D7932F199EB8CE01E4BB8D6AACA5BF768901AB5D82D856D71D7151E2CE0747DDBD704554A1FBA9439F00E40B70903A7A25E731A4D52B403FC932617F53334A4272DCA952D23B11343264A79C79A20220DC368E2858939E04D450924E67A41C301168AB4E8BA61047197CE3B1710ECBC0F0A1D511CF75682873D09F943D9E8421D638CC357B4BA9F538ED90CE960D3FF2E3777910D8CA1AAC8D4962C97888B589E481E0A63B5EDB1798F8FDE8F1FC43192F1D98813884F18F717F957D6A8D027DDAAE53AD42F8FF31C53A6AC96D90BDEDB877C030E1727502823AA2CE573B2B2003C213801F0A66EB1CACEAC39650216C352E4819C3C2B136A77E264483A19CBBDDB4B722E97D35F5C432073F4CF5DE62B5A0DEADFC134478307EAC0B9E119E0426CF6AAE81B427136C99DA123C879753EF83435D3CCF85603886994D0B59AC81CE1AC7BA0042EE52E9D8897BBCC645BD8399134615B1211507359604F2D3A3859F6F388C66E9586C567E7038A41A298B480404E616A025B4E541BE6E21432B00C1D9A0EFFE5";
        System.out.println("srcCodeEncode=" + srcCodeEncode);

        //解密
        String srcCodeDecode = decrypt(srcCodeEncode, key);
        System.out.println("srcCodeDecode=" + srcCodeDecode);

        if (srcCode.equals(srcCodeDecode)) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }


    }
}
