package com.furqoncreative.moviejetpack.ui.movie.detail

import com.furqoncreative.moviejetpack.utils.DataDummy
import junit.framework.TestCase
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MovieDetailViewModelTest : TestCase() {
    private lateinit var viewModel: MovieDetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovies()[0]
    private val movieId = dummyMovie.id

    @Before
    override fun setUp() {
        viewModel = MovieDetailViewModel()
        viewModel.setSelectedMovie(movieId)
    }

    @Test
    fun testGetTvShow() {
        viewModel.setSelectedMovie(dummyMovie.id)
        val movie = viewModel.getMovie()
        Assert.assertNotNull(movie)
        assertEquals(dummyMovie.id, movie.id)
        assertEquals(dummyMovie.posterImage, movie.posterImage)
        assertEquals(dummyMovie.genre, movie.genre)
        assertEquals(dummyMovie.overview, movie.overview)
        assertEquals(dummyMovie.rating, movie.rating)
        assertEquals(dummyMovie.title, movie.title)
    }
}