package com.furqoncreative.moviejetpack.utils

import com.furqoncreative.moviejetpack.R
import com.furqoncreative.moviejetpack.data.Movie
import com.furqoncreative.moviejetpack.data.TvShow

object DataDummy {
    fun generateDummyMovies(): ArrayList<Movie> {
        val movies = ArrayList<Movie>()

        movies.add(
            Movie(
                1,
                "A Star Is Born",
                7.5,
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                R.drawable.poster_a_start_is_born,
                "Drama, Romance, Music"
            )
        )

        movies.add(
            Movie(
                2,
                "Aquaman",
                6.9,
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                R.drawable.poster_aquaman,
                "Action, Adventure, Fantasy"
            )
        )

        movies.add(
            Movie(
                3,
                "Cold Pursuit",
                5.7,
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                R.drawable.poster_cold_persuit,
                "Action, Crime, Thriller"
            )
        )

        movies.add(
            Movie(
                4,
                "Avengers: Infinity War",
                8.3,
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                R.drawable.poster_infinity_war,
                "Adventure, Action, Science Fiction"
            )
        )

        movies.add(
            Movie(
                5,
                "Mary Queen of Scots",
                6.6,
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                R.drawable.poster_marry_queen,
                "Drama, History"
            )
        )

        movies.add(
            Movie(
                6,
                "Master Z: Ip Man Legacy",
                5.9,
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                R.drawable.poster_master_z,
                "Action"
            )
        )

        movies.add(
            Movie(
                7,
                "Mortal Engines ",
                6.1,
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                R.drawable.poster_mortal_engines,
                "Adventure, Science Fiction"
            )
        )

        movies.add(
            Movie(
                8,
                "Overlord",
                6.7,
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                R.drawable.poster_overlord,
                "Horror, War, Science Fiction"
            )
        )

        movies.add(
            Movie(
                9,
                "Robin Hood",
                5.9,
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                R.drawable.poster_robin_hood,
                "Adventure, Action, Thriller"
            )
        )

        movies.add(
            Movie(
                10,
                "Spider-Man: Into the Spider-Verse",
                8.4,
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                R.drawable.poster_spiderman,
                "Action, Adventure, Animation, Science Fiction, Comedy"
            )
        )

        return movies
    }

    fun generateDummyTvShows(): ArrayList<TvShow> {
        val tvShows = ArrayList<TvShow>()

        tvShows.add(
            TvShow(
                1,
                "Family Guy",
                7.0,
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                R.drawable.poster_family_guy,
                "Animation, Comedy"
            )
        )

        tvShows.add(
            TvShow(
                2,
                "Game of Thrones",
                8.4,
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                R.drawable.poster_god,
                "Sci-Fi & Fantasy, Drama, Action & Adventure"
            )
        )

        tvShows.add(
            TvShow(
                3,
                "Gotham",
                7.5,
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                R.drawable.poster_gotham,
                "Drama, Crime, Sci-Fi & Fantasy"
            )
        )

        tvShows.add(
            TvShow(
                4,
                "Grey's Anatomy",
                8.2,
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                R.drawable.poster_grey_anatomy,
                "Drama"
            )
        )

        tvShows.add(
            TvShow(
                5,
                "Marvel's Iron Fist",
                6.6,
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                R.drawable.poster_iron_fist,
                "Action & Adventure, Drama, Sci-Fi & Fantasy"
            )
        )

        tvShows.add(
            TvShow(
                6,
                "NCIS",
                7.4,
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                R.drawable.poster_ncis,
                "Crime, Action & Adventure, Drama"
            )
        )

        tvShows.add(
            TvShow(
                7,
                "Riverdale",
                8.6,
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                R.drawable.poster_riverdale,
                "Mystery, Drama, Crime"
            )
        )

        tvShows.add(
            TvShow(
                8,
                "Shameless",
                8.0,
                "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.",
                R.drawable.poster_shameless,
                "Drama, Comedy"
            )
        )

        tvShows.add(
            TvShow(
                9,
                "Supergirl",
                7.3,
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                R.drawable.poster_supergirl,
                "Drama, Sci-Fi & Fantasy, Action & Adventure"

            )
        )

        tvShows.add(
            TvShow(
                10,
                "Supernatural",
                8.2,
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                R.drawable.poster_supernatural,
                "Drama, Mystery, Sci-Fi & Fantasy"
            )
        )

        return tvShows
    }
}