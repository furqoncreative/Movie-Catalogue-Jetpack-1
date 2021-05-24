package com.furqoncreative.moviejetpack.ui.tvshow.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.furqoncreative.moviejetpack.databinding.ActivityTvShowDetailBinding

class TvShowDetailActivity : AppCompatActivity() {

    private lateinit var viewModel: TvShowDetailViewModel
    private lateinit var binding: ActivityTvShowDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTvShowDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(TvShowDetailViewModel::class.java)
        intent?.getIntExtra("ID", 0)?.let { viewModel.setSelectedTvShow(it) }

        val movie = viewModel.getTvShow()

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