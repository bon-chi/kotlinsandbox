package kotlinsandbox

import org.jetbrains.annotations.Nullable
import java.util.Calendar
import java.util.Locale
import arrow.core.Option
import java.util.*

class MyCalendar {
    companion object {
        fun hello(): Option<String> {
            val calendar: Calendar = Calendar.getInstance()
            val list = ArrayList<Int>()
            calendar.set(Calendar.YEAR, 2006)
            calendar.set(Calendar.MONTH, 12)
            calendar.set(Calendar.DATE, 10)
            var str: String? = calendar.getDisplayName(Calendar.YEAR, Calendar.SHORT_FORMAT,  Locale("ja","JP"))
//            var str: String? = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.JAPANESE);
            return  Option.fromNullable(str)
        }
    }
}