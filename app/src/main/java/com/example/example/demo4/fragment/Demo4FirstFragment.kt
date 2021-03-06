package com.example.example.demo4.fragment

import android.os.Bundle
import android.view.LayoutInflater
import com.example.example.demo4.vm.Demo4FirstViewModel
import com.capybara.mvvm.fragment.BaseFragment
import com.example.example.BR
import com.example.example.R
import com.example.example.databinding.FragmentDemo4FirstBinding

class Demo4FirstFragment : BaseFragment<FragmentDemo4FirstBinding, Demo4FirstViewModel>() {

    var position = 0

    override fun getLayoutId(inflater: LayoutInflater, savedInstanceState: Bundle?): Int =
        R.layout.fragment_demo4_first

    override fun getViewModelId(): Int = BR.viewModel

    override fun initParams() {
        super.initParams()
        position=arguments!!.getInt("position",0)
    }

    override fun initView() {
        super.initView()
        viewModel.position.value = position
    }


    companion object {
        fun newInstance(position: Int): Demo4FirstFragment {
            val fragment = Demo4FirstFragment()
            val bundle = Bundle()
            bundle.putInt("position", position)
            fragment.arguments = bundle
            return fragment
        }
    }

}