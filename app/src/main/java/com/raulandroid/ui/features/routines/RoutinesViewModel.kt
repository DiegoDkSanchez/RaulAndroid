package com.raulandroid.ui.features.routines

import androidx.lifecycle.ViewModel
import com.raulandroid.repository.RaulRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RoutinesViewModel @Inject constructor(
    private val repository: RaulRepository
) : ViewModel() {

}