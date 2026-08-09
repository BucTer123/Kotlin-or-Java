import java.io.File;
import java.io.IOException;

public class jw_sys throws IOExpection {
	public static void create_directory(String name_directory_create) { File dir = new File(name_directory_create); }
	public static void remove_directory(String name_directory_remove) { Files.delete(name_directory_remove); }
	public static void ext(int status) { exit(status); }
	public static void ret(boolean boolean_return) { return boolean_return; }
}
