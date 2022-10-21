package com.example.doublelinkedlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dll=DoubleLinkedList<String>()
        dll.insert("harry")
        dll.insert("c")
        dll.insert("s")
        dll.insert("sak")

        dll.print()
        dll.delete()
        dll.print()

    }
}