package NightmareScheduler.models;

public class ExampleDataModel implements ExampleDataInterface {

  String TRUE_STRING = new String("TRUE");
  String FALSE_STRING = new String("FALSE");

  String label = new String("Start Value");
  Boolean truth = false;

  @Override
  public String getLabel() {
    return label;
  }

  @Override
  public boolean getTruth() {
    return truth;
  }

  @Override
  public void toggleTruth() {
    truth = !truth;
    if (truth) {
      label = TRUE_STRING;
    } else {
      label = FALSE_STRING;
    }
  }

}
