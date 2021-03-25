class Box{
    float width,height,length;
    Box(){}
    Box(float w,float h,float l){
        width=w;
        height=h;
        length=l;
    }
    void setwidth(float w){
        width=w;
    }
    void setheight(float h){
        height=h;
    }
    void setlength(float l){
        length=l;
    }
    float getwidth(){
        return width;
    }
    float getheight(){
        return height;
    }
    float getlength(){
        return length;
    }
    float getarea(){
        return width*height;
    }
    float getvolume(){
        return width*height*length;
    }
}
class First{
    public static void main(String[] args) {
        Box ob1=new Box(2,3,4);
        float x=ob1.getarea();
        float y=ob1.getvolume();
        System.out.println("Using parameterized constructor");
        System.out.println("area =" + x +" volume =" + y);
        Box ob2=new Box();
        ob2.setwidth(4);
        ob2.setheight(5);
        ob2.setlength(6);
        float m=ob2.getwidth();
        float n=ob2.getheight();
        float o=ob2.getlength();
        float p=ob2.getarea();
        float q=ob2.getvolume();
        System.out.println("\nUsing constructor");
        System.out.println("width =" + m +" height =" + n +" length =" + o);
        System.out.println("area =" + p +" volume =" + q);
    }
}