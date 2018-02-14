import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        //String and Variable
        Scanner scnr = new Scanner(System.in);
        String userInput;
        long decimalNum=0;
        int lenString=0;
        int lennString;
        int position=0;
        int indx=1;
        String nString;
        char character='0';
        int characterValue=0;
        int power=0;
        //Prompts "Enter a hexdeciaml number: "
        System.out.print("Enter a hexadecimal number: ");
        userInput = scnr.next();
        userInput = userInput.toLowerCase();
        lenString = userInput.length();
        power = lenString;
        position = lenString;
        //Removes "0x" if in input
        if(userInput.substring(0,2).equals("0x")){
            nString = userInput.substring(2);
            lennString=nString.length();
            position = lennString;
            power=lennString;
            while (position >= 1){
                character = nString.charAt((lennString - indx));
                switch(character){
                    case 'a':
                        characterValue = 10;
                        break;
                    case 'b':
                        characterValue = 11;
                        break;
                    case 'c':
                        characterValue = 12;
                        break;
                    case 'd':
                        characterValue = 13;
                        break;
                    case 'e':
                        characterValue = 14;
                        break;
                    case 'f':
                        characterValue = 15;
                        break;
                    case '1':
                        characterValue = 1;
                        break;
                    case'2':
                        characterValue = 2;
                        break;
                    case'3':
                        characterValue = 3;
                        break;
                    case'4':
                        characterValue =4;
                        break;
                    case'5':
                        characterValue = 5;
                        break;
                    case'6':
                        characterValue = 6;
                        break;
                    case'7':
                        characterValue = 7;
                        break;
                    case'8':
                        characterValue = 8;
                        break;
                    case'9':
                        characterValue = 9;
                        break;
                }
                decimalNum += (characterValue * Math.pow(16,(lennString-power)));
                position--;
                indx++;
                power--;
            }
        }
        //Proceeds when there is no "0x" input
        else{
            while(position>=1){
                character = userInput.charAt((lenString - indx));
                //System.out.println("character"+character);
                switch(character){
                    case 'a':
                        characterValue = 10;
                        break;
                    case 'b':
                        characterValue = 11;
                        break;
                    case 'c':
                        characterValue = 12;
                        break;
                    case 'd':
                        characterValue = 13;
                        break;
                    case 'e':
                        characterValue = 14;
                        break;
                    case 'f':
                        characterValue = 15;
                        break;
                    case '1':
                        characterValue = 1;
                        break;
                    case'2':
                        characterValue = 2;
                        break;
                    case'3':
                        characterValue = 3;
                        break;
                    case'4':
                        characterValue =4;
                        break;
                    case'5':
                        characterValue = 5;
                        break;
                    case'6':
                        characterValue = 6;
                        break;
                    case'7':
                        characterValue = 7;
                        break;
                    case'8':
                        characterValue = 8;
                        break;
                    case'9':
                        characterValue = 9;
                        break;
                }
                //Formula and Incrementation
                decimalNum += (characterValue * Math.pow(16,(lenString-power)));
                position--;
                indx++;
                power--;
            }
        }
        //Prints "Your number is 'number' in decimal" 
        System.out.println("Your number is " + decimalNum + " in decimal");
        System.exit(0);
    }
}
