package com.app.todo_listapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [NotesEntity::class],
    exportSchema = false,
    version = 1
)
abstract class NotesDatabase : RoomDatabase() {

    abstract val notesDao: NotesDao



}