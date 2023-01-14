// Demonstration of StringBuffer {insert, setCharAt, setLength}

class SBDemo3{
    public static void main(String args[]){
        StringBuffer sb1 = new StringBuffer("My Java");
        System.out.println("Adding the word : " + sb1.insert(3,"Core"));   // My CoreJava

        StringBuffer sb2 = new StringBuffer("Japan");
        sb2.setCharAt(2,'k');      
        System.out.println("Changed character : " + sb2);     // Jakan

        StringBuffer sb3 = new StringBuffer("Computer");
        sb3.setLength(4);
        System.out.println("Cutting the length : " + sb3);    // Comp
     }
}
