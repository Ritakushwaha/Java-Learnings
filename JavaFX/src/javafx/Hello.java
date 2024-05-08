package javafx;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Hello extends Application{
    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Click me");
        Button exit = new Button("Exit");
        exit.setOnAction(e -> {
            System.out.println("Exit This App");
            System.exit(0);
         });
        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                  System.out.println("Hello world");
            }
        });
        
        VBox root = new VBox();
        root.getChildren().addAll(btn,exit);
        Scene scene = new Scene(root,500,300);
        primaryStage.setTitle("My Title ");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

}
