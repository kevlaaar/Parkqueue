package me.kevlaaar.parkqueue.data.auth.registration

data class RegistrationSubmittedEntity(
    val email: String,
    val password: String,
    val name: String,
    val surname: String
)
