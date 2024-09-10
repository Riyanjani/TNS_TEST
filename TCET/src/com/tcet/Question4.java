package com.tcet;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Question4 {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNum = num.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());                              
        System.out.println("Even numbers: " + evenNum);
    }
}
