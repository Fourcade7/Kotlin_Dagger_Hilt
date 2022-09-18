package com.pr.kotlin_dagger_hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    @Named("name")
    fun provideName()="Fourcade"

    @Singleton
    @Provides
    @Named("fullname")
    fun provideFullname()="Aminov Fourcade"

    @Provides
    fun provideFirebase():Firebase{
        val firebase=Firebase()
        firebase.connect()
        return firebase
    }
}