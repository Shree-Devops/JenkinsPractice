package package1;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortByValue {
 public static void main(String args[]) {

  TreeMap<String, String> treemap = new TreeMap<String, String>();

  treemap.put("3 IN", "India");
  treemap.put("1 US", "United States");
  treemap.put("2 AUS", "Australia");
  treemap.put("5 PAK", "Pakistan");
  treemap.put("4 UK", "United Kingdom");

  System.out.println("Treemap before sorting : " + treemap);

  
 }

}
