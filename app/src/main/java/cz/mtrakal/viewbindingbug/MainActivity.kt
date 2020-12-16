package cz.mtrakal.viewbindingbug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cz.mtrakal.viewbindingbug.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lIncludedLayoutContainer.vIncludedLayout.text = "Included layout"
//        binding.lIncludedMerge.vIncludedMerge.text = "Included merge"
    }
}