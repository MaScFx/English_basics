package com.google.bilous.`in`.englishbasics.ui.tenses_perfect_continuous

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.bilous.`in`.englishbasics.databinding.TensesPerfectContinuousFragmentBinding

class PerfectContinuousFragment: Fragment() {
    private lateinit var mBinding: TensesPerfectContinuousFragmentBinding
    private lateinit var viewModel: PerfectContinuousViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding= TensesPerfectContinuousFragmentBinding.inflate(inflater,container,false)
        viewModel = ViewModelProvider(this).get(PerfectContinuousViewModel::class.java)
        viewModel.text.observe(viewLifecycleOwner,{text-> mBinding.tensesPerfectContinuousText.text=text?:"null"})
        return mBinding.root
    }
}