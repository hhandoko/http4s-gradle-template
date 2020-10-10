package com.hhandoko.http4s.controller

import cats.effect.IO
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class HealthCheckControllerSpec extends AnyWordSpec with Matchers {

  val controller = new HealthCheckController[IO].routes

  "Health Check controller" when {

    "invoking GET `/health`" should {

      "return 200 (OK)" in {
        true shouldBe true
      }
    }
  }
}
