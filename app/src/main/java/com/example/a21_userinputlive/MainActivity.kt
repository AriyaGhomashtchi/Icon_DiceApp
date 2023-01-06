package com.example.a21_userinputlive

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.materialswitch.MaterialSwitch
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateButton = findViewById<Button>(R.id.generate_button)

        generateButton.setOnClickListener {
            generateGreeting()
        }
    }

    private fun generateGreeting() {
        val nameEdit = findViewById<EditText>(R.id.name_edit)
        val surnameEdit = findViewById<EditText>(R.id.surname_edit)
        val politeSwitch = findViewById<MaterialSwitch>(R.id.polite_switch)

        val greetingText = findViewById<TextView>(R.id.greeting_text)

        val name: String = nameEdit.text.toString()
        val surname: String = surnameEdit.text.toString()
        val polite: Boolean = politeSwitch.isChecked

        if (polite) {
            greetingText.text = getString(R.string.greeting_polite, name, surname)
        } else {
            greetingText.text = getString(R.string.greeting_normal, name)
        }
    }
}
