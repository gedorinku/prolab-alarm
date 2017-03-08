package com.kurume_nct.prolabalarm

import android.app.Application

/**
 * Created by gedorinku on 2017/03/08.
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        OrmaHolder.initialize(this)
    }
}