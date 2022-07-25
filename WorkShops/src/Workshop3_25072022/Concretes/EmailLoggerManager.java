package Workshop3_25072022.Concretes;

import Workshop3_25072022.Abstracts.EmailLoggerService;

public class EmailLoggerManager implements EmailLoggerService {
    @Override
    public void log(String message) {
        System.out.println(message+" logged with Email");
    }
}
