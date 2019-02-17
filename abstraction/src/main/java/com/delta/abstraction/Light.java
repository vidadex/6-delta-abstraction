package com.delta.abstraction;

import android.util.Log;

import java.io.Serializable;

public class Light extends Device implements Switchable {

    public Light() {
        setDeviceName("LIGHT");
    }

    @Override
    public void breakDevice() {
        Log.e(getDeviceName(), "Class Everywhere!........i guess its not that bad");
    }

    public void turnOn() {
        Log.e(getDeviceName(), "How can i see. There are my keys!");
    }

    public void turnOff() {
        Log.e(getDeviceName(), "Ouch, now it's so dark I stubbed my toe!");
    }

}