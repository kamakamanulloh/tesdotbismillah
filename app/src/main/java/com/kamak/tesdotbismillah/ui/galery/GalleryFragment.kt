package com.kamak.tesdotbismillah.ui.galery

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kamak.tesdotbismillah.R

class GalleryFragment : Fragment() {





    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.gallery_fragment, container, false)
        return root
    }


}