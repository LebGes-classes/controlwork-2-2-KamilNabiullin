import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Deserialization {
    private String filePath;
    List<Program> programs = new ArrayList<>();


    public Deserialization(String filepath) {
        this.filePath = filepath;
    }

    public List<String> readFile() throws Exception {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.contains("#")) {
                    lines.add(line);
                } else {
                    lines.add(line.replace("#", ""));
                }
            }
        }

        return lines;
    }

    public List<Program> programs() throws Exception {

         readFile().stream()
                .map(line -> line.split(""))
                .map(parts -> new Program(parts[0], parts[1], new BroadcastsTime(parts[2])))
                .forEach(programs::add);
         return programs;
    }





}