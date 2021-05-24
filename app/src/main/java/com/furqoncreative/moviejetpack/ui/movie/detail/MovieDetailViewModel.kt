package com.furqoncreative.moviejetpack.ui.movie.detail

import androidx.lifecycle.ViewModel
import com.furqoncreative.moviejetpack.data.Movie
import com.furqoncreative.moviejetpack.utils.DataDummy

class MovieDetailViewModel : ViewModel() {
    private var movieId: Int? = null

    fun setSelectedMovie(movieId: Int) {
        this.movieId = movieId
    }

    fun getMovie(): Movie {
        lateinit var movie: Movie
        val movies = DataDummy.generateDummyMovies()
        for (movieItem in movies) {
            if (movieItem.id == movieId) {
                movie = movieItem
            }
        }
        return movie
    }

}