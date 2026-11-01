package com.wrestling

import android.content.Context
import com.lagradost.cloudstream3.plugins.Plugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class WrestlingPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(WrestlingProvider())
    }
}
