package com.furqoncreative.moviejetpack.ui.movie.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.furqoncreative.moviejetpack.databinding.AcitivityMovieDetailBinding

class MovieDetailActivity : AppCompatActivity() {

    private lateinit var viewModel: MovieDetailViewModel
    private lateinit var binding: AcitivityMovieDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AcitivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MovieDetailViewModel::class.java)
        intent?.getIntExtra("ID", 0)?.let { viewModel.setSelectedMovie(it) }

        val movie = viewModel.getMovie()

        Glide.with(binding.root)
            .load(movie.posterImage)
            .into(binding.imgPoster)

        Glide.with(binding.root)
            .load(movie.posterImage)
            .into(binding.imgBackdrop)

        binding.txtTitle.text = movie.title
        binding.txtOverview.text = movie.overview
        binding.txtRating.text = movie.rating.toString()
        binding.txtGenre.text = movie.genre

        binding.imgBack.setOnClickListener {
            onBackPressed()
        }
    }

}