package com.hhandoko.http4s

import scala.concurrent.ExecutionContext

import cats.effect.{ConcurrentEffect, Effect, Resource, Timer}
import org.http4s.HttpApp
import org.http4s.implicits._
import org.http4s.server.{Router, Server => BlazeServer}
import org.http4s.server.blaze.BlazeServerBuilder

import com.hhandoko.http4s.controller.HealthCheckController

object Server {

  def resource[F[_]: ConcurrentEffect: Timer]: Resource[F, BlazeServer] =
    BlazeServerBuilder[F](ExecutionContext.global)
      .bindHttp(8080)
      .withHttpApp(httpApp)
      .resource

  private[this] def httpApp[F[_]: Effect]: HttpApp[F] =
    Router(
      "/health" -> new HealthCheckController().routes
    ).orNotFound
}
