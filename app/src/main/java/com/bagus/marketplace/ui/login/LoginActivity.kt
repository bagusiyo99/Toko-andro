package com.bagus.marketplace.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bagus.marketplace.R
import com.bagus.marketplace.databinding.ActivityLoginBinding
import com.bagus.marketplace.databinding.FragmentDashboardBinding
import com.bagus.marketplace.util.Prefs

class LoginActivity : AppCompatActivity() {

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val s = Prefs (this)
        if (s.getIsLogin()){
            binding.tvStatus.text = "Sudah Login"
        }else binding.tvStatus.text = "Belum Logout"

        binding.btnLogin.setOnClickListener {
            s.setIsLogin(true)
            onBackPressed()
        }

        binding.btnLogin.setOnClickListener {
            s.setIsLogin(true)
            onBackPressed()
        }

        Log.d("Respon", "Pesan Singkat")
    }
}