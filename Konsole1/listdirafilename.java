import java.io.IOException;

public class listdirafileclassname {
    public static void listdirafilefuncname() throws IOException {
        try {
            Runtime.getRuntime().exec("dir");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}