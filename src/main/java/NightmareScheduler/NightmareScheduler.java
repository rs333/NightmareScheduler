package NightmareScheduler;

import NightmareScheduler.core.ModelFactory;
import NightmareScheduler.core.ViewHandler;
import NightmareScheduler.core.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class NightmareScheduler extends Application {
  @Override
  public void start(Stage stage) throws Exception {
    ModelFactory modelFactory = new ModelFactory();
    ViewModelFactory viewModelFactory = new ViewModelFactory(modelFactory);    
    ViewHandler viewHandler = new ViewHandler(stage, viewModelFactory);

    viewHandler.open();
  }

}
