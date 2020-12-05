package com.kamak.tesdotbismillah.`interface`

import com.kamak.tesdotbismillah.ContentItem

interface PlaceView {

    fun onGetTitle(title:String)
    fun onGetContent(content:List<ContentItem>)
    fun onFailedPlace(msg:String)




}