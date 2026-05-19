package com.example.playlistmaker.creator

import com.example.playlistmaker.data.dto.TrackDto

class Storage {

    private val listTracks = listOf(
        // Slipknot
        TrackDto("Duality", "Slipknot", 212000),
        TrackDto("Psychosocial", "Slipknot", 243000),
        TrackDto("Before I Forget", "Slipknot", 238000),
        TrackDto("Snuff", "Slipknot", 246000),
        TrackDto("The Devil in I", "Slipknot", 342000),
        TrackDto("Unsainted", "Slipknot", 260000),
        TrackDto("Wait and Bleed", "Slipknot", 167000),
        TrackDto("Vermilion", "Slipknot", 315000),
        TrackDto("People = Shit", "Slipknot", 215000),
        TrackDto("Dead Memories", "Slipknot", 253000),

        // Михаил Елизаров (песни из романа "Библиотекарь" и другие)
        TrackDto("Песня библиотекаря", "Михаил Елизаров", 210000),
        TrackDto("Старая школа", "Михаил Елизаров", 185000),
        TrackDto("Поминальная", "Михаил Елизаров", 198000),
        TrackDto("Про книгу", "Михаил Елизаров", 223000),
        TrackDto("Колыбельная", "Михаил Елизаров", 175000),
        TrackDto("Про гвозди", "Михаил Елизаров", 192000),
        TrackDto("Братская", "Михаил Елизаров", 240000),
        TrackDto("Похоронная", "Михаил Елизаров", 218000),

        // НонАдоптанты — Алкоголики не люди
        TrackDto("Алкоголики не люди", "НонАдоптанты", 189000),
        TrackDto("Пьяная ночь", "НонАдоптанты", 210000),
        TrackDto("Жизнь в кайф", "НонАдоптанты", 178000),
        TrackDto("На дне", "НонАдоптанты", 195000),
        TrackDto("Токсичный человек", "НонАдоптанты", 203000),

        // Dead Blonde — Банкомат
        TrackDto("Банкомат", "Dead Blonde", 185000),
        TrackDto("Мальчик на сковороде", "Dead Blonde", 170000),
        TrackDto("Классная", "Dead Blonde", 192000),
        TrackDto("Веном", "Dead Blonde", 188000),
        TrackDto("Школа", "Dead Blonde", 176000),
        TrackDto("Мама прости", "Dead Blonde", 200000)
    )

    fun search(request: String): List<TrackDto> {
        if (request.isEmpty()) return emptyList()
        return listTracks.filter {
            it.trackName.lowercase().contains(request.lowercase()) ||
                    it.artistName.lowercase().contains(request.lowercase())
        }
    }
}