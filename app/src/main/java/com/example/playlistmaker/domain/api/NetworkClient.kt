package com.example.playlistmaker.domain.api

import com.example.playlistmaker.data.network.BaseResponse

interface NetworkClient {
    fun doRequest(dto: Any): BaseResponse
}