package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) :ViewModel() {
    //the final score
    var score = finalScore

    private lateinit var viewModel: ScoreViewModel
    private lateinit var viewModelFactory: ScoreViewModelFactory

    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}