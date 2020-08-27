package com.example.firestoredemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.type.Date
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val TAG: String by lazy {
        MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Firebase.firestore

//         Create a new user with a first and last name
        val user = hashMapOf(
                "first" to "Ada",
                "last" to "Lovelace",
                "born" to 1815
        )

// Add a new document with a generated ID
//        db.collection("users").document("tablet1")
//                .set(user)
//                .addOnSuccessListener {
//                    Log.d(TAG, "DocumentSnapshot added with ID: tablet1")
//                }
//                .addOnFailureListener { e ->
//                    Log.w(TAG, "Error adding document", e)
//                }

        updatebtn.setOnClickListener {
//            val firstName = firstNameET.text.toString()
//            db.collection("users").document("tablet3").update("first", firstName )
//                    .addOnSuccessListener {
//                        Log.d(TAG, "DocumentSnapshot added with ID: tablet1")
//                    }
//                    .addOnFailureListener { e ->
//                        Log.w(TAG, "Error adding document", e)
//                    }

            val firstName = firstNameET.text.toString()
            db.collection("users").document("tablet4")
                .set(hashMapOf( "first" to firstName, "date" to Date()))
                .addOnSuccessListener {
                    Log.d(TAG, "DocumentSnapshot added with ID: tablet1")
                }
                .addOnFailureListener { e ->
                    Log.w(TAG, "Error adding document", e)
                }

        }


//        val database = Firebase.database
//        val myRef = database.getReference("tablet1")
//        myRef.setValue("changing this")

    }
}