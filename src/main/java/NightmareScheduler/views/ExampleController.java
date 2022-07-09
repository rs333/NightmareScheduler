package NightmareScheduler.views;

import NightmareScheduler.viewmodels.ExampleViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
 
public class ExampleController {
 
  @FXML
  private Label label;

  @FXML
  private TextField labelTextField;

  ExampleViewModel viewModel;
 
  public void init(ExampleViewModel viewModel){
    this.viewModel = viewModel;    
    label.textProperty().bind(viewModel.updateLabelProperty());  
    labelTextField.textProperty().bindBidirectional(viewModel.updateLabelProperty());  
  }

  public void toggleText() {
    viewModel.toggleText();        
  }
 
}