import com.android.build.api.dsl.ApplicationExtension as AndroidApplicationExtension
import com.example.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidApplicationComposeConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("happyfeet.android.application")

            val extension = extensions.getByType<AndroidApplicationExtension>()
            configureAndroidCompose(extension)
        }
    }
}