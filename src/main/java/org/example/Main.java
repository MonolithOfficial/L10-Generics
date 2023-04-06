package org.example;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // correct
        List<String> someList = new ArrayList<>();
        someList.add("1");
        someList.add("1");

        Iterator<String> iter = someList.iterator();
        while(iter.hasNext()){
            String data = iter.next();
        }

        // semi-correct
        List someVagueList = new ArrayList<>();
        someVagueList.add(new Integer(1));
        someVagueList.add("1");

        Iterator<String> iter2 = someVagueList.iterator();
        while(iter.hasNext()){
            Object data = iter2.next();
            if (!(data instanceof Integer)){
                String stringData = (String) iter.next();
            }
        }

        // Tuple
        Tuple<Rectangle, String> tupleOne = new Tuple<>(new Rectangle(), "Some Value");
        Tuple<Integer, String> codeAndMessage = createTuple(404, "Not Found");
        Assert.assertEquals(codeAndMessage.getElementTwo(), "Not Found");

        printInfo(new Shape(), new Shape());
    }

    // unrestricted generic method
    public static <A, B> Tuple<A, B> createTuple(A elementOne, B elementTwo){
        return new Tuple<>(elementOne, elementTwo);
    }

    // restricted generic method
    public static <A extends Shape, B extends Shape> void printInfo(A shapeOne, B shapeTwo){
        shapeOne.printInfo();
        shapeTwo.printInfo();
    }
}