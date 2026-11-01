package com.fibtoon

import com.lagradost.cloudstream3.*

class FibToonProvider : MainAPI() {
    override var mainUrl = "https://fibtoon.top"
    override var name = "FibToon"
    override val hasMainPage = false
    override var lang = "hi"

    override val supportedTypes = setOf(TvType.Anime)

    override suspend fun search(
        query: String
    ): List<SearchResponse> {
        return emptyList()
    }
}
