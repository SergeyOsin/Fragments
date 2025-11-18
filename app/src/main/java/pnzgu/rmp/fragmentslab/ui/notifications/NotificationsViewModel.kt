package pnzgu.rmp.fragmentslab.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Это третий фрагмент!"
    }
    val text: LiveData<String> = _text
}