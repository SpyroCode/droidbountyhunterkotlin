package edu.training.droidbountyhunterkotlin.models

import android.os.Parcel
import android.os.Parcelable
import android.provider.ContactsContract

data class Fugitivo @JvmOverloads constructor (
    val id: Int = 0,
    var name: String = "",
    var status: Int = 0,
    var photo: String="",
    var latitude : Double = 0.0 ,
    var longitude : Double = 0.0
    ) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readDouble()

    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeInt(status)
        parcel.writeString(photo)
        parcel.writeDouble( latitude )
        parcel.writeDouble( longitude )
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<Fugitivo> {
        override fun createFromParcel(parcel: Parcel): Fugitivo {
            return Fugitivo(parcel)
        }

        override fun newArray(size: Int): Array<Fugitivo?> {
            return arrayOfNulls(size)
        }
    }
}