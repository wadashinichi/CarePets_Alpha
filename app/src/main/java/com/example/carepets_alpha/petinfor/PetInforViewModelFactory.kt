/* is a pattern for object initialization
to intialize the class that we want to hide its class
* */
package com.example.carepets_alpha.petinfor

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.carepets_alpha.database.PetDao

class PetInforViewModelFactory(private val dtSource: PetDao,
                               private val application: Application) : ViewModelProvider.Factory {
    @Suppress("uncheck_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PetInforViewModel::class.java)) {
            return PetInforViewModel(dtSource, application) as T
        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel class")
    }

}