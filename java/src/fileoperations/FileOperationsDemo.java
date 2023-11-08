package fileoperations;

public class FileOperationsDemo {

    public static void main(String[] args) {
        String path = "sample.txt";
        String content = "Hello world!";
        writeToFile(path, content);
        String readContent = readFromFile(path);
        assert readContent.equals(content);
    }

    /**
     * Write content to file.
     *
     * @param path path to file
     * @param content content to write
     */
    public static void writeToFile(String path, String content) {

        try {
            java.io.FileWriter fileWriter = new java.io.FileWriter(path);
            fileWriter.write(content);
            fileWriter.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Read content from file.
     *
     * @param path path to file
     * @return content of file
     */
    public static String readFromFile(String path) {

        StringBuilder content = new StringBuilder();

        try {
            java.io.FileReader fileReader = new java.io.FileReader(path);
            int character;
            while ((character = fileReader.read()) != -1) {
                content.append((char) character);
            }
            fileReader.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        return content.toString();

    }
}
