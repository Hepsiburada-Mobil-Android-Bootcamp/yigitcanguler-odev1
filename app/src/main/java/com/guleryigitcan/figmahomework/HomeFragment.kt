package com.guleryigitcan.figmahomework

import Adapter.Food_RecyclerView
import Data.food_category_data
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private  lateinit var recyclerView: RecyclerView
    private  lateinit var  adapter: Food_RecyclerView
    private lateinit var newArrayList: ArrayList<food_category_data>
    lateinit var imageId:Array<Int>
    lateinit var heading:Array<String>

    val listData:ArrayList<food_category_data> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)
        imageId= arrayOf(R.drawable.all_food_icon,
            R.drawable.pizza_icon,
            R.drawable.chinese_icon,
            R.drawable.beverages_icon)

        heading= arrayOf("All","Pizza","Asian","Drinks")

        //buildDisplayData()
        initRecyclerView(view)
        return  view
    }

    private fun initRecyclerView(view:View){
        recyclerView=view.findViewById(R.id.recyclerView)
        //adapter= Food_RecyclerView(listData,this)

        recyclerView.layoutManager=LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        //recyclerView.adapter=adapter

        newArrayList= arrayListOf<food_category_data>()
        buildDisplayData()
    }

    private fun buildDisplayData(){

        for(i in imageId.indices){
            val foods=food_category_data(heading[i],imageId[i])
            newArrayList.add(foods)
        }
        recyclerView.adapter=Food_RecyclerView(newArrayList)

    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


}