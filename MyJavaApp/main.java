import javafx.*;
import java.*;

public class button extends Application {

    public static void create_directory() {
        Scene win4 = new Scene("Create Directory", 640, 480);

        TextField inp = new TextField();
        Button btn5 = new Button("Submit");

        StackPane r3 = new StackPane();
        r3.getChildren().add(inp);
        r3.getChildren().add(btn5);

        EventHandler<ActionEvent> ev4 = new EventHandler<ActionEvent>() {
            public static void handle5() throws IOEXception {
                String c = inp.getText();

                File index = new File(c);
                index.mkdir();
            }
        };

        win4.show();
    }

    public static void remove_directory() {
        Scene win5 = new Scene("Remove Directory", 640, 480);

        TextField inp2 = new TextField();
        Button btn6 = new Button("Submit");

        StackPane r4 = new StackPane();
        r5.getChildren().add(inp2);
        r5.getChildren().add(btn6);

        EventHandler<ActionEvent> ev5 = new EventHandler<ActionEvent>() {
            public static void handle6() {
                String c2 = inp2.getText();
                File index2 = new File()

                index2.delete();
            }
        }

        win5.show();
    }

    public static void new_window_create() {
        Scene win3 = new Scene("New Window", 800, 600);

        Button btn2 = new Button("Create Directory");

        StackPane r2 = new StackPane();
        r2.getChildren().add(btn2)

        Button btn3 = new Button("Remove Directory");
        r2.getChildren().add(btn3)

        Button btn4 = new Button("Exit");

        EventHandler<ActionEvent> ev1 = new EventHandler<ActionEvent>() {
            public static void handle2(ActionEvent e) {
                create_directory();
            }
        };

        EventHandler<ActionEvent> ev2 = new EventHandler<ActionEvent>() {
            public static void handle3(ActionEvent e) {
                remove_directory();
            }
        };

        EventHandler<ActionEvent> ev3 = new EventHandler<ActionEvent>() {
            public static void handle4(ActionEvent e) {
                exit(0);
            }
        };

        btn2.setOnAction(ev1);
        btn3.setOnAction(ev2);
        btn4.setOnAction(ev3);

        win3.show();
    }

    public static void start(Stage s) {
        s.setTitle("BUTTON WINDOW!");

        Button btn = new Button("Start!");

        StackPane r = new StackPane();
        r.getChildren().add(btn)

        Scene sc2 = new Scene(r, 200, 200);

        s.setScene(sc);

        s.show();

        EventHandler<ActionEvent> ev = new EventHandler<ActionEvent>() {
            public static void handle(ActionEvent e) {
                new_window_create();
            }
        };

        btn.setOnAction(ev);
    }

    public static void main(String args[]) {
        lanuch(args);
    }
}