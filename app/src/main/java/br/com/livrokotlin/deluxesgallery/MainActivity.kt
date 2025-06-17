package br.com.livrokotlin.deluxesgallery

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGallery = findViewById<MaterialButton>(R.id.btnGallery)
        val btnAbout = findViewById<MaterialButton>(R.id.btnAbout)

        btnGallery.setOnClickListener {
            val intent = Intent(this@MainActivity, GalleryActivity::class.java)
            startActivity(intent)
        }

        btnAbout.setOnClickListener {
            Toast.makeText(this, "Sobre o aplicativo", Toast.LENGTH_SHORT).show()
            // Aqui você pode adicionar navegação para uma tela "Sobre" no futuro
        }
    }
}
