package com.eros.data.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        FolderEntity::class,
        RoutineEntity::class,
        ExerciseEntity::class,
        WorkoutHistoryEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class ErosDatabase : RoomDatabase() {
    abstract fun folderDao(): FolderDao
    abstract fun routineDao(): RoutineDao
    abstract fun exerciseDao(): ExerciseDao
    abstract fun workoutHistoryDao(): WorkoutHistoryDao
}