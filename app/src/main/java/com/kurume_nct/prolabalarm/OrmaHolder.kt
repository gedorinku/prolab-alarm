package com.kurume_nct.prolabalarm

import android.content.Context
import com.kurume_nct.prolabalarm.model.OrmaDatabase

/**
 * Created by gedorinku on 2017/03/08.
 */
object OrmaHolder {

    lateinit var orma: OrmaDatabase
        private set

    fun initialize(context: Context) {
        orma = OrmaDatabase.Builder(context).build()
    }
}