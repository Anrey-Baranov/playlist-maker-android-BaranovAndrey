package com.example.playlistmaker.data.repository

import com.example.playlistmaker.data.dto.TracksSearchRequest
import com.example.playlistmaker.data.dto.TracksSearchResponse
import com.example.playlistmaker.domain.api.NetworkClient
import com.example.playlistmaker.domain.api.TracksRepository
import com.example.playlistmaker.domain.model.Track
import kotlinx.coroutines.delay

class TracksRepositoryImpl(
    private val networkClient: NetworkClient
) : TracksRepository {

    override suspend fun searchTracks(expression: String): List<Track> {

        val response = networkClient.doRequest(
            TracksSearchRequest(expression)
        )

        delay(1000)

        return if (response.resultCode == 200) {

            (response as TracksSearchResponse).results.map {

                val seconds = it.trackTimeMillis / 1000
                val minutes = seconds / 60
                val remainingSeconds = seconds % 60

                val time = "%02d:%02d".format(minutes, remainingSeconds)

                Track(
                    trackName = it.trackName,
                    artistName = it.artistName,
                    trackTime = time
                )
            }

        } else {
            emptyList()
        }
    }
}