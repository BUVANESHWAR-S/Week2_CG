import java.util.*;

class animal {
    protected String name;
    protected int age;
    protected void make_sound(){
        System.out.println("Animals make sound");
    }
}

class cat extends animal{
    @Override
    protected void make_sound(){
        System.out.println("cat meow");
    }
}
class dog extends animal {
    @Override
    protected void make_sound(){
        System.out.println("dog barks");
    }
    
}
class bird extends animal{
    @Override
    protected void make_sound(){
        System.out.println("birds chirp");
    }
}
public class pb1 {
public static void main(String[] args) {
    animal obj1 = new animal();
    obj1.make_sound();
    dog obj2 = new dog();
    obj2.make_sound();
    cat obj3 = new cat();
    obj3.make_sound();
    bird obj4 = new bird();
    obj4.make_sound();

}
    
}
