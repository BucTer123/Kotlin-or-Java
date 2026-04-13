import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class guilaunchclassname extends Application {

    @Override

    public void start(Stage stage) {
        String html = """ 
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8" >
            <title>Welcome!</title>
        </head>
        <style>
            body {
                background: whitesmoke;
                color: black;
                font-family: sans-serif;
                font-size: medium;
                font-weight: bolder;
                font-style: initial;
                padding: 0;
                margin: 0;
            }
            .container-main {
                padding: 80px;
                margin: 60px;
                background: ghostwhite;
                color: black;
                border: 1px solid dimgray;
            }
            .container-main:focus {
                border: 1px solid black;
            }

            button {
                background: black;
                color: white;
                padding: 12px;
                margin: 6px;
                border: 1px solid dimgray;
                opacity: 1;
            }

            button:focus {
                border: 1px solid black;
                background: white;
                color: black;
            }

            button:hover {
                opacity: 0.7;
                transform: translateY(4px);
            }

            button:active {
                opacity: 0.3;
                transform: translateX(5px);
            }

            input {
                background: white;
                color: black;
                padding: 10px;
                margin: 5px;
                border: 1px solid dimgray;
            }

            input:focus {
                background: black;
                color: white;
                border: 1px solid black;
            }
        </style>
        <body>
            <div class="container-main">
                <input id="username" type="text" placeholder="Write username :" />
                <input id="password" type="password" placeholder="Write password :" />
                <button id="log" type="button" >Login</button>
            </div>
        </body>
        <script>
            const usr = document.getElementById("username");
            const psw = document.getElementById("password");
            const btn = document.getElementById("log");

            btn.addEventListener("click", function () {
                const a = usr.value;
                const b = psw.value;

                if (a === "" && b === "") {
                    window.alert("ERROR!: Write username and password!");
                } else {
                    window.open("mainhtml.html");
                }
            });
        </script>
        </html>
        """;

        Webview w1 = new WebView();
        WebEngine eng = w1.getEngine();

        engine.loadContent(html);

        stage.setScene(new Scene(w1, 800, 600));
        stage.setTitle("GUI");
        stage.show();
    }
    
    public static void guilaunchfuncname(String[] args) {
        launch();
    } 
}