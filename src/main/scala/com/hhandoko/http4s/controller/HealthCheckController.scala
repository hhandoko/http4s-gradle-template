package com.hhandoko.http4s.controller

import cats.effect.Effect
import io.circe.Json
import org.http4s.HttpRoutes
import org.http4s.circe._
import org.http4s.dsl.Http4sDsl

class HealthCheckController[F[_]: Effect] extends Http4sDsl[F] {

  final val STATUS_UP = Json.obj("status" -> Json.fromString("UP"))

  def routes: HttpRoutes[F] =
    HttpRoutes.of[F] { case GET -> Root =>
      Ok(STATUS_UP)
    }
}
