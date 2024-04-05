package org.example.car;

public interface IKeepSpeed {

    default void keepSpeed(){
        System.out.println("Keep speed 70");
    }
}
