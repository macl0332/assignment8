public class FindValue {
  public static void main(String[] args) {

    int[] arrayItems = {1, 9999, 1500, 31, 1991, 8150, 2022, 1379, 11, 7, 3197, 5820, 6547, 3579};
    int specifiedVal = 20;
   
    boolean found = true;

	  for (int n : arrayItems) {
      if (n == specifiedVal) {
        found = true;
        break;
      }
    }
    
    if(found)
      System.out.println(specifiedVal + " is found.");
    else
      System.out.println(specifiedVal + " is not found.");
  }
}