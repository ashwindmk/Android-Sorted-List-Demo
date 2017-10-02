package com.example.ashwin.sortedlistdemo;

import android.support.v7.widget.RecyclerView
import com.example.ashwin.sortedlistdemo.data.User
import com.example.ashwin.sortedlistdemo.wrapper.SortedListComparatorWrapper

/**
 * Created by Ashwin Dinesh on 19/09/2017.
 */

class UserSortedListImpl(adapter: RecyclerView.Adapter<*>) : SortedListComparatorWrapper<User>(adapter, UserSortedListImpl.DEFAULT_ORDER) {

    companion object {
        private val DEFAULT_ORDER = Order.ScoreOrder()
    }

    override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
        return oldItem == newItem
    }

    override fun areItemsTheSame(item1: User, item2: User): Boolean {
        return item1.id == item2.id
    }
}
