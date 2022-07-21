package com.github.xiaoyinxu.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.xiaoyinxu.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
