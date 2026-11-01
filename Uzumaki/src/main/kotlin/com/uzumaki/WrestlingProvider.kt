package com.uzumaki

import com.lagradost.cloudstream3.*

class WrestlingProvider : MainAPI() {

    override var mainUrl = "https://fibwatch.art/"
    override var name = "Wrestling"

    override val hasMainPage = false
    override var lang = "en"

    override val supportedTypes = setOf(
        TvType.Movie,
        TvType.TvSeries
    )

    override suspend fun search(
        query: String
    ): List<SearchResponse> {
        return emptyList()
    }
}
