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
class prblm01{
    public static void main(String[] args) {
        Box ob1=new Box(4,5,6);
        float j=ob1.getarea();
        float k=ob1.getvolume();
        System.out.println("Using parameter: ");
        System.out.println("area =" + j +" volume =" + k);
        Box ob2=new Box();
        ob2.setwidth(7);
        ob2.setheight(8);
        ob2.setlength(9);
        float p=ob2.getwidth();
        float q=ob2.getheight();
        float r=ob2.getlength();
        float s=ob2.getarea();
        float t=ob2.getvolume();
        System.out.println("\nUsing constructor: ");
        System.out.println("width =" + p +" height =" + q +" length =" + r );
        System.out.println("area =" + s +" volume =" + t );
    }
}