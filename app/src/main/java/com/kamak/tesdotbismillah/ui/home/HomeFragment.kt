package com.kamak.tesdotbismillah.ui.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kamak.tesdotbismillah.ContentItem
import com.kamak.tesdotbismillah.R
import com.kamak.tesdotbismillah.`interface`.PlaceView
import com.kamak.tesdotbismillah.presenter.PlacePresenter
import kotlinx.android.synthetic.main.home_fragment.*
import org.jetbrains.anko.support.v4.alert


class HomeFragment : Fragment(),PlaceView {
    lateinit var placePresenter: PlacePresenter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.home_fragment, container, false)
        placePresenter= PlacePresenter(this)
        placePresenter.getPlace()
        return root
    }

    override fun onGetTitle(title: String) {
        tvtitle.text=title
    }

    override fun onGetContent(content: List<ContentItem>) {

    }

    override fun onFailedPlace(msg: String) {
        alert {
            message="Gagal"
        }.show()


    }


}