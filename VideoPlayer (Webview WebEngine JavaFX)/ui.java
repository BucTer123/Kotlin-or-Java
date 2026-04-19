import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;

public class classnameaudio {

    @Override
    public static void funcnameaudiotwo(Stage stage) {
        String html="""
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8" >
            <title>UI</title>
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
        </style>
        <body>
            <input id="inp" type="file" />
            <br><br>

            <video id="vid" accept="video/*" ></video>
        </body>
        <script>
            const a = document.getElementById("inp");
            const pl = document.getElementById("vid");

            const file = this.files[0];
            a.addEventListener("change", function () {
                if (file) {
                    const url = URL.createObjectURL(file);
                    pl.src = url;
                    pl.play();
                }
            });
        </script>
        </html>
        """

        WebView w1 = new WebView();
        WebEngine e1 = w1.getEngine();

        e1.loadContent(html);

        stage.Scene(new Scene(640, 480))
        stage.Title("UI");
        stage.show();
    }

    public static void funcnameaudio(String[] args) {
        launch();
    }
}