//Collection set demo
import static java.lang.System.out;

import java.util.Set;
import java.util.HashSet;

public class SetDemo {
  public static void main(String[] args){
     Set <String> set = new HashSet<>();
    set.add("mettur");
    set.add("salem");
    set.add("chennai");
    set.add("trichy");
    set.add("madurai");
    set.add(null);
    set.add("salem");
    set.add(null);
    set.add("erode");
    
    out.println(set.size());
    out.println(set);
  }
}
