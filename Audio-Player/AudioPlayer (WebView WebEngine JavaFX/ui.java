import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;

public class classuimain {
    public static void uifunction(Stage stage) {

        @Override
        String html=""" 
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8" >
            <title>UI</title>
        </head>
        <style>
        
        </style>
        <body>
            <input id="b" type="file" />
            <br><br>

            <audio id="aud" accept="audio/*" ></audio>
        </body>
        <script>
            const b = document.getElementById("b");
            const pl = document.getElementById("aud");

            const file = this.files[0];
            b.addEventListener("change", function () {
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

        stage.Scene(new Scene(640, 480));
        stage.Title("UI");
        stage.show();
    }

    public static functionlaunch() {
        launch();
    }
}