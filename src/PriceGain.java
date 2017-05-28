import java.awt.AWTException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class PriceGain
{

   public static void main(String[] args) throws InterruptedException, AWTException
   {
     WebDriver driver = new FirefoxDriver();

     driver.get("http://pghotelslocal.rg-products.com/pghui/(S(fmrkffgqmd5qjint2jo2soca))/rgLogin.aspx");

     driver.findElement(By.xpath("//*[@id='txtBidNo']")).sendKeys("322078");

     driver.findElement(By.xpath("//*[@id='txtUserId']")).sendKeys("488454");

     driver.findElement(By.xpath("//*[@id='txtPwd']")).sendKeys("PGH@1234");

     driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
     Thread.sleep(30000);

     Select drpDown = new Select(driver.findElement(By.xpath("//*[@id='ddlSubscription']")));
     List<WebElement> allOptions = drpDown.getOptions();
     drpDown.selectByIndex(allOptions.size()-1);

     Thread.sleep(4000);

     driver.findElement(By.xpath("//*[@id='dvDashboard']/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td/strong")).sendKeys(Keys.PAGE_UP);
     Thread.sleep(4000);
     /*Robot robot = new Robot();

     robot.keyPress(KeyEvent.VK_PAGE_UP);
*/
     WebElement main_menu = driver.findElement(By.cssSelector("span.qmritemcontent"));
     WebElement sub_menu = driver.findElement(By.xpath("//*[@id='qm0']/div[1]/a[2]"));

    Actions action = new Actions(driver);

     action.moveToElement(main_menu).build().perform();

   //  main_menu.click();
     Thread.sleep(2000);
     sub_menu.click();

     Thread.sleep(5000);




     driver.findElement(By.xpath("//*[@id='divPage']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[3]/table/tbody/tr/td[2]/img")).click();
     String actDate=driver.findElement(By.xpath("//*[@id='CalendarControl']/table/tbody/tr[1]/td[2]")).getText();
   //  String[] s = actDate.split("<br/>");



    WebElement datePicker;
     List<WebElement> noOfColumns;
     List<String> monthList = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
     // Expected Date, Month and Year
     int expMonth;
     int expYear;
     String expDate = null;
     // Calendar Month and Year
     String calMonth = null;
     String calYear = null;
     boolean dateNotFound;

     dateNotFound = true;

     expDate = "21";
     expMonth= 5;
     expYear = 2018;


     while(dateNotFound)
     {
      //Retrieve current selected month name from date picker popup.
      actDate = driver.findElement(By.xpath("//*[@id='CalendarControl']/table/tbody/tr[1]/td[2]")).getText();
      System.out.println(actDate);
     String[] s = actDate.split("\n");
      calMonth = s[0];
      System.out.println(calMonth);
      //Retrieve current selected year name from date picker popup.
      //calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
      calYear=s[1];
      System.out.println(calYear);
      //If current selected month and year are same as expected month and year then go Inside this condition.
      if(monthList.indexOf(calMonth)+1 == expMonth && (expYear == Integer.parseInt(calYear)))
      {
       //Call selectDate function with date to select and set dateNotFound flag to false.
         datePicker = driver.findElement(By.xpath("//*[@id='CalendarControl']/table"));
         noOfColumns=datePicker.findElements(By.tagName("td"));

         //Loop will rotate till expected date not found.
         for (WebElement cell: noOfColumns){
            System.out.println(cell.getText());
          //Select the date from date picker when condition match.
          if (cell.getText().equals(expDate)){
           cell.findElement(By.linkText(expDate)).click();
           break;
          }
         }
       dateNotFound = false;
      }
      //If current selected month and year are less than expected month and year then go Inside this condition.
      else if(monthList.indexOf(calMonth)+1 < expMonth && (expYear == Integer.parseInt(calYear)) || expYear > Integer.parseInt(calYear))
      {
       //Click on next button of date picker.
       driver.findElement(By.xpath("//*[@id='CalendarControl']/table/tbody/tr[1]/td[3]/a")).click();
      }
      //If current selected month and year are greater than expected month and year then go Inside this condition.
      else if(monthList.indexOf(calMonth)+1 > expMonth && (expYear == Integer.parseInt(calYear)) || expYear < Integer.parseInt(calYear))
      {
       //Click on previous button of date picker.
       driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
      }
     }
     Thread.sleep(3000);


}
}

