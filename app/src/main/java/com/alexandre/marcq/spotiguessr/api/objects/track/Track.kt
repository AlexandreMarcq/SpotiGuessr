package com.alexandre.marcq.spotiguessr.api.objects.track

import android.os.Parcelable
import com.alexandre.marcq.spotiguessr.api.objects.artist.Artist
import kotlinx.android.parcel.Parcelize

/**
 * A track.
 *
 * This class is used to represent a track retrieved from Spotify's API.
 *
 * @property artists the artists in the track.
 * @property id the identifier of the track.
 * @property name the name of the track.
 */
@Parcelize
class Track(
    val artists: List<Artist>,
    val id: String,
    val name: String
) : Parcelable
