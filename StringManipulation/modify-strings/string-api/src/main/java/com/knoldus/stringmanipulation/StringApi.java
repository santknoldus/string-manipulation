package com.knoldus.stringmanipulation;
public class StringApi
{
    public int getStringLength(String string){
        int length = 0;
        for(char character: string.toCharArray())
            length++;
        return length;
    }

    public String reverseString(String string){
        char[] characterArray = string.toCharArray();
        int stringLength = getStringLength(string);

        for (int index = 0; index < stringLength / 2; index++) {
            char character = characterArray[index];
            characterArray[index] = characterArray[stringLength - index - 1];
            characterArray[stringLength - index - 1] = character;
        }
        return new String(characterArray);
    }
}