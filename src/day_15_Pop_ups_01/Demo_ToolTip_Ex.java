package day_15_Pop_ups_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_ToolTip_Ex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Selenium\\Packages\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/karmax-wood-portable-laptop-table/p/itme1a08a109c0d5?pid=PLLFN8ZGN9T9USPP&lid=LSTPLLFN8ZGN9T9USPPQCLGRQ&marketplace=FLIPKART&store=wwe&srno=b_1_9&otracker=hp_omu_Deals%2Bof%2Bthe%2BDay_2_3.dealCard.OMU_PD3THSRUILOS_3&otracker1=hp_omu_SECTIONED_manualRanking_neo%2Fmerchandising_Deals%2Bof%2Bthe%2BDay_NA_dealCard_cc_2_NA_view-all_3&fm=neo%2Fmerchandising&iid=c68012c5-321d-466b-bac4-cb3a787edc3a.PLLFN8ZGN9T9USPP.SEARCH&ppt=browse&ppn=browse&ssid=isctujoa4w0000001617204090180");
		driver.get("https://www.flipkart.com/motorola-g30-pastel-sky-64-gb/p/itmc7ceaa1d753f4?pid=MOBFVXGZMHTXSHPN&lid=LSTMOBFVXGZMHTXSHPN2JNPQV&marketplace=FLIPKART&store=tyy%2F4io&srno=b_1_1&otracker=clp_banner_2_8.bannerX3.BANNER_mobile-phones-store_L52J3GW0VFXY&fm=neo%2Fmerchandising&iid=931de628-b49c-4496-adc5-e319786e7348.MOBFVXGZMHTXSHPN.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=xr1co4cnkg0000001617367463464");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//span[@class='question'])[1]")).click();
		
		Thread.sleep(3000);
		
		String txt = driver.findElement(By.xpath("//div[@class='_2JH8X1']")).getText();
		System.out.println(txt);
		driver.close();
	}

}
