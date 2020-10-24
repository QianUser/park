package com.park.cloud.common.util;

import org.apache.commons.io.FilenameUtils;
import org.apache.http.Consts;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;

/**
 * 文件通用组件
 *
 * @author Yingjie_Li
 * @date 2015/5/20
 */
public class ApiFileUtil {
    private static final int retryTimes = 10;
    private static final Charset DEFAULT_FILE_ENCODE = Consts.UTF_8;

    /**
     * 创建文件夹
     *
     * @param folderName
     * @return
     */
    public static boolean mkdirs(String folderName) {
        try {
            File file = new File(folderName);
            if (file.exists()) {
                return true;
            }
            return file.mkdirs();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 生成文件。已有文件会覆盖
     *
     * @param fullName
     * @param inputStream
     * @return 文件size
     * @throws Exception
     */
    public static long save(String fullName, InputStream inputStream) throws Exception {
        File file = new File(fullName);
        return save(file, inputStream);
    }

    /**
     * 生成文件。已有文件会覆盖
     *
     * @param file
     * @param inputStream
     * @return 文件size
     * @throws Exception
     */
    public static long save(File file, InputStream inputStream) throws Exception {
        if (file.isFile() && file.exists()) {
            file.delete();
        }

        OutputStream outputStream = null;
        long size = 0;
        try {
            outputStream = new FileOutputStream(file);
            int length;
            byte[] buff = new byte[1024];
            while (-1 != (length = inputStream.read(buff))) {
                outputStream.write(buff, 0, length);
                size += length;
            }
            outputStream.flush();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }

        return size;
    }

    /**
     * 生成文件。已有文件会覆盖
     *
     * @param fullName
     * @param inputString
     * @return 文件size
     * @throws Exception
     */
    public static long save(String fullName, String inputString) throws Exception {
        File file = new File(fullName);
        if (file.isFile() && file.exists()) {
            file.delete();
        }

        OutputStream outputStream = null;
        long size = 0;
        try {
            outputStream = new FileOutputStream(file);
            byte[] buff = inputString.getBytes(DEFAULT_FILE_ENCODE);
            size = buff.length;
            outputStream.write(buff);
            outputStream.flush();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }

        return size;
    }

    /**
     * 随机生成子文件夹
     *
     * @param baseDir
     * @param subSize
     * @return
     */
    public static String createFolder(String baseDir, int subSize) {
        return createFolder(baseDir, subSize, 2);
    }

    /**
     * 随机生成子文件夹
     *
     * @param baseDir
     * @param subSize
     * @param folderNameLength
     * @return
     */
    public static String createFolder(String baseDir, int subSize, int folderNameLength) {
        for (int i = 0; i < retryTimes; i++) {
            String dir = createFolderName(baseDir, subSize, folderNameLength);
            if (mkdirs(dir)) {
                return dir;
            }
        }
        return null;
    }

    /**
     * 随机生成子文件夹名字
     *
     * @param baseDir
     * @param subSize
     * @param folderNameLength
     * @return
     */
    private static String createFolderName(String baseDir, int subSize, int folderNameLength) {
        StringBuffer dir = new StringBuffer();
        dir.append(baseDir);
        for (int i = 0; i < subSize; i++) {
            String subDir = ApiStringUtil.getRandomString(folderNameLength);
            dir.append("/");
            dir.append(subDir);
        }
        return dir.toString();
    }

    public static String createFolderByString(String baseDir, String baseString, int subSize) {
        return createFolderByString(baseDir, baseString, subSize, 2);
    }

    public static String createFolderByString(String baseDir, String baseString, int subSize, int folderNameLength) {
        for (int i = 0; i < baseString.length() - folderNameLength; i++) {
            String dir = createFolderNameByString(baseDir, baseString, subSize, folderNameLength, i);
            if (mkdirs(dir)) {
                return dir;
            }
        }
        return null;
    }

    private static String createFolderNameByString(String baseDir, String baseString, int subSize, int folderNameLength, int start) {
        StringBuffer dir = new StringBuffer();
        dir.append(baseDir);
        int end = start + folderNameLength;
        for (int i = 0; i < subSize; i++) {
            if (end > baseString.length()) {
                start = 0;
                end = start + folderNameLength;
            }
            String subDir = baseString.substring(start, end);
            dir.append("/");
            dir.append(subDir);
            start = start + folderNameLength;
            end = start + folderNameLength;
        }
        return dir.toString();
    }

    /**
     * 文件复制
     *
     * @param from
     * @param to
     */
    public static void copyFile(File from, File to) {
        copyFile(from.getAbsolutePath(), to.getAbsolutePath());
    }

    /**
     * 文件复制
     *
     * @param from
     * @param to
     */
    public static void copyFile(String from, String to) {
        try {
            Files.copy(Paths.get(from), Paths.get(to), LinkOption.NOFOLLOW_LINKS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除文件（如果是文件夹，会删除文件夹下的所有文件）
     *
     * @param file
     */
    public static void deleteFile(String file) {
        deleteFile(new File(file));
    }

    /**
     * 删除文件（如果是文件夹，会删除文件夹下的所有文件）
     *
     * @param file
     */
    public static void deleteFile(File file) {
        if (!file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] subFiles = file.listFiles();
        if (subFiles != null && subFiles.length > 0) {
            for (File sub : subFiles) {
                deleteFile(sub);
            }
        }
        file.delete();
    }

    /**
     * 生成文件名
     *
     * @param fileFullName
     * @return
     */
    public static String createUploadFileName(String fileFullName) {
        return createUploadFileName(fileFullName, null);
    }

    /**
     * 生成文件名
     *
     * @param fileFullName 上传的文件名
     * @param extension    默认扩展名
     * @return
     */
    public static String createUploadFileName(String fileFullName, String extension) {
        String fileName = FilenameUtils.getBaseName(fileFullName);
        String suffix = FilenameUtils.getExtension(fileFullName);
        StringBuffer sb = new StringBuffer();
        sb.append(fileName);
        sb.append("(");
        sb.append(System.currentTimeMillis());
        sb.append(RandomUtil.nextInt(100));
        sb.append(")");
        String s = MD5.MD5(sb.toString());
        sb = new StringBuffer(s);

        if (!StringUtils.isEmpty(suffix)) {
            sb.append(".");
            sb.append(suffix);
        } else {
            if (!StringUtils.isEmpty(extension)) {
                sb.append(".");
                sb.append(extension);
            }
        }
        return sb.toString();
    }

    /**
     * 创建文件
     *
     * @param folder
     * @param fileFullName
     * @return
     */
    public static File createUploadFile(String folder, String fileFullName) {
        return createUploadFile(folder, fileFullName, null);
    }

    /**
     * 创建文件
     *
     * @param folder
     * @param fileFullName
     * @return
     */
    public static File createUploadFile(String folder, String fileFullName, String extension) {
        File file = new File(folder + "/" + createUploadFileName(fileFullName, extension));
        if (file.exists()) {
            return createUploadFile(folder, fileFullName, extension);
        }
        return file;
    }

}
