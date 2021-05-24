package com.furqoncreative.moviejetpack.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.furqoncreative.moviejetpack.R
import com.furqoncreative.moviejetpack.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    private val dummyMovies = DataDummy.generateDummyMovies()
    private val dummyTvShows = DataDummy.generateDummyTvShows()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                ViewActions.click()
            )
        )
        onView(withId(R.id.txtTitle)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtTitle)).check(ViewAssertions.matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.txtGenre)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtGenre)).check(ViewAssertions.matches(withText(dummyMovies[0].genre)))
        onView(withId(R.id.txtRating)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtRating)).check(ViewAssertions.matches(withText(dummyMovies[0].rating.toString())))
        onView(withId(R.id.txtOverview)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtOverview)).check(ViewAssertions.matches(withText(dummyMovies[0].overview)))
        onView(withId(R.id.imgBackdrop)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.imgPoster)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun loadTvShows() {
        onView(withText("Tv Show")).perform(ViewActions.click())
        onView(withId(R.id.rv_tv_show))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShows.size))
    }


    @Test
    fun loadDetailTvShow() {
        onView(withText("Tv Show")).perform(ViewActions.click())
        onView(withId(R.id.rv_tv_show)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                ViewActions.click()
            )
        )
        onView(withId(R.id.txtTitle)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtTitle)).check(ViewAssertions.matches(withText(dummyTvShows[0].title)))
        onView(withId(R.id.txtGenre)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtGenre)).check(ViewAssertions.matches(withText(dummyTvShows[0].genre)))
        onView(withId(R.id.txtRating)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtRating)).check(ViewAssertions.matches(withText(dummyTvShows[0].rating.toString())))
        onView(withId(R.id.txtOverview)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtOverview)).check(ViewAssertions.matches(withText(dummyTvShows[0].overview)))
        onView(withId(R.id.imgBackdrop)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.imgPoster)).check(ViewAssertions.matches(isDisplayed()))
    }
}