package com.kurume_nct.prolabalarm.viewmodel

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.kurume_nct.prolabalarm.BR

/**
 * Created by gedorinku on 2017/03/09.
 */
class AlarmViewModel : BaseObservable {

    private var _hour: Int
    var hour: Int
        @Bindable
        get() = _hour
        set(value) {
            _hour = value
            notifyPropertyChanged(BR.timeText)
        }

    private var _minute: Int
    var minute: Int
        @Bindable
        get() = _minute
        set(value) {
            _minute = value
            notifyPropertyChanged(BR.timeText)
        }

    var label: String

    var isRepeatedOnMonday: Boolean

    var isRepeatedOnTuesday: Boolean

    var isRepeatedOnWednesday: Boolean

    var isRepeatedOnThursday: Boolean

    var isRepeatedOnFriday: Boolean

    var isRepeatedOnSaturday: Boolean

    var isRepeatedOnSunday: Boolean

    private var _isEnabled: Boolean
    var isEnabled: Boolean
        @Bindable
        get() = _isEnabled
        set(value) {
            _isEnabled = value
            notifyPropertyChanged(BR.enabled)
        }


    val timeText: String
        @Bindable
        get() = "%d:%02d".format(hour, minute)

    constructor(hour: Int,
                minute: Int,
                label: String = "",
                isRepeatedOnMonday: Boolean = false,
                isRepeatedOnTuesday: Boolean = false,
                isRepeatedOnWednesday: Boolean = false,
                isRepeatedOnThursday: Boolean = false,
                isRepeatedOnFriday: Boolean = false,
                isRepeatedOnSaturday: Boolean = false,
                isRepeatedOnSunday: Boolean = false,
                isEnabled: Boolean = true) {
        this._hour = hour
        this._minute = minute
        this.label = label
        this.isRepeatedOnMonday = isRepeatedOnMonday
        this.isRepeatedOnTuesday = isRepeatedOnTuesday
        this.isRepeatedOnWednesday = isRepeatedOnWednesday
        this.isRepeatedOnThursday = isRepeatedOnThursday
        this.isRepeatedOnFriday = isRepeatedOnFriday
        this.isRepeatedOnSaturday = isRepeatedOnSaturday
        this.isRepeatedOnSunday = isRepeatedOnSunday
        this._isEnabled = isEnabled
    }
}
