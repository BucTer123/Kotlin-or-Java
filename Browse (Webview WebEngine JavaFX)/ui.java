import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class secondmainclassname {

    @Override
    public static void notmain(Stage stage) {
        String html= """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8" >
            <title>UI!</title>
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
            <div class="popo">
                <input id="srch_inp" type="text" placeholder="Search ..." />
                <button id="srch_btn" type="button" >Search</button>
            </div>
        </body>
        <script>
            const inp = document.getElementById("srch_inp").value;
            const btn = document.getElementById("srch_btn").value;

            btn.addEventListener("click", function () {
                if (inp === "") {
                    window.alert("ERROR!: Write domain to search!");
                } else {
                    window.open(inp, "_blank");
                }
            });
        </script>
        </html>
        """;

        WebView wb1 = new WebView();
        WebEngine wb2 = wb1.WebEngine();

        wb2.loadContent(html);

        stage.setScene(new Scene(win1, 800, 600));
        stage.setTitle("App");
        stage.show();
    }

    public static void secondnotmain(String[] args) {
        launch();
    }
}