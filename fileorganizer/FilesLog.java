
import java.io.*;

public class FilesLog {
    public static void logOrganizedFiles(File folder) {
        File logFile = new File(folder, "organizer_log.txt");
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFile))) {
            writeLogForFolder(new File(folder, "Documents"), writer);
            writeLogForFolder(new File(folder, "Images"), writer);
            writeLogForFolder(new File(folder, "Others"), writer);
            System.out.println("Log file created: " + logFile.getPath());
        } catch (IOException e) {
            System.out.println("Error writing log file.");
            e.printStackTrace();
        }
    }

    private static void writeLogForFolder(File folder, PrintWriter writer) {
        writer.println("Folder: " + folder.getName());
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                writer.println("  " + file.getName());
            }
        }
    }
}
