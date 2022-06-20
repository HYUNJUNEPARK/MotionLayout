package com.june.mymotionlayout.fragment

import com.june.mymotionlayout.R
import com.june.mymotionlayout.databinding.FragmentChangingAttributeBinding

class ChangingAttributeFragment : BaseFragment<FragmentChangingAttributeBinding>(R.layout.fragment_changing_attribute) {
    companion object {
        fun newInstance(): ChangingAttributeFragment {
            return ChangingAttributeFragment()
        }
    }
}