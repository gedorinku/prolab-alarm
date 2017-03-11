package com.kurume_nct.prolabalarm.view.dummy

import com.kurume_nct.prolabalarm.model.Alarm
import com.kurume_nct.prolabalarm.viewmodel.AlarmViewModel
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val items: MutableList<AlarmViewModel> = ArrayList()

    private val COUNT = 25

    init {
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: AlarmViewModel) {
        items.add(item)
    }

    private fun createDummyItem(position: Int): AlarmViewModel {
        return AlarmViewModel(12, position)
    }
}
