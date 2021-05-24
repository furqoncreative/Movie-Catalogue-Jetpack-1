package com.furqoncreative.moviejetpack.ui.tvshow.detail

import com.furqoncreative.moviejetpack.utils.DataDummy
import junit.framework.TestCase
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TvShowDetailViewModelTest : TestCase() {
    private lateinit var viewModel: TvShowDetailViewModel
    private val dummyTvShow = DataDummy.generateDummyTvShows()[0]
    private val tvShowId = dummyTvShow.id

    @Before
    override fun setUp() {
        viewModel = TvShowDetailViewModel()
        viewModel.setSelectedTvShow(tvShowId)
    }

    @Test
    fun testGetTvShow() {
        viewModel.setSelectedTvShow(dummyTvShow.id)
        val tvShow = viewModel.getTvShow()
        Assert.assertNotNull(tvShow)
        assertEquals(dummyTvShow.id, tvShow.id)
        assertEquals(dummyTvShow.posterImage, tvShow.posterImage)
        assertEquals(dummyTvShow.genre, tvShow.genre)
        assertEquals(dummyTvShow.overview, tvShow.overview)
        assertEquals(dummyTvShow.rating, tvShow.rating)
        assertEquals(dummyTvShow.title, tvShow.title)
    }
}