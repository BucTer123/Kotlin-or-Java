import javafx.Application.application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class classmainuiwidget as Application {

    @Override 

    public void main(Stage stage) {
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
            <button id="start" type="button">Go</button>
        </body>
        <script>
        const btn = document.getElementById("start");
        btn.addEventListener("click", function () {
            function showTime() {
                const now = new Date();
                const hours = now.getHours().toString().padStart(2, '0');
                const minutes = now.getMinutes().toString().padStart(2, '0');
                const seconds = now.getSeconds().toString().padStart(2, '0');

                const timeString = `${hours}:${minutes}:${seconds}`;
                window.alert(timeString);
            }
            setInterval(showTime, 1000);
        });
        </script>
        </html>
        """

        WebView w1 = new WebView();
        WebEngine e1 = w1.WebEngine();

        e1.loadContent(html)

        stage.setScene(new Scene(w1, 800, 600));
        stage.setTitle("UI");
        stage.show();
    }

    public void funcstartuiwidget(String[] args) {
        launch();
    }
}