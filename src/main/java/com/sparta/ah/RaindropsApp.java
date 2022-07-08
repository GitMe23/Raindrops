package com.sparta.ah;

// Please refer to readme.md for details

public class RaindropsApp
{

    public static String getRaindrops(int userNumber) {

        StringBuilder answer = new StringBuilder();

        if(userNumber % 3 == 0){
            answer.append("Pling");
        }
        if(userNumber % 5 == 0) {
            answer.append("Plang");
        }
        if(userNumber % 7 == 0) {
            answer.append("Plong");
        }

        if(answer.isEmpty()) {
            return Integer.toString(userNumber);
        } else {
            return answer.toString();
        }

    }



}

