import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.lang.*;
import java.io.*;

public class Palindrome {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/main.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");
      String userInput = request.queryParams("userInput");
      Boolean isPalindrome = palindromeChecker(userInput);

      model.put("isPalindrome", isPalindrome);
      model.put("results", userInput);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static Boolean palindromeChecker(String userInput) {
    userInput = userInput.replaceAll("\\s+","");
    StringBuilder inputToReverse = new StringBuilder(userInput);
    String reverse = inputToReverse.reverse().toString();

    if (userInput.equals(reverse)) {
      return true;
    } else {
      return false;
    }
  }
}
