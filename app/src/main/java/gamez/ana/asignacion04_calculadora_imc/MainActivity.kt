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


        peso.setOnClickListener() {
            peso.setText("")
        }

        estatura.setOnClickListener() {
            estatura.setText("")
        }

        btnCalcular.setOnClickListener {
            pesoTemp = peso.text.toString().toDouble()
            estaturaTemp = estatura.text.toString().toDouble()

            valorIMC = ((pesoTemp) / (Math.pow(estaturaTemp, 2.0)))

            imc.visibility = View.VISIBLE
            imc.setText(valorIMC.toString())

            setRango(valorIMC, range)

        }
    }

    //funciones
    fun setRango(imc : Double, view : TextView){
      if (imc < 18.5){
          view.setText("Bajo Peso")
          view.setBackgroundResource(R.color.colorYellow)
      }else if(imc in 18.5 .. 24.9){
          view.setText("Normal")
          view.setBackgroundResource(R.color.colorGreen)
      }else if (imc in 25.0 .. 29.9){
          view.setText("Sobrepeso")
          view.setBackgroundResource(R.color.colorOrange)
      }else if(imc in 30.0 .. 34.9){
          view.setText("Obesidad grado 1")
          view.setBackgroundResource(R.color.colorOrange)
      }else if (imc in 35.0 .. 39.9){
          view.setText("Obesidad grado 2")
          view.setBackgroundResource(R.color.colorBrown)
      }else if (imc >= 40.0){
          view.setText("Obesidad grado 3")
          view.setBackgroundResource(R.color.colorRed)
      }


        view.visibility = View.VISIBLE
    }


}