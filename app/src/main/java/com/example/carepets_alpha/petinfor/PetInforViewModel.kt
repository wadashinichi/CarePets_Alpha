/* handle button clicks
interact with database via DAO
provide data to the UI via LiveData
* */
package com.example.carepets_alpha.petinfor

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.carepets_alpha.database.PetDao

class PetInforViewModel(val db: PetDao, application: Application) : AndroidViewModel(application) {

}