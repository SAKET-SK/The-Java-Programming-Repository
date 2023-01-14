// Demonstration of StringBuffer {delete, replace}

class SBDemo2{
    public static void main(String args[]){
        StringBuffer sb1 = new StringBuffer("Yavatmal");
        System.out.println("Delete some letters : " + sb1.delete(3,6));    // Yav _ _ _ al
        
        StringBuffer sb2 = new StringBuffer("Hi Alice");
        System.out.println("Replacing the message : " + sb2.replace(3,8,"Bob"));    // Hi Bob
        
    }
}
