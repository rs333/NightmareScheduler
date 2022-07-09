package NightmareScheduler.viewmodels;

import NightmareScheduler.models.ExampleDataInterface;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class ExampleViewModel {

  ExampleDataInterface data;
  StringProperty labelProperty;


  public ExampleViewModel(ExampleDataInterface data){
    this.data = data;
    labelProperty = new SimpleStringProperty();
    labelProperty.set(data.getLabel());    
  }

  public Property<String> updateLabelProperty() {    
    return labelProperty;
  }

  public void toggleText(){
    data.toggleTruth();
    labelProperty.set(data.getLabel());
  }

   
}
