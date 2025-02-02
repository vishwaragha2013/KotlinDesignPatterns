package com.test.design.pattern.prototype

val allUsers = mutableListOf(User("Joy", Role.ADMIN), User("SAM", Role.SUPER_ADMIN))

fun main() {
    println("Before creating new user = $allUsers")
    createUser("ALEX", Role.ADMIN)
    println("==================================")
    println("After creating new user = $allUsers")
}

fun createUser(_name: String, role: Role) {
    for (u in allUsers) {
        if (u.role == role) {
            allUsers += u.copy(name = _name)
            return
        }
    }
}