package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import motif.Dependencies


typealias ProfileId = Long
typealias PostId = Long


@motif.Scope
interface RootScope {
    fun mainActivityScope(profileId: Long, postId: Long): MainActivityScope

    @motif.Dependencies
    interface Dependencies {

    }
}

@motif.Scope
interface MainActivityScope {
    fun profileId(): Long
    fun postId(): Long
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rootScope = RootScopeImpl()
        val mainScope = rootScope.mainActivityScope(1, 3)

        textView1.text = mainScope.profileId().toString()
        textView2.text = mainScope.postId().toString()
    }
}

