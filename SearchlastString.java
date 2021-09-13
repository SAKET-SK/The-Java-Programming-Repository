public class SearchlastString {
   public static void main(String[] args) {
      String strOrig = "Hello world ,Hello Java Students, Welcome to Java practical";
      int lastIndex = strOrig.lastIndexOf("Java");
      
      if(lastIndex == - 1){
         System.out.println("Java not found");
      } else {
         System.out.println("Last occurrence of Java is at index "+ lastIndex);
      }
   }
}