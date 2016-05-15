package com.gatehill.example

import io.vertx.core.AbstractVerticle
import io.vertx.core.Future
import io.vertx.core.http.HttpServer
import io.vertx.core.json.Json
import io.vertx.ext.web.Router

/**
 * @author Pete Cornish {@literal <outofcoffee@gmail.com>}
 */
class ExampleVerticle : AbstractVerticle() {
    override fun start(startFuture: Future<Void>?) {
        val router : Router = Router.router(vertx)
        router.get("/example").handler {
            val response = mapOf("status" to "ok")
            it.response().end(Json.encodePrettily(response))
        }

        val server : HttpServer = vertx.createHttpServer()
        server.requestHandler { router.accept(it) }
        server.listen(8080, {
            if (it.succeeded()) {
                startFuture?.complete()
            } else {
                startFuture?.fail(it.cause())
            }
        })
    }
}
