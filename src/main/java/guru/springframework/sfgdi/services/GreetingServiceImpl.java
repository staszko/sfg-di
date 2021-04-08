package guru.springframework.sfgdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHallo() {
        return "Hello World!";
    }
}
