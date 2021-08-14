package Person;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    private String
            firstName="Nikola",
            lastName="Tesla",
            gender="Male",
            mobile="5555555555",
            date="11 July,1856";


    private ArrayList<String> data = new ArrayList<>(
            Arrays.asList(firstName + " " + lastName , gender , mobile , date)
    );

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGender(){
        return gender;
    }

    public String getMobile(){
        return mobile;
    }

    public String getDate(){
        return date;
    }

    public ArrayList<String> getExpectedData(){
        return data;
    }

}
