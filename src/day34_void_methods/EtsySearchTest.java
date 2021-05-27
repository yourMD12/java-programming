package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("== starting ETSY search smoke test ==");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("-- etsy search smoke test completed -- pass --");


    }

    public static void openBrowser(){
        System.out.println("launching chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("navigating to etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("PASS: verify etsy home page is displayed");
        System.out.println(" type WOODEN SPOON in search field and lick search");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("PASS: search results are successfully displayed");
    }
}
