package com.example.kuis.Data

class Note constructor(val title:String,val content:String) {
    public fun getShortContent():String{
        val contentLength:Int = content.length

        if (contentLength<100) return content.substring(0,contentLength)
        return "${content.substring(0, 100)}..."
    }
}