package com.company;

// Inherited class
class Parrot extends Bird {
    // This method overrides show() of Parent
    @Override
    public void fly()
    {
        System.out.println("I am Flying");

    }
    public void sing(){
        System.out.println("I am Singing");
    }

}

// Driver class
public class Main{
    public static void main(String[] args){
        Bird b1 = new Parrot();
//with this b1 reference call the fly method
        b1.fly();
//and after downcasting this b1 reference to the Parrot class object, call the sing method also
        Parrot p1 = (Parrot) b1;
        p1.sing();
    }
}
