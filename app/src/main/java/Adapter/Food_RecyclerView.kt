package Adapter

import Data.food_category_data
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guleryigitcan.figmahomework.R

class Food_RecyclerView(val listData: List<food_category_data>) :RecyclerView.Adapter<Food_RecyclerView.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.food_type_row,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem=listData.get(position)
        holder.titleTextView.text=listData.get(position).title

        holder.food_icon.setImageResource(currentItem.titleImage)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var titleTextView: TextView
        var food_icon: ImageView

        init {
            titleTextView=itemView.findViewById(R.id.food_category_text)
            food_icon=itemView.findViewById(R.id.food_category_icon)
        }

    }


}