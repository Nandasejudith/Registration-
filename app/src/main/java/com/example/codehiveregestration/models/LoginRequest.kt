package com.example.codehiveregestration.models

import com.google.gson.annotations.SerializedName

data class LoginRequest(    var message:String,
                            @SerializedName("student_token")
                            var accessToken:String,
                            @SerializedName("student_Id")
                            var studentId:String,
                            var Email:String,
                            var  password:String
)
