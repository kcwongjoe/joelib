package com.kcwongjoe.joelib;

import java.io.File;

/**
 * A Utils for file
 */
public class JFileUtils {

    private static final String folderDelimiter = "/";

    /**
     * Create a folder in the path.
     * @param path Path
     * @param folderName Folder Name
     * @return Return a path which is <code>path + "/" + folderName + "/"</code>
     */
    public static String createFolder(String path, String folderName){

        // Generate path
        if (!path.endsWith(folderDelimiter)) path = path + folderDelimiter;
        path = path + folderName + folderDelimiter;

        // Check folder
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        return path;
    }
}
