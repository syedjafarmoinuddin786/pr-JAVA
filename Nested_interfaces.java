interface outer{
    interface inner {
    public void show();
    }
}
class implementingClass implements outer.inner{
    public void show(){
        System.out.println("Implementing Inner Interface");
    }
}
public class innerInterface{
    public static void main(String[] args){
        implementingClass i = new implementingClass();
        i.show();
    }
}
