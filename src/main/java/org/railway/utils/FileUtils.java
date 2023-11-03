package org.railway.utils;

import java.io.File;
import java.util.Objects;

public class FileUtils {

    public static boolean doesFileNameExist(String fileName) {
        String directory = Constant.DOWNLOAD_PATH;
        File folder = new File(Objects.requireNonNull(directory));
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().equals(fileName)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void deleteFileByName(String fileName) {
        String directory = Constant.DOWNLOAD_PATH;
        File folder = new File(Objects.requireNonNull(directory));
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().equals(fileName)) {
                    if (!file.delete()) {
                        System.err.println("Failed to delete file: " + fileName);
                    }
                }
            }
        }
    }
}
