package com.alexandre.marcq.spotiguessr.config

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alexandre.marcq.spotiguessr.api.objects.playlist.Playlist

class ConfigViewModel(
    val playlist: Playlist
) : ViewModel() {

    private val _lengthIsWrong = MutableLiveData(true)
    val lengthIsWrong: LiveData<Boolean> = _lengthIsWrong

    /**
     * This function checks the input to make sure the values provided are valid.
     *
     * It will modify [_lengthIsWrong] regarding the result.
     *
     * @param text the input.
     */
    fun checkInput(text: Editable?) {
        with(text.toString()) {
            if (isNotEmpty()) {
                _lengthIsWrong.value = toInt() > playlist.playlistTrackNumber.total
                        || toInt() == 0
            } else {
                _lengthIsWrong.value = true
            }
        }
    }
}