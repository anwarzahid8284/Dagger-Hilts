package com.example.dagger_hilt_di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


/**
 * InstallIn notation used for the scope of module
 * if you pass SingletonComponent its scope till to application exit
 * if you pass activity component then its scope the activity
 * if you pass fragment component then its scope to the fragment
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    /**
     * singleton only use when module is for SingletonComponent
     */
    @Singleton
    @Provides
    @Named("singletonModuleString")
    fun injectedString()= "singleton module string"
}