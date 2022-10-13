package me.kevlaaar.parkqueue.presentation.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import me.kevlaaar.parkqueue.databinding.ActivitySplashScreenBinding
import me.kevlaaar.parkqueue.presentation.login.LoginActivity

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.e("tezting","hejolee")
    }

    override fun onResume() {
        super.onResume()
        lifecycleScope.launch {
            delay(1500)
            Log.e("tezting","hejolee posle sek")
            goToLoginWithTransition()
        }
    }

    private fun goToLoginWithTransition() {
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this,
            binding.textViewSplashTitle,
            "transition_title"
        )

        Log.e("tezting","hejolee tranziszn")
        startActivity(Intent(this, LoginActivity::class.java), options.toBundle())
    }
}