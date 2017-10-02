package com.example.ashwin.sortedlistdemo

import com.example.ashwin.sortedlistdemo.data.User
import java.util.*

/**
 * Created by Ashwin Dinesh on 19/09/2017.
 */

class Order {

    class AgeOrder : Comparator<User> {

        override fun compare(user: User, t1: User): Int {
            return user.age - t1.age
        }
    }

    class ScoreOrder : Comparator<User> {
        override fun compare(user: User, t1: User): Int {
            return user.score - t1.score
        }
    }
}
