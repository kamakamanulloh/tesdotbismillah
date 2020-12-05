package com.kamak.tesdotbismillah.presenter

import com.kamak.tesdotbismillah.Header
import com.kamak.tesdotbismillah.Place
import com.kamak.tesdotbismillah.`interface`.PlaceView
import com.kamak.tesdotbismillah.retrofitApi.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PlacePresenter (val placeView: PlaceView){
    var status:Int = 0
    fun getPlace(){
        Api.getServicee()
                .getStatus()
                .enqueue(object :Callback<Place>{
                    override fun onResponse(call: Call<Place>, response: Response<Place>) {
                        if (response.isSuccessful){
                             status= response.body()?.statusCode!!
                            if (status==200){
                               getData()
                            }
                        }
                    }

                    override fun onFailure(call: Call<Place>, t: Throwable) {
                       placeView.onFailedPlace("Gagal")
                    }

                })

    }

    fun getData() {
        Api.getServicee()
                .getHeader()
                .enqueue(object :Callback<Header>{
                    override fun onResponse(call: Call<Header>, response: Response<Header>) {

                           placeView.onGetTitle(response.body()?.title.toString())


                    }

                    override fun onFailure(call: Call<Header>, t: Throwable) {
                        placeView.onFailedPlace("Gagal")
                    }

                })

    }
}