package com.noxx.testapplication;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.Until;
import org.junit.Before;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;


public class LoginTest {

    Context context;
    UiDevice device = UiDevice.getInstance(getInstrumentation());
    String packageName;



    @Before
    public void startApp() {
        packageName = InstrumentationRegistry.getTargetContext().getPackageName();
        context = InstrumentationRegistry.getContext();
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(packageName);
        context.startActivity(intent);
    }


    @Test
        public void test()  {

        device.findObject(By.res(packageName,"btnLogin")).click();
        device.wait(Until.findObject(By.res(packageName,"message").text("Необходимо ввести логин и пароль")), 2000);
        device.findObject(By.res(packageName, "positive")).click();

        device.wait(Until.findObject(By.res(packageName, "etLogin").clickable(true)), 2000);
        device.findObject(By.res(packageName, "etLogin")).setText("autotest");
        device.findObject(By.res(packageName,"btnLogin")).click();
        device.wait(Until.findObject(By.res(packageName,"message").text("Необходимо ввести пароль")), 2000);
        device.findObject(By.res(packageName, "positive")).click();











    }

}











