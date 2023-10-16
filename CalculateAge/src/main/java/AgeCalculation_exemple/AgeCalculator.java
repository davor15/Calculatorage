package AgeCalculation_exemple;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static long calculateAgeInDays(String birthdate) {
        LocalDate birthDate = LocalDate.parse(birthdate);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getDays() + period.getMonths() * 30 + period.getYears() * 365;
    }
}
