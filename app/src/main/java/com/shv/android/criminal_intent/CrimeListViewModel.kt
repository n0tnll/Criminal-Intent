package com.shv.android.criminal_intent

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
//    private val crimeRepository = CrimeRepository.get()
//    val crimesListLiveData = crimeRepository.getCrimes()
    val crimes = mutableListOf<Crime>()

    init {
        for (i in 0 until 20) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crime.requiresPolice = (0..1).random()
            crimes += crime
        }
    }
}