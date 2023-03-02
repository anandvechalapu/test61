
Controller Class:

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    @RequestMapping("/configure-jira-github")
    public String configureJiraGithub(){
        return "Configure Jira and GitHub page";
    }

}

Service Class:

import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {

    public void configureJiraGithub(){
        // code to configure Jira and GitHub
    }

}

Repository Class:

import org.springframework.data.repository.CrudRepository;

public interface ConfigurationRepository extends CrudRepository<Configuration, Long> {

}