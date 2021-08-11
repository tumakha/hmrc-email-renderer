import sbt._
import play.sbt.PlayImport._
import play.core.PlayVersion

object MicroServiceBuild extends Build with MicroService {

  val appName = "hmrc-email-renderer"

  override lazy val appDependencies: Seq[ModuleID] = AppDependencies()
}

private object AppDependencies {
  def apply() = Seq(
    ws,
    "uk.gov.hmrc"          %% "bootstrap-frontend-play-28" % "5.7.0",
    "uk.gov.hmrc"           %% "auth-client"         % "5.7.0-play-28",
    "uk.gov.hmrc"           %% "domain"             % "6.2.0-play-28",
    "uk.gov.hmrc"            %% "emailaddress"       % "3.5.0",
    "net.codingwell"         %% "scala-guice"        % "4.2.6",
    "com.beachape"           %% "enumeratum"         % "1.6.1",
    "org.jsoup"              % "jsoup"               % "1.13.1" % "test",
    "org.scalatestplus.play" %% "scalatestplus-play"       % "5.1.0"         % "test, it",
    "org.scalatestplus"      %% "mockito-3-4"              % "3.2.9.0"       % "test, it",
    "uk.gov.hmrc"            %% "service-integration-test" % "1.1.0-play-28" % "test, it",
    "org.pegdown"            % "pegdown"             % "1.6.0" % "test, it",
    "org.mockito"            % "mockito-core"        % "3.6.0" % "test, it",
    "com.github.tomakehurst" % "wiremock"            % "2.27.2" % "test,it"
  )
}
