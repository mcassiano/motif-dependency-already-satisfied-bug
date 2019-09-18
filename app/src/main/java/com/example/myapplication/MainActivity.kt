package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


typealias ProfileId = Long
typealias PostId = Long


@motif.Scope
interface RootScope {
    fun mainScope(profileId: String, postId: String): MainScope

    @motif.Dependencies
    interface Dependencies {

    }
}

@motif.Scope
interface MainScope {
    fun profileId(): String
    fun postId(): String
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Kotlin activity")
        val rootScope = RootScopeImpl()
        val mainScope = rootScope.mainScope("profileId", "postId")

        textView1.text = mainScope.profileId()
        textView2.text = mainScope.postId()
    }
}

