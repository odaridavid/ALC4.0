package com.lca.odari.alc40

import android.app.Application
import timber.log.Timber

/**
 * Created By David Odari
 * On 11/07/19
 *
 **/
class ALCApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}