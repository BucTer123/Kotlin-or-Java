import javafx.*;
import java.*;

public class button extends Application {

    public static void create_directory() {
        Scene win4 = new Scene("Create Directory", 640, 480);

        TextField inp = new TextField();
        inp.setLayoutX(320);
        inp.setLayoutY(240);
        
        Button btn5 = new Button("Submit");
        btn5.setLayoutX(320);
        btn5.setLayoutY(250);
        
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

        btn5.setOnAction(ev4);

        win4.show();
    }

    public static void remove_directory() {
        Scene win5 = new Scene("Remove Directory", 640, 480);

        TextField inp2 = new TextField();
        inp2.setLayoutX(320);
        inp2.setLayoutY(240);
        
        Button btn6 = new Button("Submit");
        btn6.setLayoutX(320);
        btn6.setLayoutY(250);

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

        btn6.setOnAction(ev5);

        win5.show();
    }

    public static void Info_window() {
        Scene win6 = new Scene("Info Window", 800, 600);

        StackPane r6 = new StackPane();
        
        Button button_information1 = new Button("This app is created by SHALAWA");
        button_information1.setLayoutX(400);
        button_information1.setLayoutY(10);

        r5.getChildren().add(button_information1);

        EventHandler<ActionEfvent> evinf = new EventHandler<ActionEvent>() {
            public static void hdnle1000() {
                System.out.println("This app is created by SHLAWA!\n");
                System.out.println("** Bye! **");
                exit(0);
            }
        };

        button_information1.setOnAction(evinf);
        
        win6.show();
    }

    public static void command_window() {
        Scene win67 = new Scene("Command Window", 640, 480);
        
        TextField inp67 = new TextField();
        inp67.setLayoutX(320);
        inp67.setLayoutY(10);

        Button btn672 = new Button("Submit");
        btn672.setLayoutX(320);
        btn672.setLayoutY(20);

        EventHandler<ActionEvent> ev672 = new EventHandler<ActionEvent>() {
            public static void fuckingblyat_handler() {
                String text = inp67.text();
                Runtime.getRuntime().exec(text);
            }
        };

        btn672.setOnAction(ev672);
        
        win67.show();
    }

    public static void new_window_create() {
        Scene win3 = new Scene("New Window", 800, 600);

        Button btn2 = new Button("Create Directory");
        btn2.setLayoutX(400);
        btn2.setLayout(10);

        StackPane r2 = new StackPane();
        r2.getChildren().add(btn2);

        Button btn3 = new Button("Remove Directory");
        r2.getChildren().add(btn3);
        btn3.setLayoutX(400);
        btn3.setLayoutY(20);

        Button btn67 = new Button("Command Window");
        r2.getChildren().add(btn67);
        btn67.setLayoutX(400);
        btn67.setLayoutY(30);

        Button btn6 = new Button("Info");
        r2.getChilder().add(btn6);
        btn6.LaoyoutX(400);
        btn6.LayoutY(40);
        
        Button btn4 = new Button("Exit");
        r2.getChildren().add(btn4);
        btn4.setLayoutX(400);
        btn4.setLayoutY(50);
        
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

        EventHandler<ActionEvent> ev4 = new EventHandler<ActionEvent>() {
            public static void hdnle5() {
                Info_window();
            }
        };

        EventHandler<ActionEvent> ev671 = new EventHandler<ActionEvent>() {
            public static void handle671() {
                command_window();
            }
        };

        btn2.setOnAction(ev1);
        btn3.setOnAction(ev2);
        btn4.setOnAction(ev3);
        btn6.setOnAction(ev4);

        win3.show();
    }

    public static void start(Stage s) {
        s.setTitle("BUTTON WINDOW!");

        Button btn = new Button("Start!");
        btn.setLayoutX(100);
        btn.setLayoutY(100);

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
