package com.jobik.shkiper.util.settings

import android.content.Context
import androidx.annotation.Keep
import com.jobik.shkiper.R

data class LocaleData(
    val name: String,
    val language: String
)

@Keep
enum class Localization(val localeKey: String) {
    EN("en"),
    ZH("zh");

    fun getLocalizedValue(context: Context): LocaleData {
        val string: LocaleData = when (name) {
            EN.name -> LocaleData(
                name = context.getString(R.string.en),
                language = context.getString(R.string.en_language)
            )

            ZH.name -> LocaleData(
                name = context.getString(R.string.zh),
                language = context.getString(R.string.zh_language)
            )

            else -> LocaleData(name = "NOT SUPPORTED", language = "NOT SUPPORTED")
        }
        return string
    }
}
