package com.example.ui.main.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.data.model.User
import kotlinx.android.synthetic.main.item_layout.view.*

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(user: User) {
        itemView.textViewUserName.text = user.name
        itemView.textViewUserEmail.text = user.email
        Glide.with(itemView.imageViewAvatar.context)
            .load(user.avatar)
            .into(itemView.imageViewAvatar)
    }
}