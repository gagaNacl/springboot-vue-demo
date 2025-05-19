package com.jiandu.backend.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 工具类：用于生成字符串或字节数组的MD5值
 */
public class Md5Util {

    /**
     * 生成字符串的MD5校验值
     * @param s 输入字符串
     * @return MD5值的16进制字符串
     */
    public static String getMD5String(String s) {
        // 将字符串转换为字节数组后计算MD5
        return getMD5String(s.getBytes());
    }

    /**
     * 生成字节数组的MD5校验值
     * @param bytes 输入字节数组
     * @return MD5值的16进制字符串
     */
    public static String getMD5String(byte[] bytes) {
        try {
            // 获取MD5算法的MessageDigest实例
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算MD5摘要
            byte[] digest = md.digest(bytes);
            // 将摘要结果转换为16进制字符串
            return bytesToHex(digest);
        } catch (NoSuchAlgorithmException e) {
            // 理论上不会发生，MD5算法在Java中是内置的
            throw new RuntimeException("MD5 algorithm not found", e);
        }
    }

    /**
     * 将字节数组转换为16进制字符串
     * @param bytes 输入字节数组
     * @return 16进制字符串
     */
    private static String bytesToHex(byte[] bytes) {
        // 16进制字符数组
        char[] hexDigits = "0123456789abcdef".toCharArray();
        // 每个字节对应两个16进制字符
        char[] result = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int b = bytes[i] & 0xFF; // 取低8位
            result[i * 2] = hexDigits[b >>> 4];      // 高4位
            result[i * 2 + 1] = hexDigits[b & 0x0F]; // 低4位
        }
        return new String(result);
    }
}
