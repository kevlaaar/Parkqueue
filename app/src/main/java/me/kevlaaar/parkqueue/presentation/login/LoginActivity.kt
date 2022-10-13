package me.kevlaaar.parkqueue.presentation.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.kevlaaar.parkqueue.databinding.ActivityLoginBinding
import me.kevlaaar.parkqueue.presentation.registration.RegistrationDialogFragment

class LoginActivity: AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textViewRegisterPrompt.setOnClickListener{
            showRegisterBottomSheet()
        }
    }

    private fun showRegisterBottomSheet() {
        val registerBottomSheetDialogFragment = RegistrationDialogFragment()
        registerBottomSheetDialogFragment.show(supportFragmentManager, RegistrationDialogFragment.TAG)
    }
}