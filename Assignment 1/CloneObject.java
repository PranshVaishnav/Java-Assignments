

 class Animal{
    public int a;
    Animal()
    {
        a=10;
    }

    public int getA(){
        return a;
    }

    public void setA(int x){
      a=x;
    }

    //Copy Constructor
    Animal(Animal obj)
    {
        a=obj.a;
    }

}


public class CloneObject {
    public static void main(String args[]) {
      Animal obj=new Animal();
      obj.setA(50);
      Animal obj2=new Animal(obj);
      Animal obj3=obj2;
      System.out.println(obj3.getA());
    }
}
