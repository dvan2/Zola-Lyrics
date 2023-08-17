package com.example.lyrics.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.lyrics.databinding.FragmentHomeBinding
import java.io.InputStream

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        /*



            val inputStream: InputStream? = context?.assets?.open("nongtel.txt")
                ?: null
            val text = inputStream?.bufferedReader().use { it?.readText() }

            textView.text = text

         */


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}