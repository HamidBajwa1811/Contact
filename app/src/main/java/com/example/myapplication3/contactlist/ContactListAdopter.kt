package com.example.myapplication3.contactlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.Model.Contact
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.item_view_list.view.*

class ContactListAdopter:RecyclerView.Adapter<ContactListAdopter.ContactVH>() {
    lateinit var finalcontactlist:ArrayList<Contact>
    class ContactVH(view:View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactVH {
val contactview=LayoutInflater.from(parent.context).inflate(R.layout.item_view_list,parent,false)
return ContactVH(contactview)
    }

    override fun onBindViewHolder(holder: ContactVH, position: Int) {
        val contact=finalcontactlist[position]
        holder.itemView.Name.text=contact.contactname
        holder.itemView.phoneno.text=contact.contactno
        holder.itemView.label.text=contact.contactlabel

    }

    override fun getItemCount(): Int {
        return finalcontactlist.count()
    }
    fun getcontactListFromActivity(contactList: ArrayList<Contact>){
        finalcontactlist=contactList
    }
}