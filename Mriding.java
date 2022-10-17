// Demonstrating Method overriding

class BC
{
    void show()
    {
        System.out.println("I am Base Class");
    }
}
class DC extends BC
{
    void show()
    {
        System.out.println("I am Derieved Class");
    }
}
class Mriding
{
    public static void main(String args[])
    {
        BC bobj = new BC();
        bobj.show();
        
        DC dobj = new DC();
        dobj.show();
    }
}
  
