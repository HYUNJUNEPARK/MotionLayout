package com.june.mymotionlayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.june.mymotionlayout.R
import com.june.mymotionlayout.databinding.FragmentDragEventBinding

class DragEventFragment : BaseFragment<FragmentDragEventBinding>(R.layout.fragment_drag_event) {
    override fun initView() {
        super.initView()
    }

    companion object {
        fun newInstance(): DragEventFragment {
            return DragEventFragment()
        }
    }
}