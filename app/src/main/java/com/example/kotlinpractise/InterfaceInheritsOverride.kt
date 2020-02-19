package com.example.kotlinpractise

open class MediaPlayer { //Here it is Parent class with some methods, open is used for give access to other classes
    open fun start() {
        println("Media Player Started")
    }

    open fun stop() {
        println("Media Player Stopped")
    }

    open fun pause() {
        println("Media Player Paused")
    }

    open fun resume() {
        println("Media Player Resumed")
    }
}

open class Mp3(private var songName: String) : MediaPlayer(),
    DvdPlayer { // here Mp3 class extends parent class and implements interface, here primary Constructor is used

    fun display() { //child class method
        println(songName)
    }

    /*
    * parent class methods inherited*/
    override fun start() {

        println("Mp3 Audio is Started")
    }

    override fun pause() {
        println("Mp3 Audio is Paused")
    }

    override fun resume() {
        println("Mp3 Audio is Resumed")
    }

    override fun stop() {
        println("Mp3 Audio is Stopped")
    }

    /*
    * Interface methods inherits, through interfaces we can achieve Multiple inheritance */
    override fun player() {
        println("Im a Dvd Player")
    }

    override fun MxPlayer() {
        println("Im a MXPlayer")
    }
}

class Mp4(private var videoName: String) :
    MediaPlayer() { //here also uses primary constructor to mention the name of the videoSong

    fun disp() {  //child class method
        println(videoName)
    }

    /*
    * here parent class methods inherited*/
    override fun start() {
        println("Mp4 Video is Started")
    }

    override fun stop() {
        println("Mp4 Video is Stopped")
    }

    override fun pause() {
        println("Mp4 Video is Paused")
    }

    override fun resume() {
        println("Mp4 Video is Resumed")
    }
}

interface DvdPlayer { //finally Interface
    fun player()
    fun MxPlayer()
}

/*
* here main function to execute the above conditions and to produce output*/
fun main() {
    val mp3 = Mp3("Laila O Laila")
    val mp4 = Mp4("Heart wants What it want")
    mp3.start()
    mp3.pause()
    mp3.resume()
    mp3.stop()
    mp3.player()
    mp3.MxPlayer()
    mp3.display()
    mp4.disp()
    mp4.start()
    mp4.pause()
    mp4.resume()
    mp4.stop()
}