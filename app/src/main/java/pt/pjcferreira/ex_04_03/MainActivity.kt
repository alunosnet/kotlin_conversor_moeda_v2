package pt.pjcferreira.ex_04_03

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import pt.pjcferreira.ex_04_03.databinding.ActivityMainBinding

/*
* Exercício 04 03
* Paulo Ferreira
* */

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //converter para dolares
        binding.buttonConverterDolares.setOnClickListener {
            if (binding.editValorEuros.text.toString()=="")
            {
                Toast.makeText(applicationContext,"Erro: indique o valor a converter",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            var euros=binding.editValorEuros.text.toString().toDouble()
            var dolares=euros * 1.2;
            var mensagem=dolares.toString() + "$"
            Toast.makeText(applicationContext,mensagem,Toast.LENGTH_SHORT).show()
        }
        //converter para reais
        binding.buttonConverterReais.setOnClickListener {
            if (binding.editValorEuros.text.toString()=="")
            {
                Toast.makeText(applicationContext,"Erro: indique o valor a converter",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            var euros=binding.editValorEuros.text.toString().toDouble()
            var reais=euros * 4.4;
            var mensagem=reais.toString() + "R$"
            Toast.makeText(applicationContext,mensagem,Toast.LENGTH_SHORT).show()
        }
        //converter para pesos
        binding.buttonConverterPesos.setOnClickListener {
            if (binding.editValorEuros.text.toString()=="")
            {
                Toast.makeText(applicationContext,"Erro: indique o valor a converter",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            var euros=binding.editValorEuros.text.toString().toDouble()
            var pesos=euros * 31.5;
            var mensagem=pesos.toString() + "$"
            Toast.makeText(applicationContext,mensagem,Toast.LENGTH_SHORT).show()
        }

    }

}