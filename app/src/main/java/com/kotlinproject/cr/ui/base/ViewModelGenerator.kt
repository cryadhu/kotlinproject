package com.kotlinproject.cr.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kotlinproject.cr.rest.api.Helper
import com.kotlinproject.cr.rest.repo.Repository
import com.kotlinproject.cr.ui.main.viewModel.CoreViewModel

class ViewModelGenerator(private val helper: Helper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CoreViewModel::class.java)) {
            return CoreViewModel(Repository(helper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}