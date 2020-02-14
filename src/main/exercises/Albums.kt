package main.exercises

data class Album(val title: String, val year: Int, val month: Int, val day: Int, val tracks: List<Track>)
data class Track(val title: String, val durationInSeconds: Int)

val pinkFloyd = listOf(
    Album("The Dark Side of the Moon", 1973, 2, 1,
        listOf(Track("Speak to Me", 90),
            Track("Breathe", 163),
            Track("On he Run", 216),
            Track("Time", 421),
            Track("The Great Gig in the Sky", 276),
            Track("Money", 382),
            Track("Us and Them", 462),
            Track("Any Color You Like", 205),
            Track("Brain Damage", 228),
            Track("Eclipse", 123)
        )
    ))

fun totalDurationOf(albums: List<Album>): List<Pair<String, Int>> {
    return albums.map {
        Pair(it.title, totalDurationOf(it))
    }
}

fun totalDurationOf(album: Album): Int {
    return album.tracks.sumBy { it.durationInSeconds }
}

fun tracksShorterThan(limit: Int) {
    return
}
