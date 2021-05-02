package InstanceAndStaticVariables;

/*
Static final  variables must be given a value or they don't compile
Static variables can be initialized by static constructors

name is given a value when it is declared
bamboo is given a value when the static initializer is run
height is never given a value as a static final

 */

public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
    static final double heigth;

    static {bamboo = 5;}

}
