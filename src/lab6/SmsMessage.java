package lab6;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class SmsMessage{
    private String phoneNumber;
    private String message;
}