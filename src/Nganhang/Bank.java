package Nganhang;

public class Bank {

    public static String checkBank(int age, double income, int creditScore, char employment){

        if(age < 18 || age > 65){
            return "Invalid Input";
        }

        if(income < 5.0 || income > 500.0){
            return "Invalid Input";
        }

        if(creditScore < 300 || creditScore > 850){
            return "Invalid Input";
        }

        if(employment != 'C' && employment != 'F'){
            return "Invalid Input";
        }

        if(creditScore >= 300 && creditScore <= 500){
            return "REJECT";
        }

        if(creditScore >= 501 && creditScore <= 700){

            if(income < 15.0){
                return "REJECT";
            }

            if(employment == 'C'){
                return "APPROVE";
            }

            return "MANUAL REVIEW";
        }

        if(creditScore >= 701 && creditScore <= 850){

            if(income < 15.0){

                if(employment == 'C'){
                    return "MANUAL REVIEW";
                }

                return "REJECT";
            }

            if(employment == 'C'){
                return "APPROVE";
            }

            return "MANUAL REVIEW";
        }

        return "Invalid Input";
    }
}