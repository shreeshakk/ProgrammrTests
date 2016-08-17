package com.programmr.java;

/**
 * Created by shkk on 8/2/2016.
 */
public class CustomException extends  Exception {

    public CustomException(){
        System.out.println("The number is greater than 100");
    }

    public CustomException(String description){
        super(description);
    }

}
