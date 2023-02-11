package com.example.rolodex.model

import androidx.annotation.DrawableRes

data class Contact(val Name: String, var phoneNumber: String,var email: String = "", @DrawableRes var Image: Int = 0)
