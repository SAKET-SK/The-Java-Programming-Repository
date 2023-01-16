// In this example, we are displaying english language in different language. Let's see how english is written in french and spanish languages.
import java.util.*;  
public class LocaleEx1 {  
    public static void main(String[] args) {  
        Locale enLocale = new Locale("en", "US");  
        Locale frLocale = new Locale("fr", "FR");  
        Locale esLocale = new Locale("es", "ES");  
        System.out.println("English language name (default): " +   
                            enLocale.getDisplayLanguage());  
  
        System.out.println("English language name in French: " +   
                            enLocale.getDisplayLanguage(frLocale));  
        System.out.println("English language name in spanish: " +   
                enLocale.getDisplayLanguage(esLocale));  
    }  
  
}  
