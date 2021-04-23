package day_24_testNG;

import org.testng.annotations.Test;

public class Demo_Test_02 {
  @Test
  public void create()
  {
	  System.out.println("Create");
  }
  
  @Test
  public void edit()
  {
	  System.out.println("Edit");
  }
  
  @Test
  public void modify()
  {
	  System.out.println("Modify");
  }
  
  @Test(dependsOnMethods="edit")
  public void delete()
  {
	  System.out.println("Delete");
  }
}
