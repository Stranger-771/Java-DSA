class A {
    public void show(String x){
        System.out.println("show method in class a"+x);

    }
}
class B extends A {
    public void show(){
        System.out.println("show method in class b");

    }
}
class C extends B {
    public void show(String x, String y){
        System.out.println("show method in class c"+x+""+y);

    }
}

    

