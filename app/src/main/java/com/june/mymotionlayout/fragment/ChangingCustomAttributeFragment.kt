package com.june.mymotionlayout.fragment

import com.june.mymotionlayout.R
import com.june.mymotionlayout.databinding.FragmentChangingCustomAttributeBinding

class ChangingCustomAttributeFragment :
    BaseFragment<FragmentChangingCustomAttributeBinding>(R.layout.fragment_changing_custom_attribute) {
    companion object {
        fun newInstance(): ChangingCustomAttributeFragment {
            return ChangingCustomAttributeFragment()
        }
    }
}