package com.example.myapp.di;

import android.content.Context;

import androidx.room.Room;


import com.example.myapp.data.local.AppDatabase;
import com.example.myapp.data.local.dao.UserDao;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@Module
@InstallIn(SingletonComponent.class)
public class DatabaseModule {

    @Provides
    @Singleton
    public static AppDatabase provideDatabase(@ApplicationContext Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, "app_db").build();
    }

    @Provides
    public static  UserDao provideUserDao(AppDatabase db) {
        return db.userDao();
    }
}