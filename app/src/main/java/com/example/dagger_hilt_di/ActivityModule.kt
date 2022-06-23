package com.example.dagger_hilt_di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {
    /**
     * activityscope only use when module is for ActivityComponent
     */
    @ActivityScoped
    @Provides
    @Named("activityMString")
    fun injectedString(
        @ApplicationContext context: Context,
        @Named("singletonModuleString") getActivityString: String
    ) = "${context.getString(R.string.app_name)} and $getActivityString"
}