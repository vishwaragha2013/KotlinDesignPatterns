package com.test.design.pattern.chainofresponsibility

interface Handler {
    fun handle(request: Request): Response
}