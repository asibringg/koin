package com.example.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.data.model.User
import com.example.framework.mvvm.R
import com.example.ui.main.viewholders.UserViewHolder

class MainAdapter : ListAdapter<User, UserViewHolder>(object : DiffUtil.ItemCallback<User>() {
    override fun areItemsTheSame(oldItem: User, newItem: User) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: User, newItem: User) = oldItem.id == newItem.id

}) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))


    override fun onBindViewHolder(viewHolder: UserViewHolder, position: Int) = viewHolder.bind(getItem(position))
}