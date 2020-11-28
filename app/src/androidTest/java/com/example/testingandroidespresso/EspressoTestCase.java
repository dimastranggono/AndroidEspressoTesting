package com.example.testingandroidespresso;


import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import static androidx.test.InstrumentationRegistry.getInstrumentation;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import com.example.testingandroidespresso.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class EspressoTestCase {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void espresso1plus2() {
        onView(withId(R.id.btn1)).perform(click());
        onView(withId(R.id.btn2)).perform(click());
        onView(withId(R.id.txtSkor)).check(matches(withText("3")));
    }
    @Test
    public void espresso2plus3() {
        onView(withId(R.id.btn2)).perform(click());
        onView(withId(R.id.btn3)).perform(click());
        onView(withId(R.id.txtSkor)).check(matches(withText("5")));
    }
    @Test
    public void espresso1plus3() {
        onView(withId(R.id.btn1)).perform(click());
        onView(withId(R.id.btn3)).perform(click());
        onView(withId(R.id.txtSkor)).check(matches(withText("4")));
    }
    @Test
    public void espressoReset() {
        onView(withId(R.id.btnReset)).perform(click());
        onView(withId(R.id.txtSkor)).check(matches(withText("0")));
    }
}
