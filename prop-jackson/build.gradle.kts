description = "Jackson implementation of ParserFactory"

dependencies {
    api(project(":prop-core"))
    api(libs.jackson.databind)
    api(libs.jackson.module.kotlin)
    implementation(libs.moneta)
}
