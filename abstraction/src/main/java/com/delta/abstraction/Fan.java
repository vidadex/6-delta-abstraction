package com.delta.abstraction;

import android.util.Log;

public class Fan extends Device implements Switchable {

    public Fan() {
        setDeviceName("FAN");
    }

    public void breakDevice() {
        Log.e(getDeviceName(), "BANG, CRASH!.......oops,");
    }

    public void turnOn() {
        Log.e(getDeviceName(), "How can i feel cool. There are my keys!");
    }

    public void turnOff() {
        Log.e(getDeviceName(), "Ouch, now it's so hot here, I socked my dress!");
    }
}

