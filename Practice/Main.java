import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Deserialization ds = new Deserialization("data.txt");
        for (String p : ds.readFile()){
            System.out.println(p);
        }
        List<Program> programs = ds.programs();

//        List<String> lines = ReadFile.readFile("data.txt");
//        for (String line : lines){
//            System.out.println(line);
//        }
    }


//    public class ReadFile {
//
//        public static List<String> readFile(String filePath) throws Exception {
//            List<String> lines = new ArrayList<>();
//
//            try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
//                String line;
//                while ((line = br.readLine()) != null) {
//                    if (!line.contains("#")) {
//                        lines.add(line);
//                    } else {
//                        lines.add(line.replace("#", ""));
//                    }
//                }
//            }
//
//            return lines;
//        }
//
//    }

}

