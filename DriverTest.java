import static org.junit.Assert.*;
import org.junit.*;

public class DriverTest {
  Driver driver;


  @Before 
  public void before(){
    driver = new Driver("bob");
  }

  @Test 
  public void hasName(){
    assertEquals("bob",driver.getName());
  }
}