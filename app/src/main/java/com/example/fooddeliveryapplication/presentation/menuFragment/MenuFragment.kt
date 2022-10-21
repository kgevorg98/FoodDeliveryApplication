package com.example.fooddeliveryapplication.presentation.menuFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddeliveryapplication.databinding.MenuFragmentBinding
import com.example.fooddeliveryapplication.presentation.adapters.BannerAdapter
import com.example.fooddeliveryapplication.presentation.adapters.CategoryAdapter
import com.example.fooddeliveryapplication.presentation.adapters.MealAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel
class MenuFragment : Fragment() {

    private var _binding:MenuFragmentBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MenuFragmentViewModel by viewModel()

    private lateinit var bannerAdapter: BannerAdapter
    private var mealAdapter = MealAdapter()
    private lateinit var categoryAdapter: CategoryAdapter



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MenuFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
    

    private fun initRecycler() {
        with(binding) {
            rvMeals.run {
                context?.let { context ->
                    adapter = mealAdapter
                    layoutManager =
                        LinearLayoutManager(
                            context,
                            LinearLayoutManager.VERTICAL,
                            false
                        )
                }
                viewModel.pizzas.observe(viewLifecycleOwner){result ->
                    mealAdapter.submitList(result.data)
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bannerAdapter = BannerAdapter()
        binding.rvBanner.adapter = bannerAdapter
        bannerAdapter.submitList(bannerModels)
        binding.rvMeals.adapter = mealAdapter
        categoryAdapter = CategoryAdapter()
        binding.vpCategories.adapter = categoryAdapter
        categoryAdapter.submitList(categoryModels)
        initRecycler()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}