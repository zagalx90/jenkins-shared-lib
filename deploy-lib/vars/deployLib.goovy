import org.example.DeployApp1
import org.example.DeployApp2
import org.example.DeployApp3

def call(String type) {
    pipeline {
        agent any
        stages {
            stage("Deploy") {
                steps {
                    script {
                        switch (type) {
                            case "deploy1":
                                DeployApp1.run()
                                break
                            case "deploy2":
                                DeployApp2.run()
                                break
                            case "deploy3":
                                DeployApp3.run()
                                break
                            default:
                                error "❌ Invalid deploy type: ${type}"
                        }
                    }
                }
            }
        }
    }
}