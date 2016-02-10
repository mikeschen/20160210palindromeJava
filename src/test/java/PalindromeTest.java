import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PalindromeTest {

  @Test
  public void palindromeChecker_true() {
    Palindrome testPalindrome = new Palindrome();
    assertEquals(true, testPalindrome.palindromeChecker("stats"));
  }

  @Test
  public void palindromeChecker_false() {
    Palindrome testPalindrome = new Palindrome();
    assertEquals(false, testPalindrome.palindromeChecker("stat"));
  }

  @Test
  public void palindromeChecker_numbers() {
    Palindrome testPalindrome = new Palindrome();
    assertEquals(true, testPalindrome.palindromeChecker("12344321"));
  }

  @Test
  public void palindromeChecker_removeSPaces() {
    Palindrome testPalindrome = new Palindrome();
    assertEquals(true, testPalindrome.palindromeChecker("a but tuba"));
  }
}
