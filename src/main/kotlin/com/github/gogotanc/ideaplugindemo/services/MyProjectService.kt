package com.github.gogotanc.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.gogotanc.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
