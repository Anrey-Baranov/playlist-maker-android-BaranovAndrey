package com.example.playlistmaker.data.dto

import com.example.playlistmaker.data.network.BaseResponse

class TracksSearchResponse(
    val results: List<TrackDto>
) : BaseResponse()