package com.company;

class NumberConvertor
{
    int number;
    NumberConvertor(int n)
    {
        number=n;
    }
    int getnumber()
    {
        return number;
    }
    void setnumber(int n){
        number =n;
    }

    String toHex(){
        return Integer.toHexString(number);
    }
    String toBinary(){
        return  Integer.toBinaryString(number);
    }
    String toOctal(){
        return  Integer.toOctalString(number);
    }

}

class Converson
{
    public static void main(String[] args){
        NumberConvertor c1=new NumberConvertor(11);
        String rslt=c1.toBinary();
        System.out.println("BINARY : "+rslt);
        NumberConvertor c2=new NumberConvertor(75);
        String reslt=c2.toHex();
        System.out.println("HEXADECIMAL : "+reslt);
        NumberConvertor c3=new NumberConvertor(76);
        String result=c3.toOctal();
        System.out.println("OCTAL : "+result);
    }
}