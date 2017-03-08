package com.kurume_nct.prolabalarm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kurume_nct.prolabalarm.model.Alarm
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.sql.Timestamp
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val orma = OrmaHolder.orma

        Observable.fromCallable {
            orma.transactionSync {
                val now = System.currentTimeMillis()

                val statement = orma.prepareInsertIntoAlarm()

                for (i in 1..10) {
                    val alarm = Alarm(0, Date(now))
                    statement.execute(alarm)
                }

                orma.selectFromAlarm().forEach {
                    Log.d("db", it.id.toString() + "::" + it.alarmTime.toString())
                }
            }
        }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe()
    }
}
