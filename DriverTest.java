import static org.junit.Assert.*;
import org.junit.*;

public class DriverTest {
  Driver driver;
  Quadbike quad;


  @Before 
  public void before(){
    quad = new Quadbike();
    driver = new Driver("bob", quad);
  }

  @Test 
  public void hasName(){
    assertEquals("bob",driver.getName());
  }

  @Test 
  public void canUseQuad(){
    assertEquals(10, driver.speed());

    }


  



}