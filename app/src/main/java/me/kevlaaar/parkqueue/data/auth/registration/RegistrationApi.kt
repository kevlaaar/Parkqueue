package me.kevlaaar.parkqueue.data.auth.registration

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

const val API_ENDPOINT_REGISTRATION = "/api/register"

interface RegistrationApi {
    @POST(API_ENDPOINT_REGISTRATION)
    fun register(
        @Body registrationSubmittedEntity: RegistrationSubmittedEntity): Response<RegisteredEntity>

}