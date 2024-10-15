package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/Travail/Downloads/recensement.csv");
        List<String> fichierOrigine = Files.readAllLines(path);
        List<String> fichier1A100 = new ArrayList<>();

        int index = 0;
        for (String ligne : fichierOrigine) {
            if (index < 100) {
                fichier1A100.add(fichierOrigine.get(index));
                index++;
            }
        }

        int i = 1;
        for (String ligne : fichier1A100) {
            System.out.println("Ligne " + i + ": " + ligne);
            i++;
        }
    }
}
