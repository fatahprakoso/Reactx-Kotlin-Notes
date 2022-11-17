package com.example.kuis.Data

import io.reactivex.rxjava3.core.Observable
import java.util.*

class NoteController{
    // Object observable
    private lateinit var observer: Observable<LinkedList<Note>>

    // Data yang di-observer
    private lateinit var data: LinkedList<Note>

    init {
        data = LinkedList<Note>()
        data.add(Note("tes","tes"))
        observer = Observable.create<LinkedList<Note>> {
            it.onNext(data)
            it.onComplete()
        }
    }

    /**
     * digunakan untuk mengambil object Observable
     */
    public fun getObservable():Observable<LinkedList<Note>>{
        return this.observer
    }

    /**
     * melakukan update data, sehingga subscriber dari object Observable
     * observer dapat melakukan perubahan tampilan
     */
    public fun addData(title:String, content:String){
        data.add(Note(title,content))
        data = data
    }
}