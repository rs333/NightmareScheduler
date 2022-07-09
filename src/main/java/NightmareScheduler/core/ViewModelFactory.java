package NightmareScheduler.core;

import NightmareScheduler.viewmodels.ExampleViewModel;

public class ViewModelFactory {
  private ExampleViewModel exampleViewModel;
  
  public ViewModelFactory(ModelFactory mf){
    exampleViewModel = new ExampleViewModel(mf.getExampleDataModel());
  }

  public ExampleViewModel getExampleViewModel(){
    return exampleViewModel;
  }
}
