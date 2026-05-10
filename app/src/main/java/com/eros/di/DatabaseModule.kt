package com.eros.di

import android.content.Context
import androidx.room.Insert
import androidx.room.Room
import com.eros.data.db.ErosDatabase
import com.eros.data.db.ExerciseDao
import com.eros.data.db.FolderDao
import com.eros.data.db.RoutineDao
import com.eros.data.db.WorkoutHistoryDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.annotation.Signed
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideErosDatabase(@ApplicationContext context: Context): ErosDatabase {
        return Room.databaseBuilder(
            context,
            ErosDatabase::class.java,
            "eros_database"
        )
            .fallbackToDestructiveMigration(true)
            .build()
    }

    @Provides
    @Singleton
    fun provideFolderDao(database: ErosDatabase): FolderDao = database.folderDao()

    @Provides
    @Singleton
    fun provideRoutineDao(database: ErosDatabase): RoutineDao = database.routineDao()

    @Provides
    @Singleton
    fun provideExerciseDao(database: ErosDatabase): ExerciseDao = database.exerciseDao()

    @Provides
    @Singleton
    fun provideWorkoutHistoryDao(database: ErosDatabase): WorkoutHistoryDao = database.workoutHistoryDao()
}