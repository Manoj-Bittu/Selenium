package day_15_Pop_ups_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_ToolTip_02 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/chevit-516-trendy-star-perfect-sneakers-men/p/itm8dd4fbd74edb1?pid=SHOGYF6A6X8PBHNP&lid=LSTSHOGYF6A6X8PBHNPKDQW97&marketplace=FLIPKART&store=osp%2Fcil&srno=b_1_2&otracker=hp_omu_Deals%2Bof%2Bthe%2BDay_3_3.dealCard.OMU_IV72PZB0ERGA_3&otracker1=hp_omu_SECTIONED_manualRanking_neo%2Fmerchandising_Deals%2Bof%2Bthe%2BDay_NA_dealCard_cc_3_NA_view-all_3&fm=neo%2Fmerchandising&iid=en_G5RW68SgM1CpvPuN3mzS8lTyTip641XNFs6a%2B2kQ1%2BRAIeWNkGkb0y%2BCg7cYg7Lz1%2FaaGSzbOa%2FFks5IVDEtzQ%3D%3D&ppt=browse&ppn=browse&ssid=fad0n0nork0000001617166051638");;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class='question']")).click();
		driver.findElement(By.xpath("//span[@class='question']")).getAttribute("");

	}

}
