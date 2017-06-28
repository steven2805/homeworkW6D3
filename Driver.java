public class Driver {
  String name;
  private Driveable drive;

  public Driver(String name, Driveable drive){
    this.name = name;
    this.drive = drive;
  }

  public String getName(){
    return this.name;
  }

  public void setDriving(){
    this.drive = drive;
  }

  public Driveable getDriving(){
    return this.drive;
  }

  public int speed(){
    return this.drive.speed();
  }
}