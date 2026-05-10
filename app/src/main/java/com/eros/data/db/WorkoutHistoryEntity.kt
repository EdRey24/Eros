package com.eros.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workout_history")
data class WorkoutHistoryEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val routineNameSnapshot: String,
    val startTimeMillis: Long,
    val endTimeMillis: Long,
    val totalVolumeLbs: Double
)
