package com.notonly.calendar.util;

import android.os.Environment;

import java.io.File;

/**
 * 路径工具类
 * Created by wangzhen on 2016/11/18.
 */

public class PathUtil {
    private static String APP_NAME = "NotOnlyCalendar";
    //图片路径
    private static String PATH_IMAGE = APP_NAME + "/images";
    //文件下载路径
    private static String PATH_DOWNLOAD = APP_NAME + "/download";

    /**
     * 获取图片存储路径
     *
     * @return
     */
    public static String getImagePath() {
        File path = new File(Environment.getExternalStorageDirectory() + File.separator + PATH_IMAGE);
        if (!path.exists()) {
            path.mkdirs();
        }
        return path.getAbsolutePath();
    }

    /**
     * 获取下载存储路径
     *
     * @return
     */
    public static String getDownloadPath() {
        File path = new File(Environment.getExternalStorageDirectory() + File.separator + PATH_DOWNLOAD);
        if (!path.exists()) {
            path.mkdirs();
        }
        return path.getAbsolutePath();
    }
}
