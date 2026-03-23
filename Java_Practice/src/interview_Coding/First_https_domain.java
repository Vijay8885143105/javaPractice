package interview_Coding;
import java.util.*;
public class First_https_domain {
    public static void main(String[] args) {

        String urls[] = {"http://world.news.yahoo.com/news/olympics/", "https://store.apple.com"};

        for (String url : urls) 
        {
            // Step 1: Remove http/https
            url = url.replace("http://", "").replace("https://", "");

            // Step 2: Get domain (before '/')
            String domain = url.split("/")[0];          //output after this step-----domain = "world.news.yahoo.com"

            // Step 3: Full domain
            String fullDomain = domain;

            // Step 4: Split by '.'
            String parts[] = domain.split("\\.");     //world.news.yahoo.com    
            /*parts[0] = "world"
            parts[1] = "news"
            parts[2] = "yahoo"
            parts[3] = "com"*/

            // Step 5: Get last two parts
            String lastTwo = parts[parts.length - 2] + "." + parts[parts.length - 1];

            // Step 6: Print output
            System.out.println("[\"" + fullDomain + "\", \"" + lastTwo + "\"]");
        }
    }
}

