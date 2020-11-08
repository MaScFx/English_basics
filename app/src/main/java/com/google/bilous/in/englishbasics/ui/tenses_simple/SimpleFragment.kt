package com.google.bilous.`in`.englishbasics.ui.tenses_simple

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import androidx.viewbinding.ViewBinding
import com.google.bilous.`in`.englishbasics.R
import com.google.bilous.`in`.englishbasics.databinding.TensesSimpleFragmentBinding

class SimpleFragment : Fragment() {
    private lateinit var simpleViewModel: SimpleViewModel
    private lateinit var mBinding: TensesSimpleFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        simpleViewModel =ViewModelProvider(this).get(SimpleViewModel::class.java)
        mBinding = TensesSimpleFragmentBinding.inflate(inflater,container,false)
        simpleViewModel.text.observe(viewLifecycleOwner,{text-> mBinding.tensesSimpleText.text=text ?:"null"})
        return mBinding.root
    }

}