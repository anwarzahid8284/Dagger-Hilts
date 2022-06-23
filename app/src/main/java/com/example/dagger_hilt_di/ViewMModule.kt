package com.example.dagger_hilt_di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Named

@Module
@InstallIn(ViewModelComponent::class)
object ViewMModule {
    /**
     * viewmodel only use when module is for ViewModelComponent
     */
    @ViewModelScoped
    @Provides
    @Named("viewModuleString")
    fun injectedString() = "View Model Module String"
}