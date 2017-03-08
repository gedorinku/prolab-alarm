package com.kurume_nct.prolabalarm.model

import android.support.annotation.Nullable
import com.github.gfx.android.orma.annotation.Column
import com.github.gfx.android.orma.annotation.PrimaryKey
import com.github.gfx.android.orma.annotation.Setter
import com.github.gfx.android.orma.annotation.Table
import org.joda.time.DateTimeConstants
import java.util.*

/**
 * Created by gedorinku on 2017/03/07.
 */
@Table
class Alarm {

    @PrimaryKey
    val id: Long

    @Column
    val alarmTime: Date

    @Column
    val label: String

    @Column
    val isEnabled: Boolean

    @Nullable
    @Column
    val repeatFlags: Int

    constructor(
            @Setter("id") id: Long,
            @Setter("alarmTime") alarmTime: Date,
            @Setter("label") label: String,
            @Setter("isEnabled") isEnabled: Boolean,
            @Setter("repeatFlags") repeatFlags: Int) {
        this.id = id
        this.alarmTime = alarmTime
        this.label = label
        this.isEnabled = isEnabled
        this.repeatFlags = repeatFlags
    }

    constructor(id: Long, alarmTime: Date) {
        this.id = id
        this.alarmTime = alarmTime
        this.label = ""
        this.isEnabled = true
        this.repeatFlags = 0
    }

    enum class RepeatDay(flag: Int) {
        MONDAY(1 shl DateTimeConstants.MONDAY),
        TUESDAY(1 shl DateTimeConstants.TUESDAY),
        WEDNESDAY(1 shl DateTimeConstants.WEDNESDAY),
        THURSDAY(1 shl DateTimeConstants.THURSDAY),
        FRIDAY(1 shl DateTimeConstants.FRIDAY),
        SATURDAY(1 shl DateTimeConstants.SATURDAY),
        SUNDAY(1 shl DateTimeConstants.SUNDAY)
    }
}