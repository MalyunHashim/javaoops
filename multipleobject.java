package javaoops;

public class multipleobject {

    float height;
    String skincolour;
    String name;

    public static void main(String[]arg){
   multipleobject M=new multipleobject();
   multipleobject F=new multipleobject();
   M.height=5.5f;
   M.skincolour="white brown";
   M.name="malyun";
   F.height=5.6f;
   F.skincolour="white";
   F.name="fardowsa";
        System.out.println("the persons name is: "+F.name);
        System.out.println(F.skincolour);
        System.out.println(F.height);
        System.out.println(M.name);
        System.out.println(M.height);
        System.out.println(M.skincolour);

    }
}
