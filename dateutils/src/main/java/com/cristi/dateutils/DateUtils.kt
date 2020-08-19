package com.cristi.dateutils

import java.util.*

/**
 * Created by cristiandregan
 * on 19/08/2020.
 */
object DateUtils {
    fun Date.isToday(): Boolean {
        return isSameDayWith(Date())
    }

    fun Date.isTomorrow(): Boolean {
        val cal = Calendar.getInstance()
        cal.time = Date()
        cal.add(Calendar.DAY_OF_MONTH, 1)
        return isSameDayWith(cal.time)
    }

    fun Date.isSameDayWith(date: Date): Boolean {
        val cal1 = Calendar.getInstance()
        val cal2 = Calendar.getInstance()

        cal1.time = this
        cal2.time = date

        return cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) &&
                cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)
    }
}