package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        ArrayList<Commune> listeCommunes = new ArrayList<>();
        Path path = Paths.get("C:/Users/Travail/Downloads/recensement.csv");
        Path file = Paths.get("C:/Users/Travail/Downloads/Recensement_plus_25000_habitants.txt");
        List<String> recensement = Files.readAllLines(path);

        // Si le fichier existe déja, on le supprime et on le crée à nouveau
        if (Files.exists(file)) {
            Files.delete(file);
            Files.createFile(file);
        } else { // Sinon, on le crée simplement
            Files.createFile(file);
        }

        // Ajout de la premiere ligne
        String[] info = recensement.get(0).split(";");
        String header = info[6] + "; " + info[2] + "; " + info[1] + "; " + info[9].replace(" ", "") + ";\n";
        Files.write(file, header.getBytes(), StandardOpenOption.APPEND);

        // Ajout des infos selectionné pour les villes de plus de 25000 habitants
        for (int i = 1; i < recensement.size(); i++) {
            info = recensement.get(i).split(";");
            if (Integer.parseInt(info[9].replace(" ", "")) > 25000) {
                String infoUtiles = info[6] + "; " + info[2] + "; " + info[1] + ";" + info[9].replace(" ", "") + ";\n";
                Files.write(file, infoUtiles.getBytes(), StandardOpenOption.APPEND);
            }
        }
    }
}
