package academy.learnprogramming.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String getHelloMessege(String user) {
        return "Hello"+user;
    }

    @Override
    public String getWelcomeMessege() {
        return "Welcome to Demo application.";
    }
}
