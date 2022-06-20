package com.june.mymotionlayout.fragment

import com.june.mymotionlayout.R
import com.june.mymotionlayout.databinding.FragmentTouchEventBinding

class TouchEventFragment : BaseFragment<FragmentTouchEventBinding>(R.layout.fragment_touch_event) {
    companion object {
        fun newInstance(): TouchEventFragment {
            return TouchEventFragment()
        }
    }
}