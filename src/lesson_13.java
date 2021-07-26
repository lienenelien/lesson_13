public class lesson_13 {

    public static void main(String[] args) {

        String firstString = "Hello there!";
        String secondString = "Hello there!";

        String lorremIpsumString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        //Length
        System.out.println("Length of Lorem Ipsum string is: "+ lorremIpsumString.length());

        //Value at a specific place
        System.out.println("Charachter at position 345 is: " +lorremIpsumString.charAt(345));

        //Are strings identical true/false
        System.out.println("These two variables are identical: " +firstString.equals((lorremIpsumString)));
        System.out.println("These two variables are identical: " +firstString.equals((secondString)));

        String lowerCaseName = "liene";
        String capitalCaseName = "Liene";
        //equalsIgnoreCase doesn't consider capital letters as a difference
        System.out.println("Case sensitive equals method: " + lowerCaseName.equals(capitalCaseName));
        System.out.println("Case insensitive equals method: " + lowerCaseName.equalsIgnoreCase(capitalCaseName));


        //  MATCHES - verifies if the String corresponds to a specific mask (mask is prepares using Regex)
        // example - "find"
        //REGEX + matches()

        lorremIpsumString.matches("Lorem.*");
        System.out.println("This should match the word - Lorem: " + lorremIpsumString.matches("Lorem.*"));

        //REGEX start of the string
        lorremIpsumString.matches("^Lorem.*");
        //end with some text
        lorremIpsumString.matches("Lorem$");



        //System a> System b /some data
        String measurementA = "10";
        //cannot do match with a String type. Need to convert it. //PARSING

        int parsedMeasurementA = Integer.parseInt(measurementA);
        //remember to use a capital letter after =

        System.out.println("Measurement was: " + parsedMeasurementA);


        //-----------missing code----------------------------------------------------


//        if (firstString.charAt(0) == "H"){
//            System.out.println("Variable starts with the letter H");
//        } else {
//            System.out.println("Vaiable does not start with the letter H");
//        }

        String trueVar = "true";

        if (Boolean.parseBoolean(trueVar)){
            System.out.println("variable trueVar consists of TRUE");
        }
        String falseVar = "false";

        if (Boolean.parseBoolean(falseVar)){
            System.out.println("this condition will never execute");
        } else {
            System.out.println("but this line will be printed");
        }

        //FORMATTING  %f represents the floating number that is going to be printed out

        System.out.println(String.format("This is a simple text. And this is a floating number %f. Cool!", 108.2345f));

        //2s digits after a comma
        float float2Digits = 20461.1233456789f;
        System.out.println(String.format("here are 2 digits after a comma: %.2f",float2Digits));

        // %s - string value
        // %c - char value
        // %d - decimal value (int, byte, short...)
        // %f - float value
        //Each  % sign represents the variable after the "".

        char myChar = 'Z';
        short myShort = 1900;
        String myString = "My String";

        System.out.println(String.format("String: %s, Decimal: %d, Char: %c", myString, myShort, myChar));

        //NULL and REFFERENCES

        String myName = "Liene";
        myName = null;

        System.out.println(myName);

        //REGEX EXAMPLE

        String bankIBAN1 = "LV30UNLA0987654321231";
        String bankIBAN2 = "LV300UNLA098765432123";



        if(bankIBAN1.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{13}")){
            System.out.println("Bank IBAN1 is correct");
        }
//true
        if(bankIBAN2.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{13}")){
                System.out.println("IBAN2 is correct");
            } else {
            System.out.println("IBAN2 is incorrect");
        }
//false

        



    }
}
