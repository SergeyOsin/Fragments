package pnzgu.rmp.fragmentslab.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Это первый фрагмент!"
    }
    val text: LiveData<String> = _text
}