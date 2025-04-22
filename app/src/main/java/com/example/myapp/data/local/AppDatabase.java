package com.example.myapp.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;


import com.example.myapp.data.local.dao.UserDao;
import com.example.myapp.data.local.entities.UserEntity;


@Database(entities = {UserEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}