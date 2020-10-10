import cats.effect.{ExitCode, IO, IOApp}

import com.hhandoko.http4s.Server

object Application extends IOApp {

  override def run(args: List[String]): IO[ExitCode] =
    Server
      .resource[IO]
      .use(_ => IO.never)
      .as(ExitCode.Success)
}
