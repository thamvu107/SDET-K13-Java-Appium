package src.labs.lab_6;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlChecker {
    public static void main(String[] args) throws MalformedURLException {
//        String urlString = "https://google.com";
        String urlString = "https://developer.mozilla.org/en-US";
//        String urlString = "https://en.wikipedia.org/wiki";
        System.out.println(urlString);

        URL url = new URL(urlString);

        String protocol = url.getProtocol();
        System.out.println("Protocol is: " + protocol);

        String domain = url.getHost();
        String[] domainParts = domain.split("\\.");

        String topLevelDomain = domainParts[domainParts.length - 1];
        System.out.println("Top-level domain is: " + topLevelDomain);

        String secondLevelDomain = domainParts[domainParts.length - 2];
        System.out.println("Second-level domain is: " + secondLevelDomain);

        if (domainParts.length == 3) {
            String subDomain = domainParts[0];
            System.out.println("Sub-domain is: " + subDomain);

        }

    }

     /*
            String url = "https://google.com";
            String url = "https://developer.mozilla.org/en-US/docs/Learn;
            Check http OR https; domain name, .com OR .net
      */
}
