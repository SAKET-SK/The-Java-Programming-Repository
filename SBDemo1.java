// Demonstration of String Buffer {append,reverse}

class SBDemo1{
    public static void main(String args[]){
        StringBuffer sb1 = new StringBuffer("Core");
        StringBuffer sb2 = new StringBuffer("Java");
        System.out.println("Appending both : " + sb1.append(sb2));   // It will join both Core and Java
        StringBuffer sb3 = new StringBuffer("Saket");
        System.out.println("Reverseing : " + sb3.reverse(sb3));     // It will reverse the given String
    }
}
