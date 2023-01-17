// In this example, we are displaying the display lanuage of many locales.
import java.util.*;  
public class LocaleEx {  
public static void main(String[] args) {  
Locale[] locales = { new Locale("en", "US"),  
 new Locale("es", "ES"), new Locale("it", "IT") };   
  
for (int i=0; i< locales.length; i++) {   
 String displayLanguage = locales[i].getDisplayLanguage(locales[i]);   
 System.out.println(locales[i].toString() + ": " + displayLanguage);   
}   
}  
  
}  
