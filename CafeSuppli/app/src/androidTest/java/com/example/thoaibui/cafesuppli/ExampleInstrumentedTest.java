package com.example.thoaibui.cafesuppli;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation navigation_item_style, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under navigation_item_style.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.thoaibui.cafesuppli", appContext.getPackageName());
    }
}
