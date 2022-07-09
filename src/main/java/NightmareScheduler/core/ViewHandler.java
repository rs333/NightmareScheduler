package NightmareScheduler.core;

import java.io.IOException;

import NightmareScheduler.views.ExampleController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewHandler {
  ViewModelFactory viewModelFactory;
  Stage stage;

  public ViewHandler(Stage stage, ViewModelFactory viewModelFactory){
    this.stage = stage;
    this.viewModelFactory = viewModelFactory;
  }

  public void open() throws IOException {    
    //flyweight
    FXMLLoader loader = new FXMLLoader();

    loader.setLocation(getClass().getResource( "/NightmareScheduler/views/Example.fxml"));
    System.out.println(loader.getLocation().toString());
    Parent root = loader.load();
    
    ExampleController exampleView = loader.getController();
    exampleView.init( viewModelFactory.getExampleViewModel());

    Scene scene = new Scene(root, 640, 480);
    stage.setScene(scene);
    stage.show();
  }
}
