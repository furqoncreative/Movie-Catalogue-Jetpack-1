package com.furqoncreative.moviejetpack.ui.tvshow.list

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.furqoncreative.moviejetpack.databinding.TvShowFragmentBinding
import com.furqoncreative.moviejetpack.ui.tvshow.detail.TvShowDetailActivity

class TvShowFragment : Fragment(), TvShowAdapter.TvShowItemListener {

    private lateinit var viewModel: TvShowViewModel
    private lateinit var binding: TvShowFragmentBinding
    private lateinit var adapter: TvShowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = TvShowFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            viewModel = ViewModelProvider(this).get(TvShowViewModel::class.java)
            val movies = viewModel.getTvShows()

            adapter = TvShowAdapter(this)
            adapter.setItems(movies)

            binding.rvTvShow.layoutManager = LinearLayoutManager(context)
            binding.rvTvShow.setHasFixedSize(true)
            binding.rvTvShow.adapter = adapter
        }
    }

    override fun onClicked(tvShowId: Int?) {
        val intent = Intent(requireContext(), TvShowDetailActivity::class.java)
        intent.putExtra("ID", tvShowId)
        startActivity(intent)
    }

}