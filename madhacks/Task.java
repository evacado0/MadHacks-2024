

public class Task {
  private String name;
  private static int coinValue;
  private boolean isMine;
  private boolean isComplete;
  private Profile person;
  private boolean isPublic;

  public Task(String name, boolean isMine, boolean isPublic)
  {
    this.name = name;
    this.isMine = isMine;
    coinValue = 10;
    isComplete = false;
    this.isPublic = isPublic;
    
  }

  public static int getCoins()
  {
    return coinValue;
  }

  private void setCoinValue()
  {
    if (!isMine)
    {
      coinValue = coinValue * 2;
    }
  }
  
  public void completeTask()
  {
    isComplete = true;
    person.addCoins(coinValue);
  }

  public String toString()
  {
    return name + ": " + coinValue  + "coins";
  }

}