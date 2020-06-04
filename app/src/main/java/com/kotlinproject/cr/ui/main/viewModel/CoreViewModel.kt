package com.kotlinproject.cr.ui.main.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.kotlinproject.cr.rest.repo.Repository
import com.kotlinproject.cr.utils.Resource
import kotlinx.coroutines.Dispatchers


class CoreViewModel(private val repository: Repository) : ViewModel() {

    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = repository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}