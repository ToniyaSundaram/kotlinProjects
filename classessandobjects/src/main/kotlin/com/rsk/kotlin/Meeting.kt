package com.rsk.kotlin

class Meeting (val title:String){
    var location= ""
    @JvmField
    var desc="Borad meeting"

    companion object {
        @JvmField
        var APP_VERSION= 1
    }

}