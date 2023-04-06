package org.example;

public class Tuple<A, B> {
    private A elementOne;
    private B elementTwo;

    public Tuple(A elementOne, B elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    public A getElementOne() {
        return elementOne;
    }

    public B getElementTwo() {
        return elementTwo;
    }

    public void setElementOne(A elementOne) {
        this.elementOne = elementOne;
    }

    public void setElementTwo(B elementTwo) {
        this.elementTwo = elementTwo;
    }
}
