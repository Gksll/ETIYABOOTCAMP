package Workshop3_25072022.Concretes;

import Workshop3_25072022.Abstracts.SmsLoggerService;

public class SmsLoggerManager implements SmsLoggerService {
    @Override
    public void log(String message) {
        System.out.println(message+" logged with Sms");
    }
}
