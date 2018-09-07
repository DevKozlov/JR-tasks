package com.javarush.task.task22.task2201;

import java.io.Externalizable;

public class TooShortStringFirstThreadException extends RuntimeException {
    public TooShortStringFirstThreadException(Throwable  message) {
        super(message);
    }
}
