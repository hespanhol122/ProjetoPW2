package br.com.etecmatao.biblioteca

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyManager
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {

    lateinit var campoNome:TextInputEditText
    lateinit var campoEmail:TextInputEditText
    lateinit var campoSenha:TextInputEditText
    lateinit var campoConfirma:TextInputEditText
    lateinit var campoTelefone:TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        campoNome = findViewById(R.id.input_nome)
        campoEmail = findViewById(R.id.input_email)
        campoSenha = findViewById(R.id.input_senha)
        campoConfirma = findViewById(R.id.input_confirmacao)
        campoTelefone = findViewById(R.id.input_telefone)


        
    }

    fun salvar(v:View){
        if (!valida()){
            return
        }

        Toast.makeText(this, getString(R.string.msg_registro_salvo), Toast.LENGTH_SHORT).show()
    }

    fun valida():Boolean{
        var result = true

        campoNome.error = null
        campoEmail.error = null
        campoSenha.error = null
        campoConfirma.error = null

        if (TextUtils.isEmpty(campoNome.text.toString())){
            campoNome.error = getString(R.string.msg_campo_obrigatorio)
            result = false
        }

        if (TextUtils.isEmpty(campoEmail.text.toString())){
            campoEmail.error = getString(R.string.msg_campo_obrigatorio)
            result = false
        }
        if (TextUtils.isEmpty((campoSenha.text.toString()))){
            campoSenha.error = getString(R.string.msg_campo_obrigatorio)
            result = false
        }
        if (campoSenha.text.toString() != campoConfirma.text.toString()){
            campoConfirma.error = getString(R.string.msg_error_senha)
            result = false
        }

        return result
    }
}
