package com.chuadev.projectmanagementapp.services;

import com.chuadev.projectmanagementapp.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// Services layer help controller deal with repo, instead of directly repo -> controller
@Service
public class ProjectService {

    // Implement the Repo logic in service instead of controller
    // Usually controller just be router, logic should be at services
    @Autowired
    private ProjectRepository projectRepository;
}
