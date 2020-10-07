package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1472Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("browserHistory");
        SolutionA1472 browserHistory = new SolutionA1472("leetcode.com");

        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
        assertEquals(browserHistory.back(1), "facebook.com");                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        assertEquals(browserHistory.back(1), "google.com");                 // You are in "facebook.com", move back to "google.com" return "google.com"
        assertEquals(browserHistory.forward(1), "facebook.com");                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
        assertEquals(browserHistory.forward(2), "linkedin.com");                // You are in "linkedin.com", you cannot move forward any steps.
        assertEquals(browserHistory.back(2), "google.com");                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        assertEquals(browserHistory.back(7), "leetcode.com");;                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
    }
}
