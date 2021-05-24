package com.furqoncreative.moviejetpack.ui.tvshow.detail

import androidx.lifecycle.ViewModel
import com.furqoncreative.moviejetpack.data.TvShow
import com.furqoncreative.moviejetpack.utils.DataDummy

class TvShowDetailViewModel : ViewModel() {
    private var tvShowId: Int? = null

    fun setSelectedTvShow(tvShowId: Int) {
        this.tvShowId = tvShowId
    }

    fun getTvShow(): TvShow {
        lateinit var tvShow: TvShow
        val tvShows = DataDummy.generateDummyTvShows()
        for (tvShowItem in tvShows) {
            if (tvShowItem.id == tvShowId) {
                tvShow = tvShowItem
            }
        }
        return tvShow
    }
}