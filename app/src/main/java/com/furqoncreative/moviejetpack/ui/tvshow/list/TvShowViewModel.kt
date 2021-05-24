package com.furqoncreative.moviejetpack.ui.tvshow.list

import androidx.lifecycle.ViewModel
import com.furqoncreative.moviejetpack.data.TvShow
import com.furqoncreative.moviejetpack.utils.DataDummy

class TvShowViewModel : ViewModel() {

    fun getTvShows(): ArrayList<TvShow> = DataDummy.generateDummyTvShows()

}