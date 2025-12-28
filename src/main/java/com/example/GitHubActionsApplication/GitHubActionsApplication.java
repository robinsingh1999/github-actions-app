package com.example.GitHubActionsApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to GitHub Actions!!";
    }

//    echo "# github-actions-app" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/robinsingh1999/github-actions-app.git
//    git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionsApplication.class, args);
	}

}
