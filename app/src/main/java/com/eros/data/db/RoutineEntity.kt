package com.eros.data.db

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.work.ForegroundInfo

@Entity(
    tableName = "routines",
    foreignKeys = [
        ForeignKey(
            entity = FolderEntity::class,
            parentColumns = ["id"],
            childColumns = ["folderId"],
        onDelete = ForeignKey.SET_NULL
        )
    ],
    indices = [Index("folderId")]
)
data class RoutineEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val folderId: Long?,
    val name: String,
    val notes: String
)
