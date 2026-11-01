package com.uzumaki

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.ExtractorLink

class UzumakiProvider : MainAPI() {

    override var mainUrl = "https://hicine.xyz"
    override var name = "Uzumaki"

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

    override suspend fun load(
        url: String
    ): LoadResponse {
        throw ErrorLoadingException(
            "Hicine API integration is pending"
        )
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        return false
    }
}
