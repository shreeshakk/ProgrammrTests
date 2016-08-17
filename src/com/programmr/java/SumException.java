package com.programmr.java;

/**
 * Created by shkk on 8/2/2016.
 */
public class SumException {

    public static void main(String[] args) {

        int sum = 110;

        if(sum > 100){
            try {
                throw new CustomException("number greater that 100");
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }
    }
}
