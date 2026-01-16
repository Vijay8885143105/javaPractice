package interview_Coding;

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


	}

}
