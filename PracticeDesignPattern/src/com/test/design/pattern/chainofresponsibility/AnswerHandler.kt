package com.test.design.pattern.chainofresponsibility

class AnswerHandler : Handler {
    override fun handle(request: Request): Response {
        return Response("Jenkins is not working")
    }
}