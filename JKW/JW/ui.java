import javafx.application.Application;
import javafx.scene.Scene;

public static void jw_ui { 
	public static void Application(int screen_width, int screen_height, String name_window) {
		Scene window_root = new Scene(screen_width, screen_height, name_window);
		window_root.show();
	}
	public static void Button(int location_button1, int location_button2, String name_button) {
		Button button = new Button(name_button);
		button.LayoutX(location_button1);
		button.LayoutY(location_button2);
		button.show();
	}
	public static void Label(int location_label1, int location_label2, String name_label) {
		Label label = new Label(name_label);
		label.LayoutX(location_label1);
		label.LayoutY(location_label2);
	}
	public static void Destroy_Window(boolean boolean_destroywindow) {
		if (boolean_destroywindow == true) {
			exit(0);
		} 
	}
	public static void Input(int location_input1, int localtion_input2, String placeholder) {
		TextField input = new TextField(placeholder);
		input.setLayoutX(location_input1);
		input.setLayoutY(location_input2);
	}
}
