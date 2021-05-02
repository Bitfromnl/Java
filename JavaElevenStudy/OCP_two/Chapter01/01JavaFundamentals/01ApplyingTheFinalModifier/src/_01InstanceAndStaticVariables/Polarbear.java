package _01InstanceAndStaticVariables;
/*
When an instance variable is marked final then it must be assigned a value when
it is declared or when the object is instantiated.

instantiation bij declaration met value
instantiation bij declarationn zonder value maar krijgt value via initializer
instantiation bij declaration maar via overloaded constructor wordt de basis constructor aangeroepen en krijgt name tóch een value.

 */
public class Polarbear {

    final int age = 10;
    final int fishEaten;
    final String name;

    {fishEaten = 10;}

    public Polarbear(){
        name = "robert";
    }

    public Polarbear(int height) {
        this();
    }


}
