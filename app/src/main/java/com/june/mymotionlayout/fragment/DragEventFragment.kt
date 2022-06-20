package com.june.mymotionlayout.fragment

import com.june.mymotionlayout.R
import com.june.mymotionlayout.databinding.FragmentDragEventBinding

class DragEventFragment : BaseFragment<FragmentDragEventBinding>(R.layout.fragment_drag_event) {
    companion object {
        fun newInstance(): DragEventFragment {
            return DragEventFragment()
        }
    }
}