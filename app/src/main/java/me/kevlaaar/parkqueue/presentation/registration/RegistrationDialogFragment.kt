package me.kevlaaar.parkqueue.presentation.registration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import me.kevlaaar.parkqueue.R
import me.kevlaaar.parkqueue.databinding.FragmentDialogRegistrationBinding

class RegistrationDialogFragment: BottomSheetDialogFragment() {

    companion object {
        val TAG: String = RegistrationDialogFragment::class.java.simpleName
    }

    private lateinit var binding: FragmentDialogRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.AppBottomSheetDialogTheme)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDialogRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }


}