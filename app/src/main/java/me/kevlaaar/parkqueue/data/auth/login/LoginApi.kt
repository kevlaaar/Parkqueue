package me.kevlaaar.parkqueue.data.auth.login

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

const val API_ENDPOINT_LOGIN = "/api/login"

interface LoginApi {

    @POST(API_ENDPOINT_LOGIN)
    fun login(@Body loginSubmittedEntity: LoginSubmittedEntity): Response<LoggedInEntity>

}