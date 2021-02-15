package gamez.ana.asignacion04_calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var valorIMC : Double = 0.0
    var pesoTemp : Double = 0.0
    var estaturaTemp : Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso : EditText = findViewById(R.id.peso) as EditText
        val estatura : EditText = findViewById(R.id.estatura) as EditText
        val btnCalcular : Button = findViewById(R.id.btnCalcular)
        val imc : TextView = findViewById(R.id.imc)
        val range : TextView = findViewById(R.id.range)

        //evento de botones

        btnCalcular.setOnClickListener {
            pesoTemp = peso.text.toString().toDouble()
            estaturaTemp = estatura.text.toString().toDouble()

            valorIMC = ((pesoTemp) / (Math.pow(estaturaTemp, 2.0)))

            imc.visibility = View.VISIBLE
            imc.setText(valorIMC.toString())

        }
    }

    //funciones


}