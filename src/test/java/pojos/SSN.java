package pojos;

import com.github.javafaker.Faker;

public class SSN {
    private String SSN_Number;
    private String SSN_NumberWithHyphen;

    public SSN (String SSN_Number, String SSN_NumberWithHyphen) {
//        Faker faker = new Faker();
//        SSN_Number = faker.number().digits(9);
//        SSN_NumberWithHyphen =
//                SSN_Number.substring(0,2)+"-"+
//                        SSN_Number.substring(2,4)+"="+
//                        SSN_Number.substring(5);
        this.SSN_Number = SSN_Number;
          this.SSN_NumberWithHyphen = SSN_NumberWithHyphen;
    }
    Faker faker = new Faker();

    public SSN() {

    }

    public String returnSSNwithHyphen () {
        SSN_Number = faker.number().digits(9);
        String ssnNum = SSN_Number;
        SSN_NumberWithHyphen =
                ssnNum.substring(0,2)+"-"+
                        ssnNum.substring(2,4)+"-"+
                        ssnNum.substring(5);
        //  this.SSN_Number = SSN_Number;
        //    this.SSN_NumberWithHyphen = SSN_NumberWithHyphen;
        return SSN_NumberWithHyphen;
    }

    public String getSSN_Number() {
        return SSN_Number;
    }

    public void setSSN_Number(String SSN_Number) {
        this.SSN_Number = SSN_Number;
    }

    public String getSSN_NumberWithHyphen() {
        return SSN_NumberWithHyphen;
    }

    public void setSSN_NumberWithHyphen(String SSN_NumberWithHyphen) {
        this.SSN_NumberWithHyphen = SSN_NumberWithHyphen;
    }

    @Override
    public String toString() {
        return "SSN{" +
                "SSN_Number='" + SSN_Number + '\'' +
                ", SSN_NumberWithHyphen='" + SSN_NumberWithHyphen + '\'' +
                '}';
    }
//        public  SSN() {
//    Faker faker = new Faker();
//     SSN_Number = faker.number().digits(9);
//     String SSN_NumberWithHyphen =
//             SSN_Number.substring(0,2)+"-"+
//             SSN_Number.substring(2,4)+"="+
//             SSN_Number.substring(5);
//
//        }


}
