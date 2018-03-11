package studio.roboto.communimate.util

import android.content.Context

class GenUtils {
    companion object {
        fun getUniqueId(context: Context): Int {
            val id: Int = context.getSharedPreferences("COMMUNIMATE", Context.MODE_PRIVATE).getInt("UNIQUE_ID", 1)
            context.getSharedPreferences("COMMUNIMATE", Context.MODE_PRIVATE).edit().putInt("UNIQUE_ID", id + 1).apply()
            return id
        }
    }
}