import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PalindromeTest {

  @Test
  public void palindromeChecker() {
    Palindrome testPalindrome = new Palindrome();
    assertEquals(true, testPalindrome.palindromeChecker("stats"));
  }
}
