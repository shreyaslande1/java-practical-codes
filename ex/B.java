class Emp{
    int id;
    String name;
    double salary;
    Emp(int i,String n,double s){
        id=i;
        name=n;
        salary=s;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
    
}
class XX{
    public Emp a(Emp e){
        return e;
    }
}
public class B {
    public static void main(String[] args) {
        Emp e = new Emp(0, "shantanu", 200);
        XX x = new XX();
        x.a(e).display();
    }
}
