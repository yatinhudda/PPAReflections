package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericRun {
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        //myList.add("Yatender hudda");
        printString(myList);

        Integer[] intArray = {1, 2, 3, 4, 5};

        List<String> stringList = fromArrayToList(intArray, Object::toString);
        System.out.println(stringList.get(3));
    }

    static <T> void printString(List<T> myList){
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }

    public static <T, G> List<G> fromArrayToList(T[] someArray, Function<T, G> mapper){

        return Arrays.stream(someArray).map(mapper).collect(Collectors.toList());
    }
}
