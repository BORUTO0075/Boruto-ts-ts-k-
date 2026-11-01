package com.uzumaki

import android.content.Context
import com.lagradost.cloudstream3.plugins.Plugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class UzumakiPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(UzumakiProvider())
        registerMainAPI(WrestlingProvider())
    }
}
