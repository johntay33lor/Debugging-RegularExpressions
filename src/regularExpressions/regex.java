package regularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        // Validating email address
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        String email = "johntaylor@gmail.com";
        String email2 = "johntaylor.gmail.com";
        boolean isEmailValid = email.matches(emailRegex);
        boolean isEmail2Valid = email2.matches(emailRegex);
        System.out.println("Is " + email + " valid? " + isEmailValid);
        System.out.println("Is " +  email2 + " valid? " + isEmail2Valid);

        // Validating phone number
        String phoneNumberRegex = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        String phoneNumber = "(123) 456-7890";
        String phoneNumber2 = "1234567890";
        boolean isPhoneNumberValid = phoneNumber.matches(phoneNumberRegex);
        boolean isPhoneNumber2Valid = phoneNumber2.matches(phoneNumberRegex);
        System.out.println("Is " + phoneNumber + " valid? " + isPhoneNumberValid);
        System.out.println("Is " + phoneNumber2 + " valid? " + isPhoneNumber2Valid);

        // Validating date
        String dateRegex = "^(0[1-9]|1[0-2])/(0[1-9]|[12]\\d|3[01])/(19|20)\\d{2}$";
        String date = "05/18/1996";
        String date2 = "05-18-1996";
        boolean isDateValid = date.matches(dateRegex);
        boolean isDate2Valid = date2.matches(dateRegex);
        System.out.println("Is " + date + " valid? " + isDateValid);
        System.out.println("Is " + date2 + " valid? " + isDate2Valid);

        // Validating URL
        String urlRegex = "^(http|https)://([a-zA-Z0-9]+\\.)+[a-zA-Z]{2,}$";
        String url = "https://www.example.com";
        String url2 = "example.com";
        boolean isUrlValid = url.matches(urlRegex);
        boolean isUrl2Valid = url2.matches(urlRegex);
        System.out.println("Is " + url + " valid? " + isUrlValid);
        System.out.println("Is " + url2 + " valid? " + isUrl2Valid);

        // Validating credit card number
        String creditCardRegex = "\\b\\d{4}[- ]?\\d{4}[- ]?\\d{4}[- ]?\\d{4}\\b";
        String creditCardNumber = "1234-5678-9012-3456";
        String creditCardNumber2 = "1234/5678/9012/3456";
        boolean isCreditCardValid = creditCardNumber.matches(creditCardRegex);
        boolean isCreditCard2Valid = creditCardNumber2.matches(creditCardRegex);
        System.out.println("Is " + creditCardNumber + " valid? " + isCreditCardValid);
        System.out.println(("Is " + creditCardNumber2 + " valid? " + isCreditCard2Valid));

        // Validating US zip code
        String zipCodeRegex = "^\\d{5}(-\\d{4})?$";
        String zipCode = "28273";
        String zipCode2 = "28273-00";
        boolean isZipCodeValid = zipCode.matches(zipCodeRegex);
        boolean isZipCode2Valid = zipCode2.matches(zipCodeRegex);
        System.out.println("Is " + zipCode + " valid? " + isZipCodeValid);
        System.out.println("Is " + zipCode2 + " valid? " + isZipCode2Valid);

        // Validating Java identifier
        String javaIdentifierRegex = "^[a-zA-Z_$][a-zA-Z\\d_$]*$";
        String javaIdentifier = "myVariable";
        String javaIdentifier2 = "3myVariable";
        boolean isJavaIdentifierValid = javaIdentifier.matches(javaIdentifierRegex);
        boolean isJavaIdentifier2Valid = javaIdentifier2.matches(javaIdentifierRegex);
        System.out.println("Is " +  javaIdentifier + " valid? " + isJavaIdentifierValid);
        System.out.println("Is " + javaIdentifier2 + " valid? " + isJavaIdentifier2Valid);

        // Validating hexadecimal color code
        String colorCodeRegex = "^#([0-9a-fA-F]{6})$";
        String colorCode = "#FFC0CB";
        String colorCode2 = "FFC0CB#";
        boolean isColorCodeValid = colorCode.matches(colorCodeRegex);
        boolean isColorCode2Valid = colorCode2.matches(colorCodeRegex);
        System.out.println("Is " + colorCode + " valid? " + isColorCodeValid);
        System.out.println("Is " + colorCode2 + " valid " + isColorCode2Valid);

        // Validating time in 24-hour format
        String timeRegex = "^([01]\\d|2[0-3]):[0-5]\\d$";
        String time = "12:34";
        String time2 = "25:00";
        boolean isTimeValid = time.matches(timeRegex);
        boolean isTime2Valid = time2.matches(timeRegex);
        System.out.println("Is " + time + " valid? " + isTimeValid);
        System.out.println("Is " + time2 + " valid? " + isTime2Valid);
    }
}
