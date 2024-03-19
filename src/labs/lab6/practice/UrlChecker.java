package src.labs.lab6.practice;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlChecker {
    /*
            String url = "https://google.com";
            Check http OR https; domain name, .com OR .net
      */

    /*
     * Syntax:
     *      URI Syntax = scheme:[//authority]/path[?query][#fragment]
     *      valid URL Syntax minimum = protocol://(subdomain.)domain/(path)(?parameters)
     *      Read more: https://url.spec.whatwg.org/#parsing
     * scheme (protocol) include : anf before //
     * authority = after // and before first /
     * authority = [userinfo "@"] host [":" port]
     * host name = after userinfo (@) and before port (:)
     * endWith valid domain Single source of trust valid domain ( .com, .net)
     * */
    private static final String DOMAIN_EXTENSION_PATTERN = ".com|.org|.net|.gov|.edu";

    // check other regex https://mathiasbynens.be/demo/url-regex
    private static final String DIEGOPERINI_URL_REGEX =
            "^" +
                    // protocol identifier (optional)
                    // short syntax // still required
                    "(?:(?:(?:https?|ftp):)?\\/\\/)" +
                    // user:pass BasicAuth (optional)
                    "(?:\\S+(?::\\S*)?@)?" +
                    "(?:" +
                    // IP address exclusion
                    // private & local networks
                    "(?!(?:10|127)(?:\\.\\d{1,3}){3})" +
                    "(?!(?:169\\.254|192\\.168)(?:\\.\\d{1,3}){2})" +
                    "(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})" +
                    // IP address dotted notation octets
                    // excludes loopback network 0.0.0.0
                    // excludes reserved space >= 224.0.0.0
                    // excludes network & broadcast addresses
                    // (first & last IP address of each class)
                    "(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])" +
                    "(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}" +
                    "(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))" +
                    "|" +
                    // host & domain names, may end with dot
                    // can be replaced by a shortest alternative
                    // (?![-_])(?:[-\\w\\u00a1-\\uffff]{0,63}[^-_]\\.)+
                    "(?:" +
                    "(?:" +
                    "[a-z0-9\\u00a1-\\uffff]" +
                    "[a-z0-9\\u00a1-\\uffff_-]{0,62}" +
                    ")?" +
                    "[a-z0-9\\u00a1-\\uffff]\\." +
                    ")+" +
                    // TLD identifier name, may end with dot
                    "(?:[a-z\\u00a1-\\uffff]{2,}\\.?)" +
                    ")" +
                    // port number (optional)
                    "(?::\\d{2,5})?" +
                    // resource path (optional)
                    "(?:[/?#]\\S*)?" +
                    "$";

    public static void main(String[] args) throws MalformedURLException {
        List<String> urls = uriList();
        List<List<String>> checkedSyntaxURLs = checkSynTaxURLs(urls);

        System.out.println("Part I: Valid syntax URLs");
        List<String> validURLs = checkedSyntaxURLs.get(0);
        showProtocolAndDomainInfo(validURLs);

        System.out.println("\nPart II: Invalid syntax URLs");
        List<String> inValidURLs = checkedSyntaxURLs.get(1);
        showInvalidURLs(inValidURLs);
    }

    private static List<String> uriList() {
        List<String> uriList = new ArrayList<>();

        uriList.add("https://www.google.com"); // Verify the URL field by entering the valid URL with https.
        uriList.add("HTTP://google.com"); //  the URL field by entering the valid URL with http only.
        uriList.add("htps://google.com"); // check protocol is typo
        uriList.add("google.com"); //  the URL field by entering the without entering the Https or HTTP.
        uriList.add("https://google"); //  the URL field without entering the extension name
        uriList.add("http://localhost"); // without TLD
        uriList.add("https://googlecom"); //  the URL field without entering any dot.
        uriList.add("https://www.com"); //  the URL field by entering only the extension
        uriList.add("https://www.guru99.com"); //  the URL field by entering the combination of number and character
        uriList.add("https://99.com"); //  the URL field by entering the numbers only.
        uriList.add("telnet://192.0.2.16:80/");
        uriList.add("https://google@.com"); //  the URL field by entering the combination of number, character and special characters other than (.)
        uriList.add("https://tham-vu@www.guru99.com:8080/");
        uriList.add("https://www.goo  gle.com"); //  the Url fields by entering the space between the domains
        uriList.add(" "); //  the URL field by entering only blank space
        uriList.add(""); //  the URL field without entering any data
        uriList.add("https:google.com"); // The URL without double slashes before authority
        uriList.add("https:google.com//"); // The URL has double slashes but its note before authority
        uriList.add("https:///google.com");
        uriList.add("https://en.google");
        uriList.add("://google.com");
        uriList.add("http://");
        uriList.add("http://www");
        uriList.add("https://com");
        uriList.add("https://www.com");
        uriList.add("http://www. .com");
        uriList.add("https://goog le.com");
        uriList.add("http://.www.foo.bar/");
        uriList.add("http://www.foo.bar/");
        uriList.add("http://www.foo.bar./");
        uriList.add("https://tham.vu@vi.google.org:8080/");
        uriList.add("ftp://ftp.is.co.za/rfc/rfc1808.txt");
        uriList.add("file://192.168.1.57");
        uriList.add("http://en.wikipedia.org:8080/wiki");
        uriList.add("https://www.rfc-editor.org/");
        uriList.add("ldap://[2001:db8::7]/c=GB?objectClass?one");

        return uriList;
    }

    private static List<List<String>> checkSynTaxURLs(List<String> urlList) {

        List<String> validURLs = new ArrayList<>();
        List<String> invalidURLs = new ArrayList<>();
        List<List<String>> checkedURLs = new ArrayList<>();

        for (int index = 0; index < urlList.size(); index++) {
            String url = urlList.get(index);

            if (urlValidator(url)) {
                validURLs.add(url);
            } else {
                invalidURLs.add(url);
            }
        }

        checkedURLs.add(validURLs);
        checkedURLs.add(invalidURLs);

        return checkedURLs;
    }

    private static void showProtocolAndDomainInfo(List<String> validURLs) {
        for (int index = 0; index < validURLs.size(); index++) {
            String url = validURLs.get(index);

            System.out.printf("%d. %s \n", index + 1, url);

            String protocol = getProtocol(url);
            String protocolType = checkProtocolType(protocol);
            System.out.printf("\t%s\n", protocolType);

            String authority = getAuthority(url);

            String hostName = authority == null ? "null" : getHostName(authority);
            System.out.printf("\tDomain name: %s\n", hostName);

            String domainExtension = getDomainExtension(hostName);
            System.out.printf("\tDomain extension: %s\n\n", domainExtension);
        }
    }

    private static void showInvalidURLs(List<String> invalidURLs) {
        for (int index = 0; index < invalidURLs.size(); index++) {
            System.out.printf("%d. %s\n", index + 1, invalidURLs.get(index));
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
            protocolType = "Protocol is: " + protocol;
        }
        return protocolType.toLowerCase();
    }

    private static String getAuthority(String url) {
        int doubleSlashesIndex = url.indexOf("//");

        int startIndex = doubleSlashesIndex + 2;

        int singleSlashIndex = url.indexOf("/", startIndex + 1);

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
        int lastDotIndex = hostName.lastIndexOf(".");
        if (lastDotIndex == -1) {
            return null;
        }
        String lastItem = hostName.substring(lastDotIndex, hostName.length());

        Pattern pattern = Pattern.compile(DOMAIN_EXTENSION_PATTERN);
        Matcher matcher = pattern.matcher(lastItem);

        if (matcher.matches()) {
            return lastItem;
        }

        return "Unknown";
    }

    public static boolean urlValidator(String url) {

        if (url == null) {
            return false;
        }

        Pattern pattern = Pattern.compile(DIEGOPERINI_URL_REGEX, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(url);

        return matcher.matches();
    }
}
