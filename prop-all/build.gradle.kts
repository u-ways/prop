description = "Dynamic properties for your Java app"

dependencies {
    api(project(":prop-core"))
    api(project(":prop-guice"))
    api(project(":prop-jackson"))
    api(project(":prop-commons-config"))
    implementation(libs.moneta)
}
