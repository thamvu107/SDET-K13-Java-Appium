package src.labs.lab_6;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlChecker {
    public static final String INVALID_URL = "Invalid URL";
    /*
            String url = "https://google.com";
            Check http OR https; domain name, .com OR .net
      */

    /*
     * Syntax: URL = scheme:[//authority]/path[?query][#fragment]
     * scheme (protocol) include : anf before //
     * authority = after // and before first /
     * authority = [userinfo "@"] host [":" port]
     * host name = after userinfo (@) and before port (:)
     * */

    public static void main(String[] args) throws MalformedURLException {
        List<String> urls = uriList();
        showURLs(urls);

        int urlIndex = 13;
        String url = urls.get(urlIndex);

        System.out.println("\nCheck protocol, domain name and domain extension of this URL");
        System.out.printf("%d. %s\n\n", urlIndex, url);

        if (isValidURL(url)) {

            String protocol = getProtocol(url);
            String protocolType = checkProtocolType(protocol);
            System.out.println(protocolType);

            String authority = getAuthority(url);
            String hostName = getHostName(authority);
            System.out.println("Host name is: " + hostName);

            String domainExtension = getDomainExtension(hostName);
            System.out.println("Domain extension is: " + domainExtension);
        } else {
            System.out.println("Invalid URL. Please provide valid URL!");
        }
    }

    private static List<String> uriList() {
        List<String> uriList = new ArrayList<>();

        uriList.add("http://");
        uriList.add("http://www");
        uriList.add("google.com");
        uriList.add("https://google.com");
        uriList.add("http://www.google");
        uriList.add("http://www. .com");
        uriList.add("htps://google.com");
        uriList.add("https://goog le.com");
        uriList.add("https://google.com");
        uriList.add("https://google.com/");
        uriList.add("https://google.com//");
        uriList.add("https://www.rfc-editor.org/rfc/inline-errata/rfc3986.html");
        uriList.add("https://john.doe@www.developer.mozilla.org:8080/en-US");
        uriList.add("HTTPS://tham@en.wikipedia.org:8080/wiki");
        uriList.add("ftp://ftp.is.co.za/rfc/rfc1808.txt");
        uriList.add("http://www.ietf.org/rfc/rfc2396.txt");
        uriList.add("ldap://[2001:db8::7]/c=GB?objectClass?one");
        uriList.add("telnet://192.0.2.16:80/");
        uriList.add("file://192.168.1.57");
        uriList.add("http://en.wikipedia.org:8080/wiki");

        return uriList;
    }

    private static void showURLs(List<String> urlList) {
        System.out.println("Show list URL and validate");
        for (int index = 0; index < urlList.size(); index++) {
            String url = urlList.get(index);
            boolean valid = isValidURL(url);
            System.out.printf("%d. %s is %s\n", index, url, valid == true ? "valid" : "invalid");
        }
    }

    private static String getProtocol(String url) {
        int separateIndex = url.indexOf(":");

        return url.substring(0, separateIndex);
    }

    private static String checkProtocolType(String protocol) {
        String protocolType;
        if (protocol.equalsIgnoreCase("http")) {
            protocolType = "Protocol is http";
        } else if (protocol.equalsIgnoreCase("https")) {
            protocolType = "Protocol is https";
        } else {
            protocolType = "Protocol is " + protocol;
        }
        return protocolType;
    }

    private static String getAuthority(String url) {
        int doubleSlashesIndex = url.indexOf("//");
        int startIndex = doubleSlashesIndex + 2;

        int singleSlashIndex = url.indexOf("/", startIndex);
        int endIndex = singleSlashIndex == -1 ? url.length() : singleSlashIndex;

        return url.substring(startIndex, endIndex);
    }

    private static String getHostName(String authority) {
        int userInfoEndIndex = authority.indexOf("@");
        int startIndex = userInfoEndIndex == -1 ? 0 : userInfoEndIndex + 1;

        int portStartIndex = authority.indexOf(":", startIndex);
        int endIndex = portStartIndex == -1 ? authority.length() : portStartIndex;
        return authority.substring(startIndex, endIndex);
    }

    private static String getDomainExtension(String hostName) {
        String[] splitHostName = hostName.split("\\.");
        int lastIndex = splitHostName.length - 1;
        String domainExtension = splitHostName[lastIndex];

        return domainExtension;
    }

    public static boolean isValidURL(String url) {
        try {
            new URL(url);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
