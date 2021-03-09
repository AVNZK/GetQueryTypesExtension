package com.github.avnzk.getquerytypesextension.services

import com.github.avnzk.getquerytypesextension.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
