package com.example.kuis.Data

object SingletonController {
    private val noteController:NoteController = NoteController()

    public fun getController():NoteController{
        return noteController
    }
}