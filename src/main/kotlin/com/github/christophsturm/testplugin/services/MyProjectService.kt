package com.github.christophsturm.testplugin.services

import com.intellij.openapi.project.Project
import com.github.christophsturm.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
