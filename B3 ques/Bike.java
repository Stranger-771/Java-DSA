class Bike {
    int speed;
    String name;
    Bike(){
        System.out.println("Default Constructor Invoked");
    }
    Bike(int n, String s){
        speed=n;
        name=s;
    }
    public void display()
    {
        System.out.println("Speed is "+speed+ "name is "+name);
    }
        
    }

