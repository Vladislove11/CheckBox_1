package com.example.checkbox

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var textET: EditText
    private lateinit var textTV: TextView

    private lateinit var buttonSaveBTN: Button
    private lateinit var buttonDeleteBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textET = findViewById(R.id.textEnterET)
        textTV = findViewById(R.id.textResultTV)
        buttonSaveBTN = findViewById(R.id.buttonSaveBTN)
        buttonDeleteBTN = findViewById(R.id.buttonDeleteBTN)

        buttonSaveBTN.setOnClickListener{view ->
            textTV.setText(textET.text)
            textET.text.clear()
        }

        buttonDeleteBTN.setOnClickListener{view ->
            Snackbar
                .make(
                    view,
                    "Подтвердить удаление",
                    Snackbar.LENGTH_LONG
                )
                .setAction("Удалить"){
                    Snackbar.make(
                        view,
                        "Данные удалены",
                        Snackbar.LENGTH_LONG
                    ).show()
                    textTV.setText("")
                }.show()
        }
    }//    fun onClick(view: View) {
//        Snackbar
//            .make(
//                view,
//                "",
//                Snackbar.LENGTH_LONG
//            )
//            .setAction("Вернуть как было"){
//                Snackbar.make(
//                    view,
//                    "Всё вернулось на свои места",
//                    Snackbar.LENGTH_LONG
//                ).show()
//            }.show()
//    }
}