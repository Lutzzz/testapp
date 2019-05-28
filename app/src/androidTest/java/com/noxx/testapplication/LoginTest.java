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
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.MatcherAssert.*;

public class LoginTest {

    Context context;
    UiDevice device = UiDevice.getInstance(getInstrumentation());
    String packageName;
    String launcherPackage;



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
        device.wait(Until.findObject(By.res(packageName,"message").textContains("Необходимо ввести")), 2000);
        device.findObject(By.res(packageName, "positive")).click()



        //assertThat(device.findObject(By.res(packageName,"neutral")).getText(), containsString("Необходимо ввести"))
        //device.findObject(By.res(packageName,"etPassword")).setText("auto");







    }

}











