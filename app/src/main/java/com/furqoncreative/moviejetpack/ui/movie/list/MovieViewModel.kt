package com.furqoncreative.moviejetpack.ui.movie.list

import androidx.lifecycle.ViewModel
import com.furqoncreative.moviejetpack.data.Movie
import com.furqoncreative.moviejetpack.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovies(): ArrayList<Movie> = DataDummy.generateDummyMovies()

}