package com.june.mymotionlayout.fragment

import com.june.mymotionlayout.R
import com.june.mymotionlayout.databinding.FragmentModifyingPathBinding

class ModifyingPathFragment : BaseFragment<FragmentModifyingPathBinding>(R.layout.fragment_modifying_path) {
    companion object {
         fun newInstance() : ModifyingPathFragment {
             return ModifyingPathFragment()
         }
    }
}