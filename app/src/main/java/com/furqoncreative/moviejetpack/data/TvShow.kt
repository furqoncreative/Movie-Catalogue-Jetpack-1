package com.furqoncreative.moviejetpack.data

data class TvShow(
    val id: Int,
    val title: String,
    val rating: Double,
    val overview: String,
    val posterImage: Int,
    val genre: String
)