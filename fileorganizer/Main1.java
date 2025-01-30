
import java.io.*;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the folder path to organize:");
        String folderPath = scanner.nextLine();

        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path.");
            return;
        }

        FileOrganizer.arrangeFiles(folder);
        FilesLog.logOrganizedFiles(folder);

        System.out.println("Do you want to remove duplicate files? (yes/no):");
        String deleteDuplicates = scanner.nextLine();
        if (deleteDuplicates.equalsIgnoreCase("yes")) {
            DuplicateFile.removeDuplicateFiles(folder);
        }
        System.out.println("Operation completed successfully.");
    }
}
