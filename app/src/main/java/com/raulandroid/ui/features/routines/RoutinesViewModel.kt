package com.raulandroid.ui.features.routines

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raulandroid.models.Routine
import com.raulandroid.repository.RaulRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.util.Calendar
import javax.inject.Inject

@HiltViewModel
class RoutinesViewModel @Inject constructor(
    private val repository: RaulRepository
) : ViewModel() {
    private val routines = MutableLiveData<List<Routine>>()

    fun routines(): LiveData<List<Routine>> = routines

    fun addRoutine() {
        val now = Calendar.getInstance().time
        val routine = Routine(now, listOf())
        viewModelScope.launch {
            val arrayList: ArrayList<Routine> = ArrayList(routines.value ?: arrayListOf())
            arrayList.add(routine)
            routines.postValue(arrayList)
        }
    }
}