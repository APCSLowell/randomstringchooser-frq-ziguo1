import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  protected String[] strs;
  public RandomStringChooser(String[] s) { strs = s; }
  public String getNext() {
    if (strs.length == 0) return "NONE";
    int chosen = (int) (Math.random() * strs.length);
    String stri = strs[chosen];

    String[] n = new String[strs.length - 1];
    int ptr = 0;
    for (int i = 0; i < strs.length; i++) {
      String get = strs[i];
      if (get != stri) {
        n[ptr] = get;
        ptr++;
      }
    }
    strs = n;
    return stri;
  }
}
