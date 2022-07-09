package NightmareScheduler.core;

import NightmareScheduler.models.ExampleDataInterface;
import NightmareScheduler.models.ExampleDataModel;
import NightmareScheduler.models.ScheduleDataInterface;
import NightmareScheduler.models.ScheduleDataModel;

public class ModelFactory {
  private ScheduleDataInterface scheduleData;
  private ExampleDataInterface exampleData;

  public ScheduleDataInterface getScheduleDataModel() {
    if( scheduleData == null ){
      scheduleData = new ScheduleDataModel();
    }
    return scheduleData;
  }

  public ExampleDataInterface getExampleDataModel() {
    if( exampleData == null ){
      exampleData = new ExampleDataModel();
    }
    return exampleData;
  }
}
