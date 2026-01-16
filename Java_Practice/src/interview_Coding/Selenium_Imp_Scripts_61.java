package interview_Coding;

import java.util.List;

public class Selenium_Imp_Scripts_61 {

	public static void main(String[] args) {
		//How do you find all hyper links on a web page and verify whether they are broken or working using selenium ?

		/*WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://flights.com");   // change URL

	        // Find all anchor tags
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("Total links found: " + links.size());

	        for (WebElement link : links) {    //Loop Through Each Link
             // Extracting URL from Link
	            String url = link.getAttribute("href");  //Reads the actual link address from the anchor tag.

	            if (url == null || url.isEmpty()) {
	                System.out.println("URL is empty or not configured");
	                continue;
	            }

	            try {
	            	//Creating URL Object
	                URL linkURL = new URL(url);  //Converts String URL into a URL object, URL is a concrete class(Normal class) in the java
	                HttpURLConnection httpConn = (HttpURLConnection) linkURL.openConnection();  // Opening HTTP Connection,HttpURLConnection is a class
	                httpConn.connect();     // Connecting to the Server, Sends the request to the server.

	                int responseCode = httpConn.getResponseCode();    // Getting Response Code
                  // Validating Link
	                if (responseCode >= 400) {
	                    System.out.println(url + " --> Broken Link (" + responseCode + ")");
	                }
	                else 
	                {
	                    System.out.println(url + " --> Valid Link (" + responseCode + ")");
	                }

	            } catch (Exception e) {
	                System.out.println(url + " --> Exception occurred");
	            }
	        }
	        driver.quit();*/

		System.out.println("================================================================================================");

		/*How do you handle multiple windows in Selenium using Set and switch to a ((specific window)) based on its title?

        // 1. Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gmail.com");

        Thread.sleep(5000);   // wait for page load

        // 2. Store parent window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentWindow);

        // 3. Open multiple windows
        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();
        driver.findElement(By.linkText("Terms")).click();

        Thread.sleep(5000);   // wait for windows to open

        // 4. Get all window handles
        Set<String> windows = driver.getWindowHandles();

        // 5. Switch to Privacy window using title    //✔️ Works even when multiple windows exist

        for (String each : windows) {
            driver.switchTo().window(each);

            if (driver.getTitle().contains("Privacy")) {
                System.out.println("Switched to Privacy Window");
                break;
            }
        }

        Thread.sleep(3000);   // just to observe

        // 6. Perform any action (example print title)
        System.out.println("Current Window Title: " + driver.getTitle());

        // 7. Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Back to Parent Window");

        Thread.sleep(3000);

        // 8. Close browser
        driver.quit();
		 */
		System.out.println("=====================================================================================================");
		//How do you handle ((multiple child windows)) in Selenium and switch back to the parent window?

		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);

		//get gmail window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		//click three links to open tabs
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();

		//get collection of all windows id
		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);

		//Iterate all windows
		for (String each : allwins) {

			//parent id should not equal to each id
			if (!parent.equals(each)) {
				//switch to each child window
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();
			}
		}
		//switch to parent window
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("pranga2010");
		Thread.sleep(5000);
		driver.quit();*/
		System.out.println("=====================================================================================================");

		//Counting items in the listbox  OR Handling ((Dropdown OR ListBox))
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items
		List<WebElement> All_Items = listbox.getOptions();
		System.out.println("Number of items are::"+All_Items.size());
		for (WebElement each : All_Items) {
			Thread.sleep(5000);
			System.out.println(each.getText());

		}
	       Thread.sleep(5000);
	       driver.quit();*/
		System.out.println("=====================================================================================================");
		//Handling list box in facebook app

		/* WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.navigate().to("https://www.facebook.com/");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		//Store day,month,year listbox into select
		Select daylist = new Select(driver.findElement(By.name("birthday_day")));
		Select monthlist = new Select(driver.findElement(By.name("birthday_month")));
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		//verify listbox is single or multiple 
        boolean value = monthlist.isMultiple();
        System.out.println(value);
        //select items in three list box using select methods
        daylist.selectByVisibleText("5");
        Thread.sleep(5000);
        monthlist.selectByIndex(5);
        Thread.sleep(5000);
        year.selectByVisibleText("1994");
        Thread.sleep(5000);
        driver.quit();
		 */
		System.out.println("=====================================================================================================");
		//Check box collection
		/*//Get collection of checkboxes
		List<WebElement>all_checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of check boxes are:::"+all_checkboxes.size());
		Thread.sleep(5000);
		for (WebElement each : all_checkboxes) {
			//verify which check box is true or false
			boolean value = each.isSelected();
			//capture each check box name
			String checkbox_Name =each.getAttribute("value");
			System.out.println(checkbox_Name+"    "+value);
			each.click();
		}
		Thread.sleep(5000);
		driver.quit();*/
		System.out.println("=====================================================================================================");
		//Get collection of Radio buttons
		/*//get collection of radio buttons
		List<WebElement>all_Radios = driver.findElements(By.xpath("//div[@class='radio_b']"));
		System.out.println("Number of radio buttons are:::"+all_Radios.size());
		for (WebElement each : all_Radios) {
			System.out.println(each.getText());
		}
			driver.quit();*/

		/*//collection of hyperlinks in page
		List<WebElement>all_Links = dr.findElements(By.tagName("a"));
		System.out.println("Number of Links are:::::::::"+all_Links.size());
		for (WebElement each : all_Links) {
			System.out.println(each.getText());
		}*/
		System.out.println("=====================================================================================================");
		//Print weekends only using switch case statement
		/*int key=5;
		switch (key) {
		case 1:System.out.println("Monday");			break;
		case 2:System.out.println("Tuseday");			break;
		case 3:System.out.println("Wednesday");			break;
		case 4:System.out.println("Thursday");			break;
		case 5:System.out.println("Friday");			break;
		case 6:System.out.println("Saturday");			break;
		default:System.out.println("Sunday");break;

		}
		if (key>5) {
			System.out.println("Weekend");
		}
		else 
		{
			System.out.println("WeekDay");
	}
		 */
		System.out.println("=====================================================================================================");


	}

}
