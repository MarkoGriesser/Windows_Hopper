//import java.net.URL;
//
//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
//
//public class BACKGROUND extends Application {
//    @Override
//    public void start(Stage primaryStage) {
//        try {
//
//            //BorderPane()
//            //https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/BorderPane.html
//            BorderPane borderPane = new BorderPane();
//
//
//            //Button(String text)
//            //https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Button.html
//            Button btn = new Button("Center");
//
//            //https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/BorderPane.html#setCenter-javafx.scene.Node-
//            borderPane.setCenter(btn);
//
//
//            Scene scene = new Scene(borderPane, 600, 600);
//
//            URL path = getClass().getResource("resources/BackgroundStyle.css");
//
//            if(path != null) {
//                scene.getStylesheets().add(path.toExternalForm());
//            } else {
//                scene.getStylesheets().add("https://raw.githubusercontent.com/4nds/CenteredBackgroundImage/master/Background/src/application/resources/BackgroundStyleExternalURL.css");
//            }
//
//            borderPane.setId("background_id");
//
//            primaryStage.setScene(scene);
//            primaryStage.show();
//
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}