package com.pr.kotlin_dagger_hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideTestString()="This is a string will inject777"

    @Provides
    fun provideFirebase():Firebase{
        val firebase=Firebase()
        firebase.connect()
        return firebase
    }
}