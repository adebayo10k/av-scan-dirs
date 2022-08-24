package main;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    private static final String INPUT_DATA = "https://damola-app-data.s3.eu-west-2.amazonaws.com/dir-data.json";

    public static void main(String[] args) throws IOException {

        InputStream stream = null;
        Path outputFile;

        try {
            URL url = new URL(INPUT_DATA);
            stream = url.openStream();
            outputFile = Paths.get("files", "output.json");
            Files.copy(stream, outputFile, StandardCopyOption.REPLACE_EXISTING);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    } // end main method
} // end class