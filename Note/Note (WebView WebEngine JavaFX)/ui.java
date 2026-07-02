import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;

public class classmain {
	public static void funcsecondmain() {
		
		@Override 
		String html="""
		<!DOCTYPE html>
		<html lang="en">
		<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Note</title>
	</head>
	<style>
		body {
			background: ghostwhite;
			color: black;
			font-family: sans-serif;
			font-size: medium;
			font-style: initial;
			font-weight: bolder;
			padding: 0;
			margin: 0;
			max-width: 1080px;
			width: 100%;
			max-height: 1920px;
			height: 100%;
			display: flex;
		}

		textarea {
			background: black;
			color: whitesmoke;
			padding: 10px;
			margin: 5px;
			border: 1px solid salmon;
		}

		textarea:focus {
			background: whitesmoke;
			color: black;
			border: 1px solid sandybrown;
		}

		br {
			color: white;
			padding: 2px;
			margin: 1px;
		}

		input {
			background: black;
			color: whitesmoke;
			padding: 12px;
			margin: 6px;
			border: 1px solid lightblue;
		}

		input:focus {
			background: whitesmoke;
			color: black;
			border: 1px solid lightcyan;
		}

		button {
			background: black;
			color: whitesmoke;
			padding: 14px;
			margin: 7px;
			border: 1px solid lightblue;
			opacity: 1;
		}

		button:focus {
			background: whitesmoke;
			color: black;
			border: 1px solid lightcyan;
			opacity: 0.7;
		}

		button:hover {
			opacity: 0.5;
			transform: translateY(4px);
		}

		button:active {
			opacity: 0.3;
			transform: translateX(2px);
		}
	</style>
	<body>
		<textarea id="note">:</textarea>
		<br><br>

		<input id="sv" type="file" placeholder="Save" />
		<button id="leave" type="button">Leave</button>
	</body>
	<script>
		const lines = document.getElementById("note");
		const save = document.getElementById("sv");
		const lv = document.getElementById("leave");

		const file = this.files[0];
		if (lines === "exit..") {
			sv.addEventListener("change", function () {
				if (file) {
					const url = URL.createObjectURL(file);
					open(url);
				}
			})
		}
		lv.addEventListener("click", function () {
			window.alert("Bye!");
			exit(0);
		})
	</script>
	</html>
	""";
	
	WebView w1 = new webView();
	WebEngine e1 = w1.getEngine();
	
	e1.loadContent(html):
	}
	
	public static void funcmain() {
		launch();
	}
}