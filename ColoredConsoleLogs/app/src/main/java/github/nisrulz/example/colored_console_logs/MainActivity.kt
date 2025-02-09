package github.nisrulz.example.colored_console_logs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import github.nisrulz.example.colored_console_logs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            setupUi(this)
        }
    }

    private fun setupUi(binding: ActivityMainBinding) {
        binding.apply {
            textView.text = "Hello World!"
        }
    }
}
