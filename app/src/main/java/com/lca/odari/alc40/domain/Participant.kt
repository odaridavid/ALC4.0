package com.lca.odari.alc40.domain

/**
 * Created By David Odari
 * On 12/07/19
 *
 **/
data class Participant(
    val name: String,
    val track: String,
    val country: String,
    val email: String,
    val phoneNumber: String,
    val username: String,
    val imageLink: String
)
