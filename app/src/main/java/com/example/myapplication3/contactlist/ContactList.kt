package com.example.myapplication3.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication3.Model.Contact
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.activity_contact_list.*

class ContactList : AppCompatActivity() {
    var contactAdapter=ContactListAdopter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)


        contactrecyclerview.apply {

            layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)


            adapter=contactAdapter
        }
        getcontactlist()
    }

    private fun getcontactlist() {
        var contactlist= arrayListOf<Contact>()
        contactlist.add(Contact("Faryad Bhai","03187188154","Home"))
        contactlist.add(Contact("Hamid Ali","03461301290","Personal"))
        contactlist.add(Contact("Saad Ahmed","03490170040","University"))
        contactlist.add(Contact("Faisal Mughal","03164132613","Work"))
        contactlist.add(Contact("Aslaan Awan","03323700830","Main"))
        contactlist.add(Contact("Abdullah Tariq","03097383593","Mobile"))
        contactlist.add(Contact("Hassan Gujjar","03075787570","Work"))
        contactlist.add(Contact("Awais Sahi","03214847004","University"))
        contactlist.add(Contact("Bilal Shah","03358662020","Main"))
        contactlist.add(Contact(" CH Sheroz","03009700919","College"))
        contactlist.add(Contact("Mohsin","03321431718","Work"))
        contactlist.add(Contact("Sohail Rana","03484030560","Mobile"))
        contactlist.add(Contact("Sheraz Bajwa","03464601290","Home"))
        contactAdapter.getcontactListFromActivity(contactlist)
    }
}