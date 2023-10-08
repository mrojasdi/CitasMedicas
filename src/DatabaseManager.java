import java.io.File;
import java.io.IOException;

public class DatabaseManager {
    private static final String DB_FOLDER = "db";

    public DatabaseManager() {
        // Crea la carpeta 'db' si no existe
        File folder = new File(DB_FOLDER);
        if (!folder.exists()) {
            folder.mkdir();
        }
    }

    public void saveDataToFile(String fileName, String data) {
        // Guarda datos en un archivo en la carpeta 'db'
        try {
            File file = new File(DB_FOLDER + File.separator + fileName);
            java.nio.file.Files.write(file.toPath(), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readDataFromFile(String fileName) {
        // Lee datos de un archivo en la carpeta 'db'
        try {
            File file = new File(DB_FOLDER + File.separator + fileName);
            if (file.exists()) {
                byte[] data = java.nio.file.Files.readAllBytes(file.toPath());
                return new String(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class db {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
