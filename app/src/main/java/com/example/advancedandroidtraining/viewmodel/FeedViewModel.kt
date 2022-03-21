package com.example.advancedandroidtraining.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.advancedandroidtraining.model.CountryModel

class FeedViewModel: ViewModel() {

    val countries = MutableLiveData<List<CountryModel>>()
    val countryError = MutableLiveData<Boolean>()
    val countryLoading = MutableLiveData<Boolean>()

    fun refreshData(){

        val country = CountryModel("1","asd","dsa","sss","aaa","cccc");
        val countrys = arrayListOf<CountryModel>(country)
        countries.value = countrys
        countryError.value = false
        countryLoading.value = false
    }

}