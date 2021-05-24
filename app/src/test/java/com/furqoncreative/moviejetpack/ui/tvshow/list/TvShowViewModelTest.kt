package com.furqoncreative.moviejetpack.ui.tvshow.list

import junit.framework.TestCase
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest : TestCase() {
    private lateinit var viewModel: TvShowViewModel

    @Before
    override fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun testGetTvShow() {
        val tvShows = viewModel.getTvShows()
        Assert.assertNotNull(tvShows)
        Assert.assertEquals(10, tvShows.size)
    }
}