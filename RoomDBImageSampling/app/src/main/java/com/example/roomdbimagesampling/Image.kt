package com.example.roomdbimagesampling

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.File

@Entity
data class Image(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
)