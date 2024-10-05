package dev.alexisvillarruel.logingpcparcial_reciclyeview

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar
import dev.alexisvillarruel.logingpcparcial_reciclyeview.ui.home.HomeFragment

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        title = "Login"


    val emailSucces: String = "invitado@android.com"
    val passwordSucces: String = "invitado123"

    val etEmail: EditText = findViewById(R.id.etEmail)
    val etPassword: EditText = findViewById(R.id.etPassword)
    val btnLogin: Button = findViewById(R.id.btnLogin)
    //val navcontroller = findNavController()  PAra fragments

    btnLogin.setOnClickListener{
        val email: String = etEmail.text.trim().toString()
        val password: String = etPassword.text.trim().toString()

        if(email == emailSucces && password == passwordSucces){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
         //   navcontroller.navigate(R.id.recyclevwFragment)
        }
        val rootView: View = findViewById(android.R.id.content)
        Snackbar.make(rootView, "Credenciales incorrectas", Snackbar.LENGTH_SHORT).show()
     }
   }
}