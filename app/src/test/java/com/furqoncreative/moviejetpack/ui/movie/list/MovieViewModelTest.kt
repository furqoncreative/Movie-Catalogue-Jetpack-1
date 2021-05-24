package com.furqoncreative.moviejetpack.ui.movie.list

import junit.framework.TestCase
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MovieViewModelTest : TestCase() {
    private lateinit var viewModel: MovieViewModel

    @Before
    override fun setUp() {
        viewModel = MovieViewModel()
    }

    @Test
    fun testGetMovies() {
        val movies = viewModel.getMovies()
        Assert.assertNotNull(movies)
        Assert.assertEquals(10, movies.size)
    }
}