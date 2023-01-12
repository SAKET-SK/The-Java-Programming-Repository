class Area{
    int len,bre;
    
    void getValue(){
        len = 12;
        bre = 8;
    }
    
    void getValue(int l){
        len = bre = l;      // In other words SQUARE
    }
    
    void getValue(int l, int b){
        len = l;
        bre = b;
    }
    
    void display(){
        System.out.println("Area = " + len * bre);
    }
}

class MethodOverloadingDemo{
    public static void main(String args[]){
        
        Area a1 = new Area();
        a1.getValue();       // It will call the method with 0 parameters
        a1.display();
        
        Area a2 = new Area();
        a2.getValue(7);      // It will call method with 1 parameter
        a2.display();
        
        Area a3 = new Area();
        a3.getValue(20,15);    // It will call method with 2 parameters
        a3.display();   
        
    }
}
