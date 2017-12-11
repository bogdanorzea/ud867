package com.example.android.clickcounter;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class ClickActivityTest {

    @Rule
    public ActivityTestRule<ClickActivity> mActivityRule = new ActivityTestRule<>(
            ClickActivity.class);

    @Test
    public void changeText_sameActivity() {
        // Check that the text was changed.
        onView(withId(R.id.click_count_text_view))
                .check(matches(withText("0")));

        // Perform click on button
        onView(withId(R.id.click_button)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.click_count_text_view))
                .check(matches(withText("1")));
    }
}