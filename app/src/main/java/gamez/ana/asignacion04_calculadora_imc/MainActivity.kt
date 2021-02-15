package gamez.ana.asignacion04_calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var valorIMC = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso : EditText = findViewById(R.id.peso)
        val estatura : EditText = findViewById(R.id.estatura)
        val btnCalcular : Button = findViewById(R.id.btnCalcular)
        val imc : TextView = findViewById(R.id.imc)
        val range : TextView = findViewById(R.id.range)

        //evento de botones

        btnCalcular.setOnClickListener {
            
        }
    }

    //funciones
}